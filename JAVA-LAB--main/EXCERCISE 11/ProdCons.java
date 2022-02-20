class Producer extends Thread
{
    StringBuffer sb = new StringBuffer();
    public void run()
    {
        synchronized(sb)
        {
            for(int i=0;i<=10;i++)
            {
                sb.append(i+" : ");
                System.out.println("Appending");

                try
                {
                    Thread.sleep(100);
                }
                catch(InterruptedException e)
                {}
            }
            sb.notify();

        }
    }
}
class Consumer extends Thread
{
    Producer prod;
    Consumer(Producer prod)
    {
        this.prod = prod;
    }
    public void run()
    {
        synchronized(prod.sb)
        {
            try
            {
                prod.sb.wait();
            }
            catch(InterruptedException e)
            {}
            System.out.println("Data is: "+prod.sb);
        }
    }
}

class ProdCons
{
    public static void main(String[] args)
    {
        Producer p = new Producer();
        Consumer c = new Consumer(p);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t2.start();
        t1.start();
    }
}