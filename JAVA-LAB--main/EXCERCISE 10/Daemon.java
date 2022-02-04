class Daemon extends Thread
{   
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println(this+" is a daemon thread.");
        }
        else
        {
            System.out.println(this+" is a user thread.");
        }
    }
    public static void main(String[] args)
    {
        Daemon d = new Daemon();
        Daemon d1 = new Daemon();
        d.setDaemon(true);
        d.start();
        d1.start();
    }
}
