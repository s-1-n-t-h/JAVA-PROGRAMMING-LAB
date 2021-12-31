package STR;
import java.util.*;
interface strings
{
    void reverseString();
}

class Str implements strings
{
    public void reverseString()
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.print("Enter String: ");
        sb.append(sc.nextLine());
        sb.reverse();
        System.out.println();
        System.out.print("Reversed String: "+sb);
    }
}

public class StrRev extends Str
{
    public static void main(String[] args)
    {
    }
}