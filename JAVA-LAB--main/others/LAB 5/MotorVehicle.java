class MotorVehicle
{
    String MN;
    String MNo;
    float MP;
    
    void DisplayName()
    {
        System.out.println(MN);
    }
    void price()
    {
        System.out.println(MP);
    }

    void ModelNo()
    {
        System.out.println(MNo);

    }

    public static void main(String[] args)
    {
        Car c1 = new Car("Jaguar XK","X150",27990);
        c1.discount(5.6f);
        c1.display();
    }

}

class Car extends MotorVehicle
{
    Car(String name,String modelno,float modelprice)
    {
        MN = name;
        MNo = modelno;
        MP = modelprice;
    }
    float DR,DP;
    void display()
    {
        System.out.println("Name of the Car: "+MN);
        System.out.println("Model No: "+MNo);
        System.out.println("Car Price: $"+MP);
        System.out.println("Discount rate: "+DR);
        System.out.println("The Discount price is: "+DP);
    }

    void discount(float f)
    {
        DR = f;
        DP = MP-(MP*DR)/100;
    }
}