import DataStructures.*;
import java.util.*;
public class StackTest {
    public static void main(String[] args)
    {
        stack S = new stack();
        Scanner s = new Scanner(System.in);
        int c;
        while(true)
        {
            System.out.println("1. Push 2. Pop 3. isFull 4. isEnpty 5. Top 6. exit");
            c = s.nextInt();
            switch(c)
            {
                case 1:
                    System.out.print("Element: ");
                    S.push(s.nextInt());
                    break;
                case 2:
                    System.out.print("Element popped: "+S.pop());
                    break;
            }
        }
        
    }
    
}
