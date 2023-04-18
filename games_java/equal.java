import java.io.*;
class equal
{
    static boolean eq(String b1[][],String b2[][])
    {
        boolean flag=true;
        for(int i=1;i<9;i++)
        {
            for(int j=1;j<9;j++)
            {
                if(b1[i][j].charAt(1)!=b2[i][j].charAt(1))
                {
                    flag=false;
                }
            }
        }
        return flag;
    }
}
                    