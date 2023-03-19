import sys
import play1
import Board


def invalid(j, in_, m, b1):
    print("Invalid move\nat least one coin should flip")
    print("Enter 'R' to replay your turn")
    print("If no valid moves are available enter 'P' to pass your turn")
    num = 0
    while True:
        ch = input().strip().lower()
        if ch == "r":
            j -= 1
            num = 0
            break
        elif ch == "p":
            m += 1
            num = 1
            break
        else:
            print("Enter 'R' to replay, 'P' to pass", file=sys.stderr)

    l = in_ // 10
    k = in_ % 10
    b1[l][k] = "_-_|"
    Board.display(b1)
    return b1, num
