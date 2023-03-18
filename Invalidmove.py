import sys
import play1
import Board

def invalid():

    print("Invalid move\nat least one coin should flip")
    print("Enter 'R' to replay your turn")
    print("If no valid moves are available enter 'P' to pass your turn")

    while True:
        ch = input().strip().lower()
        if ch == "r":
            play1.j -= 1
            break
        elif ch == "p":
            play1.m += 1
            break
        else:
            print("Enter 'R' to replay, 'P' to pass", file=sys.stderr)

    i = play1.in_ // 10
    j = play1.in_ % 10
    play1.b1[i][j] = "_-_|"
    Board.display(play1.b1)
