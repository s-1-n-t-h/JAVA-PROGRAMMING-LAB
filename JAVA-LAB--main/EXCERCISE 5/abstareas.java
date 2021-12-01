import java.util.*;
public class abstareas {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        extension sh = new extension();

        sh.circle(s.nextInt());
        sh.rectangle(s.nextInt(),s.nextInt());
        sh.square(s.nextInt());
    }
}

abstract class Shapes{

    abstract void circle(int x);
    
    abstract void rectangle(int x,int y);
    
    abstract void square(int x);

}

class extension extends Shapes{

    void circle(int x){   
        System.out.println("Area of circle: "+(3.14*Math.pow(x,2)));  
    }
    
    void rectangle(int x,int y){  
        System.out.println("Area of rectangle: "+x*y); 
    }
    
    void square(int x){
        System.out.println("Area of square: "+Math.pow(x,2));
    }
}






