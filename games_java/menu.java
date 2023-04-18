import java.io.*;
class menu
{
    public static void options()throws Exception
    {
        System.out.print("\u000c");
        System.out.println("Choose one option(Enter only number)");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=0;
        System.out.println("\t1.Play\n\t2.How to play?\n\t3.Difficulty\n\t4.Credits\n\t5.Quit");
        do
        {
           try
           {
              x=Integer.parseInt(br.readLine());
           }
           catch (Exception e1)
           {
               System.out.println("Invalid entry.Enter a valid integer value");
           } 
           if(x!=1&&x!=2&&x!=3&&x!=4&&x!=5)
           {
               System.out.println("Invalid entry.Enter valid number");
           }
        }
        while(x!=1&&x!=2&&x!=3&&x!=4&&x!=5);
        int n=0,a=0,c=0;
        switch(x)
        {
            case 3:difficulty d1=new difficulty();
                   n=d1.level();
                   a=difficulty.a;
                   c=difficulty.c;
                   int z=0;
                   System.out.println("Choose the difficulty level:\nEnter   1.For Easy\n\t2.For Medium\n\t3.For Hard\n\t4.To go back to main menu");
                   do
                   {
                      try
                      {
                         x=Integer.parseInt(br.readLine());
                      }
                      catch (Exception e1)
                      {
                         System.out.println("Invalid entry.Enter valid Integer value");
                      } 
                      if(x!=1&&x!=2&&x!=3&&x!=4)
                      {
                         System.out.println("Invalid entry.Enter valid number");
                      }
                   }
                   while(x!=1&&x!=2&&x!=3&&x!=4);
                   System.out.print("\u000c");
                   switch(z)
                   {
                       case 1:play.game(c,n,a);
                              break;
                       case 2:dual.dual1(c,n,a);
                              break;
                       case 3:options(); 
                              break;
                   }
            case 1:System.out.println("Enter   1.Single player\n\t2.Dual player\n\t3.To go back to main menu");
                   int w=0;
                   do
                   { 
                      try
                      {
                         w=Integer.parseInt(br.readLine());
                      } 
                      catch (Exception e3)
                      {
                         System.out.println("Invalid Entry.Enter a valid integer value");
                      }
                      if(x!=1&&x!=2&&x!=3&&x!=4)
                      {
                         System.out.println("Invalid entry.Enter valid number");
                      }
                   }
                   while(w!=1&&w!=2&&w!=3&&w!=4);
                   difficulty d2=new difficulty();
                   switch(w)
                   {
                       case 1:n=d2.level();
                              c=d2.c;
                              a=d2.a;
                              play.game(c,n,a);
                              break;
                       case 2:n=d2.level();
                              c=d2.c;
                              a=d2.a;
                              dual.dual1(c,n,a);
                              break;
                       case 4:options();
                              break;
                   }
            case 2:System.out.print("\u000c");
                   instructions i1=new instructions();
                   i1.ins();
                   break;
            case 4:credits c1=new credits();
                   c1.Credits();
            case 5:System.out.print("\u000C");
                   System.out.print("   Press X on the Window");
                   System.exit(0);  
        }  
    }
}
                          