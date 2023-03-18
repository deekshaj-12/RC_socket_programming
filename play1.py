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
    for i in range(1, max_):
        x = input1.Input(i, b)
        b = place.place(i, x, b)
        b = Flip.flip(b, i, x)
        Board.display(b)
        c = Flip.ctr
        if c == 0:
            p1 = game()
            p1.j = i
            p1.m = max_
            p1.b1 = b
            p1.in_ = x
            Invalidmove.invalid()
            i = p1.j
            b = p1.b1
    win.winner(b)
    return i