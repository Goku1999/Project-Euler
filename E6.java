//Find the absolute difference between the sum of the squares of the first N natural numbers and the square of the sum.

import java.util.Scanner;
import java.math.BigInteger;
class E6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        BigInteger b[]=new BigInteger[t];
        for(int x=0;x<t;x++)
        {
            String s=sc.next();
            BigInteger i=new BigInteger(s);
            BigInteger j=i.add(new BigInteger("1"));
            BigInteger k=i.multiply(new BigInteger("2"));
            k=k.add(new BigInteger("1"));
            BigInteger sum=i.multiply(j);
            sum=sum.divide(new BigInteger("2"));
            sum=sum.multiply(sum);
            BigInteger sq=i.multiply(j);
            sq=sq.multiply(k);
            sq=sq.divide(new BigInteger("6"));
            b[x]=sum.subtract(sq);
        }
        for(int x=0;x<t;x++)
        {
            System.out.println(b[x].toString());
        }
    }
}
