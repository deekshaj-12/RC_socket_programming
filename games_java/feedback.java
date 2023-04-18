import java.io.*;
class feedback
{
    public static String result(int x,int m[],int n)throws Exception
    {
        String r="";
        int guess[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            guess[i]=x%10;
            x=x/10;
        }
        if(n==3)
        {
            if(guess[0]==m[1] || guess[0]==m[2])
            {
	       r+="x";
            }
	    if(guess[1]==m[0] || guess[1]==m[2])
	    {
	       r+="x";
	    }
	    if(guess[2]==m[0] || guess[2]==m[1])
	    {
	        r+="x";
	    }
	    if(guess[0]==m[0])
	    {
		r+="o";
	    }
	    if(guess[1]==m[1])
	    {
		r+="o";
	    }
	    if(guess[2]==m[2])
	    {
		r+="o";
	    }
	}
	else if(n==4)
	{
	    if(guess[0]==m[1] || guess[0]==m[2] || guess[0]==m[3])
	    {
		r+="x";
	    }
	    if(guess[1]==m[0] || guess[1]==m[2] || guess[1]==m[3])
	    {
		r+="x";
	    }
	    if(guess[2]==m[0] || guess[2]==m[1] || guess[2]==m[3])
	    {
		r+="x";
	    }
	    if(guess[3]==m[0] || guess[3]==m[1] || guess[3]==m[2])
	    {
		r+="x";
	    }
	    if(guess[0]==m[0])
	    {
		r+="o";
	    }
	    if(guess[1]==m[1])
	    {
		r+="o";
	    }
	    if(guess[2]==m[2])
	    {
		r+="o";
	    }
            if(guess[3]==m[3])
            {
		r+="o";
	    }
	}
	else if(n==5)
	{
	    if(guess[0]==m[1] || guess[0]==m[2] || guess[0]==m[3]||guess[0]==m[4])
            {
	       r+="x";
            }
	    if(guess[1]==m[0] || guess[1]==m[2] || guess[1]==m[3]||guess[1]==m[4])
	    {
	       r+="x";
	    }
	    if(guess[2]==m[0] || guess[2]==m[1] || guess[2]==m[3]||guess[2]==m[4])
	    {
	        r+="x";
	    }
	    if(guess[3]==m[0] || guess[3]==m[1] || guess[3]==m[2]||guess[3]==m[4])
	    {
	        r+="x";
	    }    
	    if(guess[4]==m[0] || guess[4]==m[1] || guess[4]==m[2]||guess[4]==m[3])
	    {
	        r+="x";
	    }    
            if(guess[0]==m[0])
	    {
		r+="o";
	    }
	    if(guess[1]==m[1])
	    {
		r+="o";
	    }
	    if(guess[2]==m[2])
	    {
		r+="o";
	    }
	    if(guess[3]==m[3])
	    {
		r+="o";
	    }
	    if(guess[4]==m[4])
	    {
	        r+="o";
	    }
	}
	return r;
    }
}
    
        
        