import java.util.*;
class InchesToCm
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the length in inches: ");
        
        float f = sc.nextFloat();
        System.out.print("the length in centimeters is: ");
        System.out.println(2.54f*f);
    }
}