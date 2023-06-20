import java.util.Scanner;
public class Disarium
{ 
    int num,size;
    static Scanner sc=new Scanner(System.in);
    Disarium(int nn)
    { 
        num=nn;
        size=0; 
    }

    void countDigits()
    { 
        int a=num;
        while(a!=0)
        { 
            a=a/10;
            size++; 
        }
    }

    int sumofDigits(int n, int p)
    {
        int d, pow;
        if (n == 0)
        {
            return 0;
        }
        else
        {
            d = n % 10;
            pow = (int)(Math.pow(d, p));
            return sumofDigits((n / 10), (p - 1)) + pow;
        }
        //return (n==0)? 0: sumofDigits(n/10,p-1) + (int)Math.pow(n%10,p); 
    }

    void check()
    { 
        if(num == sumofDigits(num,size))
            System.out.print("\n Disarium Number");
        else
            System.out.print("\n Not a Disarium Number");
    }

    static void main()
    { 
        System.out.println("Input a Number");
        int m=sc.nextInt();
        Disarium x= new Disarium(m);
        x.countDigits();
        x.check();
    }
}