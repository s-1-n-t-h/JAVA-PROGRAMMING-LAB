class RangeException extends RuntimeException 
{
     public String toString()
    {
        return "RangeException";
    }
    
    public static void main(String[] args) 
    {
        int sum = 0;
        for (int i = 1; i <= 6; i++) {
            int marks = Integer.parseInt(args[i]);
            if (marks >= 0 && marks <= 50) {
                sum += marks;
            } 
            else
            {
                try {
                    throw new RangeException();
                } 
                catch (RangeException e) {
                    System.out.println(e);
                    return;
                }
                
            }
        }
        System.out.println("Name: " + args[0] + " Sum = " + sum + " Percentage = " + (sum * 100) / 300);
    }
}