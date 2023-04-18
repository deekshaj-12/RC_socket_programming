import java.io.*;
class input
{
    public static int inp(int l,int a)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter your guess");
       int x=0,n=0,d=0,ctr=0,c=0;
       do
       {
          try
          {
             x=Integer.parseInt(br.readLine());
          }
          catch (Exception e1)
          {
             System.out.println("Invalid entry.Enter an integer value");
             continue;
          }
          n=x;
          d=x;
          ctr=0;
          c=0;
          while(n>0)
          {
             ctr++;
             n=n/10;
          }
          while(d>0)
          {
              if(d%10>a)
              {
                  c++;
              }
              d=d/10;   
          }
          if(ctr!=l||c>0)
          {
              System.out.println("Invalid entry\nEnter "+l+" digits ranging from 1 to "+a);
              n=x;
              d=x;
          }
       }
       while(ctr!=l||c>0);
       return x;
   }
}

            
        