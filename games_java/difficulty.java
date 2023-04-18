import java.io.*;
class difficulty
{
    static int n=0;
    static int a=0;
    static int c=0;
    static int x=0;
    public static int level()throws Exception
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
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
       switch(x)
          { 
            case 1:n=3;
                   c=8;
                   a=5;
                   System.out.println("You have chosen level 1\nthe mastercode is of 3 digits consisting of numbers from 1 to 5\nYou have got 8 chances to crack the mastercode");
                   break;
            case 2:n=4;
                   c=10;
                   a=7;
                   System.out.println("You have chosen level 2\nthe mastercode is of 4 digits consisting of numbers from 1 to 7\nYou have got 10 chances to crack the mastercode");
                   break;
            case 3:n=5;
                   c=12;
                   a=8;
                   System.out.println("You have chosen level 3\nthe mastercode is of 5 digits consisting of numbers from 1 to 8\nYou have got 12 chances to crack the mastercode");
                   break;
            case 4:menu.options();       
       }  
       return n;
    }
}

    
   