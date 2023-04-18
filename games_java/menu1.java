import java.io.*;
class menu1
{
    public static void menu()throws Exception
    {
        System.out.print("\u000c");
        System.out.println("Choose one option(Enter only number)");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=0;
        System.out.println("\t1.Play\n\t2.How to play?\n\t3.Credits\n\t4.Go back to main menu\n\t5.Quit");
        do
        {
           try
           {
              x=Integer.parseInt(br.readLine());
           }
           catch (Exception e1)
           {
               System.out.println("Ivalid entry.Enter an integer value");
               continue;
           }
           if(x!=1&&x!=2&&x!=3&&x!=4&&x!=5)
           {
               System.out.println("Enter a valid number");
           }
           System.out.print("\u000c");
        }
        while(x!=1&&x!=2&&x!=3&&x!=4&&x!=5);
        switch(x)
        {
            case 1:play1.game();
            break;
            case 2:rules.instructions();
            break;
            case 3:credits1.credits();
            break;
            case 4:MAIN.main(null);
            break;
            case 5:System.out.print("\u000C");
                   System.out.print("   Press X on the Window");
                   System.exit(0);  
                   break;
        } 
    }
}
    
    