class throwKeyWord 
{    public static void main(String[] args)
    {
        try
        {
            throw new StringIndexOutOfBoundsException("Accesing Out of Index of array.");
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("Exception Occured : "+e);
        }
    }
}
