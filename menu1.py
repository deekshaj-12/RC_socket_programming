import os
import sys

import play1
#from rules import instructions
#from credits1 import credits
import MAIN

def menu():
    os.system('cls' if os.name == 'nt' else 'clear')
    print("Choose one option (Enter only number)")
    x = 0
    while x not in (1, 2, 3, 4, 5):
        print("\t1. Play\n\t2. How to play?\n\t3. Credits\n\t4. Go back to main menu\n\t5. Quit")
        try:
            x = int(input())
        except ValueError:
            print("Invalid entry. Enter an integer value")
            continue
        if x not in (1, 2, 3, 4, 5):
            print("Enter a valid number")
        os.system('cls' if os.name == 'nt' else 'clear')
    if x == 1:
        play1.game()
    elif x == 2:
        print("\u000C")
        print("  Press X on the window")
        sys.exit(0)
    elif x == 3:
        print("\u000C")
        print("  Press X on the window")
        sys.exit(0)
    elif x == 4:
        MAIN.Main()
    elif x == 5:
        os.system('cls' if os.name == 'nt' else 'clear')
        print("   Press X on the Window")
        exit(0)