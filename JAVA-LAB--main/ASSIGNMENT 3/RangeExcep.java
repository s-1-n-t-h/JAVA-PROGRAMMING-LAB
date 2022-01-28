class RangeExcep {
    String s;

    RangeExcep(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 6; i++) {
            int marks = Integer.parseInt(args[i]);
            if (marks >= 0 && marks <= 50) 
            {
                sum += marks;
            } 
            else 
            {
                try
                {
                    throw new RangeException("Marks should be in range 0-50");
                }
                catch(RangeException e)
                {
                    System.out.println(e);
                }
            }
        }
        System.out.println("Name: "+args[0]+" Sum = " + sum+" Percentage = "+(sum*100)/300);
    }
}

class RangeException extends RuntimeException 
{

    String s;
    public RangeException(String s) 
    {
        this.s = s;
    }
        
    public String toString()
    {
        return s;
    }
    
}