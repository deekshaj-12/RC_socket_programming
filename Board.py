from array import *
def board(b):
    for i in range(9):
        for j in range(9):
            b[i][j] = '_-_|'
    b[4][5] = '_o_|'
    b[5][4] = '_o_|'
    b[5][5] = '_x_|'
    b[4][4] = '_x_|'
    for i in range(9):
        b[i][0] = ' ' + str(i) + ' |'
        b[0][i] = '_' + str(i) + '_ '

def display(b1):
    for i in range(9):
        for j in range(9):
            print(b1[i][j],end="")
        print()
