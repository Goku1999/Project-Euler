Link:https://www.hackerrank.com/contests/projecteuler/challenges/euler009/problem

import java.util.Scanner;
class E9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int ar[]=new int[t];
        for(int x=0;x<t;x++)
        {
            ar[x]=-1;
            int n=sc.nextInt();
            int z=n/2;
            for(int a=(int)Math.sqrt(n);a<z;a++)
            {
                inner:
                for(int b=a+1;b<z;b++)
                {
                    int c=n-(a+b);
                    if(a*a+b*b==c*c)
                    {
                        int p=a*b*c;
                        z=b;
                        if(p>ar[x])
                        {
                            ar[x]=p;
                        }
                        break inner;
                    }
                }
            }
        }
        for(int x=0;x<t;x++)
        {
            System.out.println(ar[x]);
        }
    }
}
