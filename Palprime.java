public class Palprime
{
    void main (int n)
    {
        if(isPrime(n) == true && isRev(n) == 1 )
        {
            System.out.println("Palprime Number");
        }
    }

    boolean isPrime(int n)
    {
        int c = 0;
        for(int i = 1; i <= n; i++)
        {
            if (n % i == 0)
                c++;
        }
        if (c == 2)
            return true;
        else
            return false;
    }

    int isRev(int p)
    {
        int t, d;
        int rev = 0, e = 0;
        t = p ;
        while (t > 0)
        {
            d = t % 10; 
            t = t / 10;
            rev = rev * 10 + d;
            for (int i = 1; i <= rev; i++)
            {
                if(rev % i == 0)
                e++;
            }
            
        }
        if (e==2)
            return rev;
        else
            return 0;
    }
}