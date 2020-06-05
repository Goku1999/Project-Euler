//What is the Nth prime number?

import java.util.Scanner;
class E7
{
    public static void main(String argsa[])
    {
        boolean ar[]=new boolean[1000001];
        ar[0]=true;
        for(int x=2;x<=1000;x++)
        {
            if(!ar[x-1])
            {
                for(int y=x*x;y<ar.length;y+=x)
                {
                    ar[y-1]=true;
                }
            }
        }
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int r[]=new int[t];
        for(int x=0;x<t;x++)
        {
            int y=1;
            int c=0;
            int n=sc.nextInt();
            while(c!=n)
            {
                if(!ar[y])
                {
                    c++;
                }
                y++;
            }
            r[x]=y;
        }
        for(int x=0;x<t;x++)
        {
            System.out.println(r[x]);
        }
    }
}
