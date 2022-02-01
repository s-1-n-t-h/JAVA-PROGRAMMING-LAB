class UserDefinedException extends Exception
{   
    public String toString()
    {
        return "UserDefinedExceptiion";
    }
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Inside try block.");
            throw new UserDefinedException();
        }
        catch(UserDefinedException e)
        {
            System.out.println("Inside catch block.");
            System.out.println("Exception: "+e);
        }
    }
}
