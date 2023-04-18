import java.io.*;
class play1
{
    static int j,m,in;
    String b1[][]=new String[9][9];
    public static void game()throws Exception
    {
        String b[][]=Board.board();
        Board.display(b);
        int x=0;
        int max=60;
        for(int i=1;i<=max;i++)
        {
            x=input1.input(i,b);
            b=place.place(i,x,b);
            b=flip.flip(b,i,x);
            Board.display(b);
            int c=flip.ctr;
            if(c==0)
            {
               play1 p1=new play1();
               p1.j=i;
               p1.m=max;
               p1.b1=b;
               p1.in=x;
               invalidmove.invalid(p1);
               i=p1.j;
               b=p1.b1;
            }
        }
        win.winner(b);
    }
}