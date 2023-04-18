import java.io.*;
class MAIN
{
    public static void main(String[] args)
    throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=0;
        System.out.println("MAIN MENU");
        System.out.println("Enter   1.To play Mastermind\n\t2.To play Othello\n\t3.Quit");
        do
        { 
            try
            {
               x=Integer.parseInt(br.readLine());
            }
            catch (Exception e1)
            {
                System.out.println("Invalid Entry.Enter an integer value");
                continue;
            }
            if(x!=1&&x!=2&&x!=3)
            {
                System.out.println("Enter a valid number");
            }
        }
        while(x!=1&&x!=2&&x!=3);
        System.out.println("\u000c");
        switch(x)
        {
            case 1:main1.main();
            break;
            case 2:menu1.menu();
            break;
            case 3:System.out.print("\u000C");
            System.out.println("  Press X on the window");
            System.exit(0);
        }
    }
}