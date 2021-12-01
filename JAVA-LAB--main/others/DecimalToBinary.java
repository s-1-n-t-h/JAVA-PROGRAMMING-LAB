import java.util.*;
class DecimalToBinary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("input a number to convert into binary: ");
        int n = sc.nextInt();
        int r,b=0;
        while(n>0){
            r = n%2;
            b = b*10 + r;
            n = n/2;
        }
        System.out.print("the number in binary is: ");
        System.out.println(b);
    }
}