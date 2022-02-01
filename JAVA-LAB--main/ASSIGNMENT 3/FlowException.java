import java.util.Scanner;
class FlowException 
{
    public static void main(String[] args) 
    {
       Stack s = new Stack();
       Scanner sc = new Scanner(System.in);
       while(true)
       {
        System.out.print("Enter the choice: 1.Push 2.Pop: ");
        int ch = sc.nextInt();
        
        if(ch == 1)
        {
            System.out.print("\nElement:");
            s.push(sc.nextInt());
        }
        else if(ch == 2)
        {
            s.pop();
        }
        else
        {
            System.out.println("Invalid choice");
            break;
        }
       }
    }
}

class OverFlowException extends Exception
{
    public String toString()
    {
        return "\nOverFlowException\n";
    }
}
class UnderFlowException extends Exception
{
    public String toString()
    {
        return "\nUnderFlowException\n";
    }
}

class Stack 
{
    int[] stk = new int[5];
    int top = -1;

    void push(int x) 
    {
        top++;
        if (top == stk.length) 
        {
            try 
            {
                throw new OverFlowException();
            } 
            catch (OverFlowException e) 
            {
                System.out.println(e);
            }
        } 
        else 
        {
            stk[top] = x;
        }
    }

    void pop() 
    {
        if (top >= 0) 
        {
            System.out.println("Element popped is: " + stk[top]);
            top--;
        } 
        else 
        {
            try
            {
                throw new UnderFlowException();
            } 
            catch (UnderFlowException e) 
            {
                System.out.println(e);
            }
        }

    }
}