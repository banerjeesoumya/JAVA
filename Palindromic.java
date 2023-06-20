import java.util.*;
public class Palindromic
{
    public static void main (String[]args)
    {
        Scanner sc =new Scanner (System.in);
        int i, n, t, d, rev = 0;
        int ar [] = new int [10];
        for ( i = 0; i < 10; i ++)
        {
            System.out.println("Enter the array elements");
            ar [ i ] = sc.nextInt();
        }
        for (i = 0; i < 10; i++)
        {
            n = ar[ i ];
            t = n;
            rev = 0;
            while ( t > 0 )
            {
                d = t % 10;
                t = t /10;
                rev = rev * 10 + d;
            }
            if (n == rev)
            {
                System.out.println( n + " is a Palindromic number");
            }
            else
            {
                System.out.println( n + " is not a Palindromic number");
            }
        }
        sc.close();
    }
}
        