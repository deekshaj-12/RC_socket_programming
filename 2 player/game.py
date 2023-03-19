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
global i, max_


def print_current_board(b):
    Board.display(b)


def get_users_move(i, b):
    x = input1.Input(i, b)
    return int(x)


def update_game_state(i, x, b, max_):
    int(x)
    flag=0
    b = place.place(i, x, b)
    b, c = Flip.flip(b, i, x)
    if c == 0:
        flag=1
        b,n = Invalidmove.invalid(i, x, max_, b)
        if n == 0:
            i = i-1
        elif n == 1:
            max_ = max_+1
    i +=1
    return i,max_,flag

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
            b = [["" for l in range(9)] for k in range(9)]
            Board.board(b)
            max_ = 60
            i = 0
            int(i)

            while True:
                flag1=0
                flag=1
                while(flag == 1):
                    print("waiting for opp's move")
                    opp_move = game_socket.recv(1024).decode()
                    if not opp_move:
                        break
                    i,max_,flag = update_game_state(i, int(opp_move), b, max_)
                    if i == max_:
                        flag1=1
                        break
                if flag == 1:
                    win.winner(b)
                    break
                flag = 1
                while(flag == 1):
                    print_current_board(b)
                    move = get_users_move(i, b)
                    i,max_,flag=update_game_state(i, int(move), b, max_)
                    game_socket.send(str(move).encode())
                    if i == max_:
                        flag1=1
                        break
                if flag == 1:
                    win.winner(b)
                    break

        print_current_board(b)
        print('Game ended')


def game_client(opponent):
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as game_socket:
        game_socket.connect((opponent, GAME_PORT))
        print('Game Started')
        b = [["" for l in range(9)] for k in range(9)]
        Board.board(b)
        max_ = 60
        i = 0
        int(i)

        while True:
            flag1=0
            flag = 1
            while(flag == 1):
                print_current_board(b)
                move = get_users_move(i, b)
                i,max_,flag=update_game_state(i, int(move), b, max_)
                game_socket.send(str(move).encode())
                if i == max_:
                    flag1=1
                    break
            if flag1 == 1:
                win.winner(b)
                break
            flag = 1
            while(flag == 1):
                print("waiting for opp's move")
                opp_move = game_socket.recv(1024).decode()
                if not opp_move:
                    break
                int(opp_move)
                i,max_,flag=update_game_state(i, int(opp_move), b, max_)
                if i == max_:
                    flag1=1
                    break
            if flag1 == 1:
                win.winner(b)
                break

    print_current_board(b)
    print('Game ended')
