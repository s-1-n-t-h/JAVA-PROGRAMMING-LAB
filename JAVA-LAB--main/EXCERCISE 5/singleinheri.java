class singleinheri{


    public static void main(String args[]){

        students st = new students();

        System.out.println("MARKS OF STUDENT:");
        System.out.println("Maths: "+st.m);
        System.out.println("Chemistry: "+st.c);
        System.out.println("Physics: "+st.p);
        System.out.println("English: "+st.e);
        System.out.println("Sanskrit: "+st.s);
    }
}


class marks{

    int m = 75;
    int c = 59;
    int p = 60;
    int e = 77;
    int s = 98;
}
class students extends marks{
    //inherits all variables of class marks
}