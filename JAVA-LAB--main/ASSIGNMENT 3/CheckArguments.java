class CheckArguments extends RuntimeException
{
    public String toString()
    {
        return "CheckArgumentsException";
    }
    public static void main(String[] args) {
        if(args.length<5)
        {
            try 
            {
                throw new CheckArguments();
            } 
            catch (CheckArguments e) 
            {
                System.out.println(e);
            }
        }
        
        else
        {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println("Sum = " + sum);
        }
    }
}
