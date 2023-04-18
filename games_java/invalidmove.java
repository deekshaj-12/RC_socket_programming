import java.io.*;
class invalidmove
{
    public static void invalid(play1 p)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Invalid move\nat least one coin should flip");
        System.out.println("Enter 'R' to replay your turn");
        System.out.println("If no valid moves are available enter 'P' to pass your turn");
        String ch= "";
        do
        {
            ch=br.readLine();
            ch=ch.trim();
            if(!ch.equalsIgnoreCase("R")&&!ch.equalsIgnoreCase("P"))
            {
                System.out.println("Enter 'R' to replay, 'P' to pass");
            }
        }
        while(!ch.equalsIgnoreCase("R")&&!ch.equalsIgnoreCase("P"));
        if(ch.equalsIgnoreCase("r"))
        {
            --p.j;
        }
        else if(ch.equalsIgnoreCase("p"))
        {
            ++p.m;
        }
        int i=p.in/10;
        int j=p.in%10;
        p.b1[i][j]="_-_|";
        Board.display(p.b1);
    }
}
           
        