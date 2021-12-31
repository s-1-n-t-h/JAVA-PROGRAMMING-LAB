//package DataStructures;
import java.util.*;
interface stacks
{
    //push
    void push(int x);
    int pop();
    boolean isFull();
    boolean isEmpty();
    int Top();
    void expand();
}

class stack implements stacks
{
    int[] a = new int[30];
    // pointer to the index o fthe top element
    int t=-1;
    public void push(int x)
    {
        if(isFull()){expand();a[++t] = x;}
        else{ a[++t] = x;}
       
    }
    public int pop()
    {
        return a[t--];
    }
    public boolean isEmpty()
    {
        if (t==-1){return true;}
            
        else{return false;}     
    }
    public boolean isFull()
    {
        if(t==a.length){return true;}
        else{return false;}
    }
    public int Top()
    {
        return a[t];
    }
    public void expand()
    {
        int[] b = new int[2*a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i] = a[i];
        }
        a = b;
    }
}

public class STACKS{
    public static void main(String[] args)
    {
        stack S = new stack();
        Scanner s = new Scanner(System.in);
        int c;
        while(true)
        {
            System.out.println("1. Push 2. Pop 3. isFull 4. isEnpty 5. Top 6. exit");
            c = s.nextInt();
            switch(c)
            {
                case 1:
                    System.out.print("Element: ");
                    S.push(s.nextInt());
                    break;
                case 2:
                    System.out.print("Element popped: "+S.pop());
                    break;
            }
        }
        
    }
}