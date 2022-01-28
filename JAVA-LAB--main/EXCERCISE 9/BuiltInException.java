import java.io.IOException;

class BuiltInException 
{
    public static void main(String[] args)
    {
        try
        {
            throw new IOException("IO Exception Occured.");
        }
        catch(IOException i)
        {
            System.out.println("Exception: "+i);
        }
    }
}
