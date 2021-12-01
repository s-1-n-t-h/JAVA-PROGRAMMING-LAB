import java.util.*;
class Pattern{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("inpout n: ");

        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            else
            {
                for(int j=0;j<n/2;j++)
                {
                    System.out.print(" ");
                }
                for(int j=0;j<n;j++)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }
}