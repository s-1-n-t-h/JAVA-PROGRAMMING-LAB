interface Vehicle
{
    void ChangeGear(int a);void SpeedUp(int b);void ApplyBrakes(int c);
}

class Bicycle implements Vehicle
{
    int s;int g;

    public void ChangeGear(int a)
    {
        g = a;
    }
    public void SpeedUp(int b)
    {
        s+=b;
    }
    public void ApplyBrakes(int c)
    {
        s-=c;
    }
    void states()
    {
        System.out.println("Speed: "+s+" gear: "+g);
    }
}

class Interfaces
{
    public static void main(String[] args)
    {
        Bicycle b = new Bicycle();
        b.ChangeGear(3);b.SpeedUp(2);b.ApplyBrakes(2);

        System.out.println("Bicycle present state: ");
        b.states();
    }

}