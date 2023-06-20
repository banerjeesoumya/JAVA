import java.util.*;
public class Seven_Wonders
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int i, f = 0;
        String city;
        String wond [] = new String [7];
        String loca [] = new String [7];
        for (i = 0; i < 7; i ++)
        {
            System.out.println("Enter the seven wonders of the world");
            wond [i] = sc.next();
        }
        for (i = 0; i < 7; i++)
        {
            System.out.println("Enter their locations respectively");
            loca [i] = sc.next();
        }
        System.out.println("Enter the city");
        city = sc.next();
        for(i = 0; i < 7; i++)
        {

            if(city.equalsIgnoreCase(loca[i]))
            {
                f = 1;
                break;
            }
        }
        if (f==1)
        {
            System.out.println("Country " + "\t\t" + " Wonder ");
            System.out.println(loca[i] + "\t\t\t" + wond[i]);
        }
        sc.close();
    }
}