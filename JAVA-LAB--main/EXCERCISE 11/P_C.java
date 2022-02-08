class P_C
{
    public static void main(String[] args)
    {
        PCP pcp = new PCP();
        new Thread()
        {
            public void run()
            {
                pcp.consumer();
            }
        }.start();
        new Thread() {
            public void run() {
                pcp.producer();
            }
        }.start();
    }
}

class PCP
{
    boolean produce = false;
    
    synchronized void producer()
    {
        if(this.produce==false)
        {
            System.out.println("Producer is producing");
            produce = true;
            System.out.println("Producer is done producing");
            notify();
        }
    }

    synchronized void consumer()
    {
        if(this.produce==false)
        {
            System.out.println("Consumer is waiting for product");
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println("Consumer is interrupted");
            }
            System.out.println("Consumer is consuming");
           
        }
    }
}