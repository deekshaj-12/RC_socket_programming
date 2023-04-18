import java.io.*;
class place
{
    public static String[][] place(int i,int x,String a[][])throws Exception
    {
        int s1=x/10;
        int s2=x%10;
        String s=a[s1][s2];
        if(i%2==0)
        {
            s=s.replace('-','o');
        }
        else
        {
            s=s.replace('-','x');
        }
        a[s1][s2]=s;
        return a;
    }
}