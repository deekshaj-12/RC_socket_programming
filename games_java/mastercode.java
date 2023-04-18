import java.io.*;
class mastercode
{
    public static int[] mc(int n,int a)throws Exception
    {
        int code[]=new int[n]; 
        code[0]=(int)(Math.random()*a+1);
        for(int i=1;i<n;i++)
        {
            code[i]=(int)(Math.random()*a+1);
            if(code[i]==code[0])
            {
                i=i-1;
                continue;
            }
            if(i>1)
            {
                if(code[i]==code[i-1]||code[i]==code[0])
                {
                     i=i-1;
                     continue;
                }
            }
            if(i>2)
            {
                if(code[i]==code[i-1]||code[i]==code[1]||code[i]==code[0])
                {
                    i=i-1;
                    continue;
                }
            }
            else if(i>3)
            {
                if(code[i]==code[i-1]||code[i]==code[1]||code[i]==code[0]||code[i]==code[2])
                {
                    i=i-1;
                    continue;
                }
            }
        }
         return code;
    }
}
        
        