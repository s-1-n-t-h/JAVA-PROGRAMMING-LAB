public class MultipleCatch 
{    public static void main(String args[])
    {
        int[] arr = new int[]{0,1,3,9,10};

        try
        {
            System.out.println("Dividing Two No's: "+arr[1]/arr[0]);
            
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception Occured.");

            try
            {
                System.out.println("Accesing element in the array: "+arr[4]);
            }
            catch(ArrayIndexOutOfBoundsException a)
            {
                System.out.println("Array Index Out of Bound Exception Occured.");
            }
        }
        

        System.out.println("No Abnormal Termination Occured.");

    }
}
