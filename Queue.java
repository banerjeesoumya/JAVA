import java.io.*;
class Queue
{
    int Qu [];
    int cap;
    int front,rear;
    Queue(int lim)
    {
        Qu =new int[cap = lim];
        front = 0;
        rear = 0;
    }

    void push(int num)
    {
        if(rear < cap) // (rear<cap-1) for rear=-1
            Qu[rear++] = num; // Qu[++rear]=num for rear=-1
        else
            System.out.println("Queue is Overflowed.");
    } 

    int pop()
    {
        int d = 0;
        if(rear == front)
            d = -1;
        else
            d = Qu[front++]; // d=Qu[++front] for front=-1
        if(front==rear)
            front = rear = 0;
        return d;    
    }    

    void Display()
    {
        if(front == rear)
            System.out.println("\nQueue is Empty.");
        else
        {
            System.out.println("\nElements of the Queue.");
            for(int i = front; i < rear; i++) // (i=front+1;i<=rear;i++) for rear=front=-1
                System.out.print(Qu[i]+" ");
            System.out.println();
        }
    }

    public static void main(String a[]) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print(" Enter the size of the Queue : ");
        int n=Integer.parseInt(br.readLine());
        Queue ob=new Queue(n);
        int ch = 0, num;
        do
        {
            System.out.println("\n------: : MENU : :-------");
            System.out.println("1. Pushing an Element.");
            System.out.println("2. Poping an Element.");
            System.out.println("3. Display the Elements.");
            System.out.println("4. Exit.");
            try
            {
                System.out.print("\n Enter your Choice(1-4) : ");
                ch=Integer.parseInt(br.readLine());
            }
            catch(Exception e)
            {
                System.out.println("Error is : "+e);
            }
            switch(ch)
            {
                case 1:
                System.out.print("\n Enter an Element : "); 
                num=Integer.parseInt(br.readLine());
                ob.push(num);
                break;
                case 2:
                int s = ob.pop();
                if(s == -1)  
                    System.out.println("\nQueue is Empty.");
                else
                    System.out.println("\n'"+s+"' is deleted from the Queue.");
                break;
                case 3:
                ob.Display();
                break;
                case 4:
                System.out.print("\nThank U for Executing.");
                break;
                default:
                System.out.println("\nInvalid  Choice.");
            }
        }while(ch != 4);
    }
}
