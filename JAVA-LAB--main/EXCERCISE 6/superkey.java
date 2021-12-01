class sup {
    String s = "This is Super Class's Variable.";

    void ntg(){
        System.out.println("This is Super Class's method.");
    }

    sup(){
        System.out.println("This is Super Class's Constructor.");
        
    }
}

class Sub extends sup{
    String s = "This is Sub Class's Variable.";

    void ntg(){
        System.out.println(super.s);
        System.out.println("This is Sub Class's method.");
        super.ntg();
    }

    Sub(){
        System.out.println("This is Sub Class's Constructor.");

    }
}

class superkey{

    public static void main(String[] args){
        Sub i = new Sub();
        System.out.println(i.s);
        i.ntg();
        

    }
}