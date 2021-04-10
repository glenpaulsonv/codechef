/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public void solve(String str, int N, int K)
    {
        int count=0;
        int maxCount=0;
        for(int i=0;i<N;i++)
        {
            if(str.charAt(i)=='*')
            {
                count++;
                if(count>maxCount)
                    maxCount=count;
            }
            else
                count=0;
        }
        if(maxCount>=K)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int T=s.nextInt();
		while(T-->0)
		{
		    int N=s.nextInt();
		    
		        int K=s.nextInt();
		        s.nextLine();
		        String str=s.nextLine();
		        Codechef s1 = new Codechef();
		        s1.solve(str,N,K);
		}
	}
}
