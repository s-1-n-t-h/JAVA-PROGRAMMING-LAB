import java.util.*;
class racers{
    int[] a = new int[5];
    double avg;
    Scanner s = new Scanner(System.in);
    void input(){
        for(int i = 1;i<=5;i++){
            System.out.print("Input speed of racer "+i+": ");
            a[i-1] = s.nextInt();
        }
    }
    void avgs(){
        int sum = 0;
        for(int i=0;i<5;i++){
            sum += a[i];
        }
        
        avg = sum/a.length;
        
        for(int i =1;i<=5;i++)
        {
            if(a[i-1]>avg){
                System.out.println("racer no "+i+" speed is: "+a[i-1]);
            }
        }
    }
    
    public static void main(String[] args)
    {
        racers r = new racers();
        r.input();
        System.out.println("The list of Qualifying Racers are: ");
        r.avgs();
        
    }
}