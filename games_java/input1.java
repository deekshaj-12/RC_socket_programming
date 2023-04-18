import java.io.*;
class input1
{
    public static int input(int i,String b[][])throws Exception
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       if(i%2!=0)
       {
           System.out.println("black's turn");
       }
       else
       {
           System.out.println("white's turn");
       }
       int n=0,d=0,ctr=0,x=0;
       boolean flag=false;
       while(true)
       {
          try
          {
             x=Integer.parseInt(br.readLine());
          }
          catch (Exception e1)
          {
             System.out.println("Invalid entry.Enter an Integer value");
             continue;
          } 
          n=x;
          d=x;
          ctr=0;
          flag=false;
          while(n>0)
          {
             ctr++;
             n=n/10;
          }
          while(d>0)
          {
              if(d%10>8)
              {
                  flag=true;
              }
              d=d/10;   
          }
          if(ctr!=2||flag==true)
          {
              System.out.println("Invalid entry\nEnter 2 digits ranging from 1 to 8");
              n=x;
              d=x;
              continue;
          }
          int j=x/10;
          int k=x%10;
          if(b[j][k].charAt(1)!='-')
          {
              System.out.println("A coin is alresdy present in this position");
              System.out.println("Enter an empty position");
              n=x;
              d=x;
              continue;
          }
          break;
       }
       return x;
   }
}


