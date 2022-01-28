import java.util.*;
public class WordCount {
    int CountChar(String s)
    {
        return s.length();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        
        WordCount wC = new WordCount();
        String S = new String();java
        S = sc.nextLine();
        System.out.println();
        
        System.out.print("No.of Characters: "+wC.CountChar(S));
    }
}
