import java.io.*;
class Board
{
    public static String b[][]=new String[9][9];
    public static String[][] board()throws Exception
    {
        for(int i=1;i<9;i++)
        {
            for(int j=1;j<9;j++)
            {
                b[i][j]="_-_|";
            }
        }
        b[4][5]="_o_|";
        b[5][4]="_o_|";
        b[5][5]="_x_|";
        b[4][4]="_x_|";
        b[0][0]="    ";
        for(int i=1;i<9;i++)
        {
            b[0][i]="_"+i+"_ ";
            b[i][0]=" "+i+" |";
        }
        return b;
    }
    public static void display(String b[][])throws Exception
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}