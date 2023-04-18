import java.io.*;
class dual
{
    static int s1,s2;
    static boolean flag=false;
    public static void dual2(int c,int n,int a,int i,int j)throws Exception
    {
        System.out.println("FIRST ROUND\nPlayer"+i+" is the code breaker(who guesses the mastercode)\nPlayer2 is the codemaker(who sets the mastercode)\nPlayer"+j+" enter the mastercode");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m1=input.inp(n,a);
        System.out.print("\u000c");
        System.out.println("Player"+i+" the master code has been set");
        int m[]=new int[n];
        int ctr=0;
        String s="";
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
        for(int k=n-1;k>=0;k--)
        {
            m[k]=m1%10;
            m1=m1/10;
        }
        int k=0;
        for(k=1;k<=c;k++)
        {
            int x=input.inp(n,a);
            String r=feedback.result(x,m,n);
            System.out.println("\t  feedback- "+r);
            ctr++;
            if(r.equals(s))
            {
                System.out.print("\u000c");
                System.out.println("\t\t\t\tCONGRADULATIONS!!!!");
                System.out.println("You cracked the mastercode");
                if(i==1)
                {
                   s1=play.score(c,ctr);
                   System.out.println("player"+i+"'s Score:  "+s1);
                }
                else if(i==2)
                {
                    s2=play.score(c,ctr);
                    System.out.println("player"+i+"'s Score:  "+s2);
                }
                Thread.sleep(5000);
                System.out.print("\u000c");
                next(i,c,n,a);
            }
        }
        if(k==c+1)
        {
            if(i==1)
            {
                s1=0;
            }
            else if(i==2)
            {
                s2=0;
            }
            System.out.println("Oops!!!Your chances are exhausted");
            Thread.sleep(2000);
            next(i,c,n,a);
        }
    }
    static void player2(int c,int n,int a)throws Exception
    {
        dual2(c,n,a,2,1);
    }
    static void next (int i,int c,int n,int a)throws Exception
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\u000c");
        if(i==1)
        {
            player2(c,n,a);
        }
        else if(i==2)
        {
            winner(n,c,a);
            System.out.println("Enter  1.To replay\n\t2.To go back to main menu");
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
               }
               if(y!=1||y!=2)
               {
                   System.out.println("Invalid entry.Enter a valid number");
               }
            }
            while(y!=1||y!=2);
            switch(y)
            {
                case 1:dual2(c,n,a,1,2);
                break;
                case 2:menu.options();
                break;
            }
        }
    }
    static void winner(int c,int n,int a)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        if(s1>s2)
        {
            System.out.println("Player1 is the winner");
        }
        else if(s2>s1)
        {
            System.out.println("Player2 is the winner");
        }
        else if(s1==s2)
        {
            System.out.println("It is a tie!!");
        }
        System.out.println("Enter  1.To replay\n\t2.To go back to main menu");
        int y=0;
        do
        {
            try
            {
                y=Integer.parseInt(br.readLine());
            }
            catch (Exception e2)
            {
                System.out.println("Invalid entry.Enter a valid integer value");
            }
            if(y!=1&&y!=2)
            {
                System.out.println("Invalid entry.Enter a valid number");
            }
        }
        while(y!=1&&y!=2);
        switch(y)
        {
            case 1:dual1(c,n,a);
            break;
            case 2:menu.options();
            break;
        }
    }
    static void dual1(int c,int n,int a)throws Exception
    {
        dual2(c,n,a,1,2);
    }
}
            
        
    
            
        
    

            