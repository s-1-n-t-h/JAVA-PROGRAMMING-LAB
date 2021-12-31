package DataStructures;
import java.util.*;
interface queues
{
    //EnQueue
    void EnQueue(int x);
    int DeQueue();
    boolean isFull();
    boolean isEmpty();
    void expand();
}

public class queue implements queues
{
    int[] a = new int[5];
    // pointer to the index o fthe top element
    int t=-1,b=-1;
    public void EnQueue(int x)
    {
        if(isFull()){expand();a[++b] = x;}
        else if(isEmpty()){++t;++b;a[b]=x;}
        else{ a[++b] = x;}
       
    }
    public int DeQueue()
    {
        return a[t++];
    }
    public boolean isEmpty()
    {
        if (b == -1){return true;}
            
        else{return false;}     
    }
    public boolean isFull()
    {
        if(b==a.length-1){return true;}
        else{return false;}
    }
    public void expand()
    {
        int[] B = new int[2*a.length];
        for(int i=t;i <= b;i++)
        {
            B[i] = a[i];
        }
        a = B;
    }

    public void start()
    {
        queue S = new queue();
        Scanner s = new Scanner(System.in);
        int c;
        while(true)
        {
            System.out.println("1. EnQueue 2. DeQueue 3. isFull 4. isEmpty 5. exit");
            c = s.nextInt();
            if(c==5)
            {
                break;
            }
            switch(c)
            {
                case 1:
                    System.out.print("Element: ");
                    S.EnQueue(s.nextInt());
                    break;
                case 2:
                    System.out.println("Element DeQueueped: "+S.DeQueue());
                    break;
                case 3:
                    System.out.println(String.valueOf(S.isFull()));
                    break;
                case 4:
                    System.out.println(String.valueOf(S.isEmpty()));
                    break;
                    
            }
        }
        
    }
    public static void main(String[] args){}
}



