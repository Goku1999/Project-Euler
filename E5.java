/*What is the smallest positive number that is evenly divisible(divisible with no remainder) by all of the numbers from 1 to N?*/

import java.util.Scanner;
class E5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int r[]=new int[t];
        for(int x=0;x<t;x++)
        {
            int n=sc.nextInt();
            int ar[]=new int[n-1];
            for(int y=0;y<n-1;y++)
            {
                ar[y]=y+2;
            }
            boolean once=false;
            int i=2;
            r[x]=1;
            while(!isOne(ar))
            {
                for(int y=0;y<n-1;y++)
                {
                    if(ar[y]%i==0)
                    {
                        ar[y]/=i;
                        once=true;
                    }
                }
                if(once)
                {
                    once=false;
                    r[x]*=i;
                }
                else
                {
                    i++;
                }
            }
        }
        for(int x=0;x<t;x++)
        {
            System.out.println(r[x]);
        }
    }
    public static boolean isOne(int ar[])
    {
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x]!=1)
            {
                return false;
            }
        }
        return true;
    }
}
