//Find the greatest product of K consecutive digits in the  digit number N.

import java.util.Scanner;
class E8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int ar[]=new int[t];
        for(int x=0;x<t;x++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            String s=sc.next();
            int y=0;
            while(y<=a-b)
            {
                int ab=pro(s.substring(y,y+b));
                if(ab>ar[x])
                {
                    ar[x]=ab;
                }
                y++;
            }
        }
        for(int x=0;x<t;x++)
        {
            System.out.println(ar[x]);
        }
    }
    public static int pro(String s)
    {
        int pro=1;
        for(int x=0;x<s.length();x++)
        {
            pro*=s.charAt(x)-48;
        }
        return pro;
    }
}
