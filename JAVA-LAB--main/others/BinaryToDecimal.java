import java.util.*;

class BinaryToDecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i=0,r,n,d=0;
        System.out.print("input a binary number: ");
        n = sc.nextInt();

        while(n>0)
        {
            r = n%10;
            n = n/10;
            d = d + (int)(r*Math.pow(2,i));
            i++;
        }

        System.out.println("decimal number is: "+d);

    }
}