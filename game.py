import socket
import errno
import time
import input1
import Board
import place
import Flip
import Invalidmove
import win

GAME_PORT = 6005
# participating clients must use this port for game communication


############## GAME LOGIC ##############
b = [["" for l in range(9)] for k in range(9)]
Board.board(b)
global max_
max_=60
global i
i=0
def print_current_board(b):
  Board.display(b)

def get_users_move(i,b):
  x=input1.Input(i,b)
  return x

def update_game_state(i, x, b,max_):
  b = place.place(i, x, b)
  b = Flip.flip(b, i, x)
  Board.display(b)
  c = Flip.ctr
  if c == 0:
    i, max_, x, b = Invalidmove.invalid(i, max_, x, b)



############## EXPORTED FUNCTIONS ##############

def game_server(after_connect):
  with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as accepter_socket:
      accepter_socket.bind(('', GAME_PORT))
      accepter_socket.listen(1)

      # non-blocking to allow keyboard interupts (^c)
      accepter_socket.setblocking(False)
      while True:
        try:
          game_socket, addr = accepter_socket.accept()
        except socket.error as e:
          if e.errno == errno.EAGAIN or e.errno == errno.EWOULDBLOCK:
            time.sleep(0.1)
            continue
        break

      game_socket.setblocking(True)
      with game_socket:
        after_connect()
        print('Game Started')

        while True:

          print("waiting for opp's move")
          opp_move = game_socket.recv(1024).decode()
          if not opp_move:
            break
          update_game_state(i, opp_move,b,max_)
          i+=1
          if i==60:
            win.winner(b)
            break

          print_current_board(b)
          move = get_users_move(i,b)
          update_game_state(i, move,b,max_)
          i+=1
          game_socket.send(move.encode())
          if i==60:
            win.winner(b)
            break

      print_current_board(b)
      print('Game ended')

def game_client(opponent):
  with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as game_socket:
      game_socket.connect((opponent, GAME_PORT))
      print('Game Started')

      while True:

        print_current_board(b)
        move = get_users_move(i,b)
        update_game_state('user', move,b,max_)
        game_socket.send(move.encode())
        if i == 60:
          win.winner(b)
          break

        print("waiting for opp's move")
        opp_move = game_socket.recv(1024).decode()
        if not opp_move:
          break
        update_game_state('opp', opp_move,b,max_)
        if i == 60:
          win.winner(b)
          break

  print_current_board(b)
  print('Game ended')

