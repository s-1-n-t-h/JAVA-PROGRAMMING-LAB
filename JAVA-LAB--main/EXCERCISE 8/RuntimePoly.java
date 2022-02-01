class RuntimePoly extends Base 
{
    void method()
    {
        System.out.println("Runtime Polymorphism");
    }
    public static void main(String[] args) {
        RuntimePoly rp = new RuntimePoly();
        rp.method();
    }
}

class Base 
{
    void method() 
    {
        System.out.println("Base");
    }
}