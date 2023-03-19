def Input(i, b):
    while True:
        x = input("black's turn\n" if i % 2 != 0 else "white's turn\n")
        try:
            x = int(x)
        except ValueError:
            print("Invalid entry. Enter an integer value")
            continue
        if x < 11 or x > 88 or x % 10 > 8:
            print("Invalid entry. Enter 2 digits ranging from 1 to 8")
            continue
        j = x // 10
        k = x % 10
        if b[j][k][1] != '-':
            print("A coin is already present in this position. Enter an empty position")
            continue
        return x