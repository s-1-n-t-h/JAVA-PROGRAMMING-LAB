class UserDefinedException extends Exception
{
    String s;
    UserDefinedException(String message)
    {
        s = message;
    }
    public String toString()
    {
        return "Inside toString() method.";
    }
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Inside try block.");
            throw new UserDefinedException("UserDefinedException");
        }
        catch(UserDefinedException e)
        {
            System.out.println("Inside catch block.");
            System.out.println("Exception: "+e);
        }
    }
}
