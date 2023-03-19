import sys
import Board
import input1
import place
import Flip
import Invalidmove
import win

j, m, in_val = 0, 0, 0
b1 = [["" for i in range(9)] for k in range(9)]


def game():
    b = [["" for i in range(9)] for k in range(9)]
    Board.board(b)
    Board.display(b)
    x = 0
    max_ = 60
    global i
    i = 1
    while i <= max_:
        print(i)
        x = input1.Input(i, b)
        b = place.place(i, x, b)
        b, c = Flip.flip(b, i, x)
        Board.display(b)
        if c == 0:
            b,n = Invalidmove.invalid(i, x, max_, b)
            if n == 0:
                i = i-1
            elif n == 1:
                max_ = max_+1
        i +=1
    win.winner(b)
    return i
