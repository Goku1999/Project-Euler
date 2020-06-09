https://www.hackerrank.com/contests/projecteuler/challenges/euler010/problem

import java.util.Scanner;
import java.util.StringTokenizer;
class E10_
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long ar[]=new long[1000000+1];
        boolean r[]=find(1000000);
        long sum2=0;
        for(int x=1;x<=1000000;x++)
        {
            if(!r[x])
            {
                  sum2+=x+1;
            }
            ar[x]=sum2;
        }
        for(int x=0;x<t;x++)
        {
            int n=sc.nextInt();
            System.out.println(ar[n-1]);
        }
    }

    public static boolean[] find(int n)
    {
        boolean ar[]=new boolean[n+1];
        ar[0]=true;
        for(int x=2;x<=Math.sqrt(n);x++)
        {
            if(!ar[x-1])
            {
                for(int y=x*x;y<n;y+=x)
                {
                    ar[y-1]=true;
                }
            }
        }
        return ar;
    }
}
