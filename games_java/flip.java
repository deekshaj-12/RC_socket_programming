import java.io.*;
class flip
{
    static int ctr;
    public static String[][] flip(String b[][],int i,int x)throws Exception
    {
        ctr=0;
        int j=x/10;
        int k=x%10;
        String s=b[j][k];
        char s1;
        char s2;
        if(i%2==0)
        {
           s2='x';
           s1='o';
        }
        else
        {
            s2='o';
            s1='x';
        }
        for(int l=j-1;l>0;l--)
        {
            String s3=b[l][k];
            if(s3.charAt(1)=='-')
            {
                break;
            }
            if(s3.charAt(1)==s2)
            {
                continue;
            }
            if(s3.charAt(1)==s1)
            {
                if(l==j-1)
                {
                    break;
                }
                for(int o=l+1;o<j;o++)
                {
                    String c="";
                    if(i%2==0)
                    {
                       c=b[o][k].replace('x','o');
                       ++ctr;
                    }
                    else
                    {
                        c=b[o][k].replace('o','x');
                        ++ctr;
                    }
                    b[o][k]=c;
                }
                break;
            }
        }
        for(int l=j+1;l<=8;l++)
        {
            String s3=b[l][k];
            if(s3.charAt(1)=='-')
            {
                break;
            }
            if(s3.charAt(1)==s2)
            {
                continue;
            }
            if(s3.charAt(1)==s1)
            {
                if(l==j+1)
                {
                    break;
                }
                for(int o=l-1;o>j;o--)
                {
                    String c="";
                    if(i%2==0)
                    {
                       c=b[o][k].replace('x','o');
                       ++ctr;
                    }
                    else
                    {
                        c=b[o][k].replace('o','x');
                        ++ctr;
                    }
                    b[o][k]=c;
                }
                break;
            }
        }
        for(int l=k-1;l>0;l--)
        {
            String s3=b[j][l];
            if(s3.charAt(1)=='-')
            {
                break;
            }
            if(s3.charAt(1)==s2)
            {
                continue;
            }
            if(s3.charAt(1)==s1)
            {
                if(l==k-1)
                {
                    break;
                }
                for(int o=l+1;o<k;o++)
                {
                    String c="";
                    if(i%2==0)
                    {
                       c=b[j][o].replace('x','o');
                       ++ctr;
                    }
                    else
                    {
                        c=b[j][o].replace('o','x');
                        ++ctr;
                    }
                    b[j][o]=c;
                }
                break;
            }
        }
        for(int l=k+1;l<=8;l++)
        {
            String s3=b[j][l];
            if(s3.charAt(1)=='-')
            {
                break;
            }
            if(s3.charAt(1)==s2)
            {
                continue;
            }
            if(s3.charAt(1)==s1)
            {
                if(l==k+1)
                {
                    break;
                }
                for(int o=l-1;o>k;o--)
                {
                    String c="";
                    if(i%2==0)
                    {
                       c=b[j][o].replace('x','o');
                       ++ctr;
                    }
                    else
                    {
                        c=b[j][o].replace('o','x');
                        ++ctr;
                    }
                    b[j][o]=c;
                }
                break;
            }
        }
        for(int a=j-1,l=k-1;l>0&&a>0;l--,a--)
        {
            String s3=b[a][l];
            if(s3.charAt(1)=='-')
            {
                break;
            }
            if(s3.charAt(1)==s2)
            {
                continue;
            }
            if(s3.charAt(1)==s1)
            {
                if(l==k-1&&a==j-1)
                {
                    break;
                }
                for(int d=a+1,o=l+1;o<k&&d<j;d++,o++)
                {
                    String c="";
                    if(i%2==0)
                    {
                       c=b[d][o].replace('x','o');
                       ++ctr;
                    }
                    else
                    {
                        c=b[d][o].replace('o','x');
                        ++ctr;
                    }
                    b[d][o]=c;
                }
                break;
            }
        }
        for(int a=j+1,l=k+1;l<=8&&a<=8;l++,a++)
        {
            String s3=b[a][l];
            if(s3.charAt(1)=='-')
            {
                break;
            }
            if(s3.charAt(1)==s2)
            {
                continue;
            }
            if(s3.charAt(1)==s1)
            {
                if(l==k+1&&a==j+1)
                {
                    break;
                }
                for(int d=a-1,o=l-1;o>k&&d>j;d--,o--)
                {
                    String c="";
                    if(i%2==0)
                    {
                       c=b[d][o].replace('x','o');
                       ++ctr;
                    }
                    else
                    {
                        c=b[d][o].replace('o','x');
                        ++ctr;
                    }
                    b[d][o]=c;
                }
                break;
            }
        }
        for(int a=j+1,l=k-1;l>0&&a<=8;a++,l--)
        {
            String s3=b[a][l];
            if(s3.charAt(1)=='-')
            {
                break;
            }
            if(s3.charAt(1)==s2)
            {
                continue;
            }
            if(s3.charAt(1)==s1)
            {
                if(l==k-1&&a==j+1)
                {
                    break;
                }
                for(int d=a-1,o=l+1;o<k&&d>j;d--,o++)
                {
                    String c="";
                    if(i%2==0)
                    {
                       c=b[d][o].replace('x','o');
                       ++ctr;
                    }
                    else
                    {
                        c=b[d][o].replace('o','x');
                        ++ctr;
                    }
                    b[d][o]=c;
                }
                break;
            }
        }
        for(int a=j-1,l=k+1;l<=8&&a>0;a--,l++)
        {
            String s3=b[a][l];
            if(s3.charAt(1)=='-')
            {
                break;
            }
            if(s3.charAt(1)==s2)
            {
                continue;
            }
            if(s3.charAt(1)==s1)
            {
                if(l==k+1&&a==j-1)
                {
                    break;
                }
                for(int d=a+1,o=l-1;o>k&&d<j;d++,o--)
                {
                    String c="";
                    if(i%2==0)
                    {
                       c=b[d][o].replace('x','o');
                       ++ctr;
                    }
                    else
                    {
                        c=b[d][o].replace('o','x');
                        ++ctr;
                    }
                    b[d][o]=c;
                }
                break;
            }
        }  
        return b;
    }
}
    

                
                
                
                
                