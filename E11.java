https://www.hackerrank.com/contests/projecteuler/challenges/euler011/problem

import java.util.Scanner;
class E11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[][]=new int[20][20];
        for(int x=0;x<20;x++)
        {
            for(int y=0;y<20;y++)
            {
                ar[x][y]=sc.nextInt();
            }
        }
        int max=0;
        for(int x=0;x<20;x++)
        {
            for(int y=0;y<20;y++)
            {
                int a,b,c,d;
                try
                {
                    a=ar[x][y]*ar[x][y+1]*ar[x][y+2]*ar[x][y+3];
                }
                catch(Exception e)
                {
                    a=0;
                }
                try
                {
                    b=ar[x][y]*ar[x+1][y+1]*ar[x+2][y+2]*ar[x+3][y+3];
                }
                catch(Exception e)
                {
                    b=0;
                }
                try
                {
                    c=ar[x][y]*ar[x+1][y]*ar[x+2][y]*ar[x+3][y];
                }
                catch(Exception e)
                {
                    c=0;
                }
                try
                {
                    d=ar[x][y]*ar[x-1][y+1]*ar[x-2][y+2]*ar[x-3][y+3];
                }
                catch(Exception e)
                {
                    d=0;
                }            
                max=Math.max(max,Math.max(a,Math.max(b,Math.max(c,d))));
            }

        }
        System.out.println(max);
    }
}
