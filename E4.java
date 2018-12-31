/*Problem 4
 * Find the largest palindrome made from the product of two 3-digit numbers which is less than N.
 */
import java.util.Scanner;
class E4
{
    public static void main(String ags[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        boolean ar[]=palins();
        for(int x=0;x<t;x++)
        {
            int n=sc.nextInt();
            for(int y=n-1;y>=0;y--)
            {
                if(ar[y])
                {
                    System.out.println(y);
                    break;
                }
            }
        }
    }
    public static boolean[] palins()
    {
        boolean ar[]=new boolean[10000001];//10^6+1 because aray starts with index 0
        for(int x=100;x<=999;x++)
        {
            for(int y=100000/x;y<=999;y++)
            {
                int t=x*y;
                if(isPalin(t))
                {
                    ar[t]=true;
                }
            }
        }
        return ar;
    }
    public static boolean isPalin(int n)
    {
        int t=n;
        int r=0;
        while(t!=0)
        {
            r*=10;
            r+=t%10;
            t/=10;
        }
        return n==r;
    }
}