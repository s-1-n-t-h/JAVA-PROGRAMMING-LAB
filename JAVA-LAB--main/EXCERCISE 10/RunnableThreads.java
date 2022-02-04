class RT1 implements Runnable 
{
    public void run() 
    {
        for(int i=0;i<8;i++)
        {
            try
            {
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Thread is Interrupted");
            }
        }  
    }
}


class RT2 implements Runnable
{
    public void run()
    {
        for(int i=0;i<8;i++)
        {
            try
            {
                System.out.println("Hello");
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Thread is Interrupted");
            }
        }     
    }
}

class RT3 implements Runnable
{
    
    public void run()
    {
        for(int i=0;i<8;i++)
        {
            try
            {
                System.out.println("Welcome");
                Thread.sleep(3000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Thread is Interrupted");
            }
        }     
    }
    
}
class RunnableThreads 
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new RT1());
        Thread t2 = new Thread(new RT2());
        Thread t3 = new Thread(new RT3());
        t1.start();t2.start();t3.start();
    }
}
