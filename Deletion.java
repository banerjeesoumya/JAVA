
import java.util.*;
public class Deletion
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int i, sn, pos = -1;
        int ar [] = new int [10];
        for (i = 0; i < 10; i ++) 
        {
            System.out.println("Enter the array elements");
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter the value to be deleted");
        sn = sc.nextInt();
        for (i = 0; i < 10; i ++)
        {
            if (ar[i] == sn)
            {
                pos = i;
                break;
            }
        }
        if (pos > -1)
        {
            for (i = 0; i < 9; i++)
            {
                ar[i] = ar[i + 1];
            }
            ar[9] = 0;
            for (i = 0; i < 9; i++)
            {
                System.out.println(ar[i]);
            }
            System.out.println("Value deleted at position : " + (pos + 1));
        }
        else
        {
            System.out.println("Value for deletion was not found");
        }
        sc.close();
}
}