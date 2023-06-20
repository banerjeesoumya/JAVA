import java.util.*;
public class Merging_Of_Array
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int i, p;
        int A[] = new int [5];
        int B[] = new int [5];
        int C[] = new int [10];
        for (i = 0; i < 5; i++)
        {
            System.out.println("Enter the elements");
            A[i] = sc.nextInt();
        }
        for (i = 0; i < 5; i ++)
        {
            System.out.println("Enter the elemnts of the second array");
            B[i] = sc.nextInt();
        }
        p = 0;
        for (i = 0; i < 5; i++)
        {
            C[p] = A[i];
            p ++;
        }
        for (i = 0; i < 5; i++)
        {
            C[p] = B[i];
            p++;
        }
        System.out.println("Array A : ");
        for (i = 0; i < 5; i++)
        {
            System.out.print ( A[i] + " " );
        }
        System.out.println("\n");
        System.out.println("Array B :");
        for (i = 0; i < 5; i++)
        {
            System.out.print ( B[i] + " " );
        }
        System.out.println("\n");
        System.out.println("Array C :");
        for (i = 0; i < 10; i++)
        {
            System.out.print ( C[i] + " " );
        }
        sc.close();
    }
}
        
        
