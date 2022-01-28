import java.io.FileNotFoundException;

class finallyKeyWord
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Inside try block.");
            throw new FileNotFoundException("File Does't Exist.");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Inside catch block.");
            System.out.println("Exception: "+e);     
        
            //throw new NullPointerException("Null Pointer Exception.");
        }
        finally
        {
            System.out.println("I always execute.");
        }
    }
}
