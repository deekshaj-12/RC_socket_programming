import sys

import play1
import menu1

def winner(b):
  w = 0
  bl = 0
  for i in range(9):
    for j in range(9):
      if b[i][j][1] == 'o':
        w += 1
      elif b[i][j][1] == 'x':
        bl += 1
  print(f"POINTS\nBlack - {bl}\nWhite - {w}")
  if w > bl:
    print("White is the winner")
  elif bl > w:
    print("Black is the winner")
  elif w == bl:
    print("Its a tie")
  print("Enter   1.To replay\n\t2.to go back to main menu")
  while True:
    try:
      y = int(input())
      if y == 1:
        play1.game()
        break
      elif y == 2:
        menu1.menu()
        break
      else:
        print("Enter a valid number")
    except ValueError:
      print("Invalid entry.Enter a valid integer value")
      sys.exit(0)