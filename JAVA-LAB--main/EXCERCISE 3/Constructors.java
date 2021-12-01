class Constructors
{
    // default constructor

    Constructors()
    {
        System.out.println("Default Constructor");
    }

    // parametricized constructor
    Constructors(float f,int i)
    {
        System.out.println("Parametricized Constructor");
        
    }

    public static void main(String[] args){

        Constructors c = new Constructors();
    
        Constructors c1 = new Constructors(8.97f,3);
    }
    
}