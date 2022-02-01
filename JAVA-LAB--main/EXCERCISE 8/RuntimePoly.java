class RuntimePoly extends Base 
{
    void method()
    {
        System.out.println("Runtime Polymorphism");
    }
    public static void main(String[] args) {
        Base b = new RuntimePoly();
        b.method();
    }
}

class Base 
{
    void method() 
    {
        System.out.println("Base");
    }
}