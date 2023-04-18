import java.io.*;
class rules
{
    public static void instructions()throws IOException
    {
        System.out.print("\u000c");
        System.out.println("The board will start with 2 black discs and 2 white discs at the centre of the board.\nThey are arranged with black forming a North-East to South-West direction.");
        System.out.println("White is forming a North-West to South-East direction.");
        System.out.println("OBJECT OF THE GAME\nThe goal is to get the majority of colour discs on the board at the end of the game.\n");
        System.out.println("GAME PLAY\nOthello is a strategy board game played between 2 players. \nOne player plays black and the other white.");
        System.out.println("Each player gets 32 discs and black always starts the game.\nThen the game alternates between white and black until:");
        System.out.println("\t• one player can not make a valid move to outflank the opponent.\n\t• both players have no valid moves.");
        System.out.println("When a player has no valid moves, he pass his turn and the opponent continues.\nA player can not voluntarily forfeit his turn.");
        
        System.out.println("VALID MOVES\nBlack always moves first.\nA move is made by placing a disc of the player's color on the board \nin a position that \"out-flanks\" one or more of the opponent's discs.");
        System.out.println("A disc or row of discs is outflanked when it is surrounded at the ends by discs of the opposite color.\nA disc may outflank any number of discs in one or more rows in any direction (horizontal, vertical, diagonal).");
        System.out.println("All the discs which are outflanked will be flipped, even if it is to the player's advantage not to flip them.\nDiscs may only be outflanked as a direct result of a move \nand must fall in the direct line of the disc being played.");
        System.out.println("If you can't outflank and flip at least one opposing disc, you must pass your turn. \nHowever, if a move is available to you, you can't forfeit your turn.");
        System.out.println("Once a disc has been placed on a square, it can never be moved to another square later in the game.");
        System.out.println("END OF THE GAME \nWhen both players can not make a valid move the gane ends.\n");
        System.out.println("The discs are now counted and the player with the majority of his or her color discs on the board is the winner.\nA tie is possible");
    }
}

