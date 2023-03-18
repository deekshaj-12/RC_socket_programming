import sys
import menu1

def Main():
    x = 0
    print("MAIN MENU")
    print("Enter   1.To play Mastermind\n\t2.To play Othello\n\t3.Quit")
    while x != 1 and x != 2 and x != 3:
        try:
            x = int(input())
        except ValueError:
            print("Invalid Entry.Enter an integer value")
            continue
        if x != 1 and x != 2 and x != 3:
            print("Enter a valid number")
    print("\u000c")
    if x == 1:
        print("\u000C")
        print("  Press X on the window")
        sys.exit(0)
    elif x == 2:
        menu1.menu()
    elif x == 3:
        print("\u000C")
        print("  Press X on the window")
        sys.exit(0)
if __name__ == '__main__':
    Main()
