import java.io.*;
class play
{
    static int t;
    public static void game(int c,int n,int a)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        mastercode m1=new mastercode();
        int m[]=m1.mc(n,a);
        String s="";
        int ctr=0;
        for(int j=0;j<m.length;j++)
        {
            int b=m[j];
            System.out.print(b);
        }
        System.out.println("Mastercode has been set");
        if(n==3)
        {
            s="ooo";
        }
        else if(n==4)
        {
            s="oooo";
        }
        else if(n==5)
        {
            s="ooooo";
        }
        int i=0;
        for(i=1;i<=c;i++)
        {
            int x=input.inp(n,a);
            String r=feedback.result(x,m,n);
            System.out.println("\t  feedback: "+r);
            ctr++;
            if(r.equals(s))
            {
                System.out.print("\u000c");
                System.out.println("\t\t\t\tCONGRADULATIONS!!!!");
                System.out.println("You cracked the mastercode");
                int sc=score(c,ctr);
                t+=sc;
                System.out.println("Your Score:  "+sc);
                if(n==3||n==4)
                {
                    if(n==3)
                    {
                        a=7;
                    }
                    if(n==4)
                    {
                        a=8;
                    }
                    promotion(n,c,a);
                }
                else
                {
                    System.out.println("You cleared all the levels\n\tTotal score: "+t);
                    System.out.println("Press enter key to go to main menu");
                    br.read();
                    System.out.print("\u000C");
                    menu.options();
                }
                break;
            }
        }
        if(i==c+1)
        {
            System.out.println("Oops!!!Your chances are exhausted");
            System.out.println("Enter   1.To replay the same level\n\t2.to go back to main menu");
            int y=0;
            do
            {
               try
               {
                  y=Integer.parseInt(br.readLine());
               }
               catch (Exception e1)
               {
                   System.out.println("Invalid entry.Enter an Integer value");
                   continue;
               } 
               if(y!=1&&y!=2)
               {
                   System.out.println("Invalid entry.Enter a valid number");
               }
            }
            while(y!=1&&y!=2);
            switch(y)
            {
               case 1:System.out.print("\u000c");
                      game(c,n,a);
                      break;
               case 2:System.out.print("\u000c");
                      menu.options();
                      break;
            }
        }
    }
    static int score(int count,int ct)throws Exception
    {
        int s=(count-ct)*100;
        return s;
    }
    static void promotion(int n,int c,int a)throws Exception
    {
        System.out.println("Total score: "+t);
        System.out.println("Enter   1.To play the next level\n\t2.To go to the main menu");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int w=0;
        do
        {
           try
           {
               w=Integer.parseInt(br.readLine());
           }
           catch (Exception e2)
           {
               System.out.println("Inavlid Entry.Enter an integer value");
               continue;
           }
           if(w!=1&&w!=2)
           {
               System.out.println("Enter a valid number");
               continue;
           }
        }
        while(w!=1&&w!=2);
        switch(w)
        {
            case 1:game(c+2,n+1,a);
            break;
            case 2:menu.options();
            break;
        }
    }
}
    

        
        
            

          

            

                   