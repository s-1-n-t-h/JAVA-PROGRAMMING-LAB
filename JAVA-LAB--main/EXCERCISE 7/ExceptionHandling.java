import java.util.*;
class ExceptionHandling
{
    
    
    public static void main(String[] args)
    {
        // declaring two integer variables
    int a,b;
    
    // creating Scanner Object 

    Scanner s = new Scanner(System.in);
    
    

    // reading values from user
    System.out.print("Enter two numbers: ");
    a = s.nextInt();
    b = s.nextInt();

    try
    {
        System.out.println();
        System.out.println("The Division of Numbers is: "+a/b);
    }
    catch(ArithmeticException e)
    {
        System.out.println("Enter Proper Numbers.");
        System.out.print("Enter two numbers: ");

        // reading values from user

        a = s.nextInt();
        b = s.nextInt();
        System.out.println("The Division of Numbers is: "+a/b);

    }
    }
}
