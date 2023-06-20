import java.util.*;
public class Understanding_Stack
{
    int St [] = new int [5];
    int cap;
    int top;
    Understanding_Stack (int lim)
    {
        cap = lim;
        top = -1;
    }

    void push (int num)
    {
        if (top < (cap - 1)) // for top = -1, logic here is: if (top < cap - 1)
        {
            St[++top] = num; // for top = -1, logic here is: St[++top] = num
        }
        else
        {
            System.out.println ("Stack Overflow");
        }
    }

    int pop ()
    {
        if (top == 0)
        {
            return 0;
        }
        else
        {
            return St [top--]; // for top = -1, logic here is: return St[top --]
        }
    }

    void display ()
    {
        if (top == 0)
        {
            System.out.println("Nothing to print, Stack Empty");
        }
        else
        {
            for (int i = top; i >= 0; i --) // for top = -1, logic here is: for (int i = top; i >= 0; i--)     
            {
                System.out.print (St[i] + ",");
            }
            System.out.println();
        }
    }

    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        //System.out.println("Enter the size of stack");
        //int n = sc.nextInt();
        Understanding_Stack ob = new Understanding_Stack(5);
        int ch = 0, num;
        do
        {
            System.out.println("\n------:: MENU ::-------");
            System.out.println("1. Pushing an Element");
            System.out.println("2. Popping an Element");
            System.out.println("3. Displaying the Elements");
            System.out.println("4. Exit");
            try
            {
                System.out.println("\n Enter your choice (1-4) :");
                ch = sc.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Error is : " + e);
            }

            switch (ch)
            {
                case 1: 
                System.out.println("\n Enter an Element");
                num = sc.nextInt();
                ob.push(num);
                break;

                case 2:
                int s = ob.pop();
                if (s == -1)
                    System.out.println("Nothing to print, Stack Empty");
                else
                    System.out.println("\n" + s + " is deleted from Stack");
                break;

                case 3:
                ob.display();
                break;

                case 4:
                System.out.println("Thanks for the execution");
                break;

                default:
                System.out.println("Invalid Choice");
            }
        }
        while (ch != 4);
        sc.close();
    }
}

 