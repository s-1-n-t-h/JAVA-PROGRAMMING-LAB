class MethodOver
{
    void method()
    {
        System.out.println("method 1");
    }
    void method(float f)
    {
        System.out.println("method 2");
    }
    void method(String s)
    {
        System.out.println("method 3");
    }

    public static void main(String[] args){
        MethodOver m = new MethodOver();
        m.method();
        m.method(9.8f);
        m.method("ramesh");

    }
}

