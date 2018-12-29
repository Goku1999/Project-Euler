import java.util.Scanner;
class E1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
            long n=sc.nextLong();
            n--;
            long n3=n/3;
            long n5=n/5;
            long n15=n/15;
            n3=3*n3*(n3+1)/2;
            n5=5*n5*(n5+1)/2;
            n15=15*n15*(n15+1)/2;
            System.out.println(n3+n5-n15);
        }
    }
}