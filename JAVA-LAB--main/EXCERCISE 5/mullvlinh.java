public class mullvlinh {
    public static void main(String[] args){
        intrest cal = new intrest();
        System.out.println("Intrest Amount to be paid is: "+cal.in);

    }
}

class deposit{
    static float bal = 70000f;
}

class inrate extends deposit{
    static float i = 7.23f;
}

class intrest extends inrate{
    static float in = (bal*i)/100;
}