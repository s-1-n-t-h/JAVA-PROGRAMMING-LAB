import java.io.*;
class StrBuffer
{
    public static void main(String[] args)
    {
        StringBuffer s = new StringBuffer("This is a un deleted string.");
        System.out.print("Original String: ");
        System.out.println(s);
        s.delete(9,12);
        System.out.print("AFter Deletion String: ");
        System.out.println(s);
    }
}