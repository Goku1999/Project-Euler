/*Problem 2
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
import java.util.Scanner;
class E2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
            long n=sc.nextLong();
            long a=3,b=5,c=2;
            long sum=0;
            while(c<=n)
            {
                if(c%2==0)
                {
                    sum+=c;
                }
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println(sum);
        }
    }
}
