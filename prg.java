import java.util.*;
public class prg
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int a, b;
        System.out.println ("Enter the value of a ");
        a = sc.nextInt();
        System.out.println ("Enter the value of b ");
        b = sc.nextInt();
        int sum = a + b;
        System.out.println ("Sum is " + sum);
        sc.close();
    } 
}