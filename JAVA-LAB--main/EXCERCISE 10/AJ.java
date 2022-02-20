class Thread1 extends Thread
{
    public void run()
    {
        for(int i = 0; i < 8; i++)
        {
            System.out.println(i);
        }
    }
}

class AJ 
{
    public static void main(String[] args)
    {
        Thread1 t = new Thread1();
        t.start();
        System.out.println("t is alive: " + t.isAlive());
        try
        {
            t.join();
        }
        catch(InterruptedException e)
        {}
        System.out.println("t is alive: " + t.isAlive());
    }
}