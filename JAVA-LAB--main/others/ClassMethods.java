// creating a class
public class ClassMethods
{

    // class variables

    static String s="Hello!";

    // object methods

    void print_(){
        System.out.println(s);
    }

    void add(int a,int b){
        System.out.println("The Sum of Two numbers is: "+a+b);
    }


    public static void  main(String[] args){
        ClassMethods c = new ClassMethods();
    
        c.print_();
        c.add(8,0);
    }
    

}

