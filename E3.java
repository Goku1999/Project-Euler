//What is the largest prime factor of a given number ?


import java.util.Scanner;
class E3
{
    static long find( long n)
    {
        long maxPrime = -1;
        while (n % 2 == 0)
        {
            maxPrime = 2;
            n/=2; 
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            while (n % i == 0) 
            {
                maxPrime = i;
                n = n / i;
            }
        }
        if (n > 2)
        {
            maxPrime = n;
        }
        return maxPrime;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
            long n=sc.nextLong();
            System.out.println(find(n));
        }
    }
}
