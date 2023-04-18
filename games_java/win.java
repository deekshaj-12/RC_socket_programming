import java.io.*;
class win
{
    public static void winner(String b[][])throws Exception
    {
        int w=0;
        int bl=0;
        for(int i=1;i<9;i++)
        {
            for(int j=1;j<9;j++)
            {
                if(b[i][j].charAt(1)=='o')
                {
                    w++;
                }
                else if(b[i][j].charAt(1)=='x')
                {
                    bl++;
                }
            }
        }
        System.out.println("POINTS\nBlack - "+bl+"\nWhite - "+w);
        if(w>bl)
        {
            System.out.println("White is the winner");
        }
        else if(bl>w)
        {
            System.out.println("Black is the winner");
        }
        else if(w==bl)
        {
            System.out.println("Its a tie");
        }
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter   1.To replay\n\t2.to go back to main menu");
        int y=0;
        do
        {
            try
            {
               y=Integer.parseInt(br.readLine());
            }
            catch (Exception e1)
            {
                System.out.println("Invalid entry.Enter a valid integer value");
                continue;
            }
        }
        while(y!=1&&y!=2);
        switch(y)
        {
            case 1:play1.game();
            break;
            case 2:menu1.menu();
            break;
        }
    }
}