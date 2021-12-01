class ConsOver{
    // default constructor
    ConsOver(){
        System.out.println("Constructor 1");
    }

    // parametricized constructors

    // Overloading the constructor

    ConsOver(int i,int j)
    {
        System.out.println("Constructor 2");
    }

    ConsOver(float f, int j){
        System.out.println("Constructor 3");
    }

    ConsOver(float f, float j){
        System.out.println("Constructor 4");
    }

    ConsOver(float f, int j, String s){
        System.out.println("Constructor 5");
    }


    public static void main(String[] args){

        ConsOver c = new ConsOver();
        ConsOver c1 = new ConsOver(1,2);
        ConsOver c2 = new ConsOver(2.3f,9);
        ConsOver c3 = new ConsOver(7.2f,4.3f);
        ConsOver c4 = new ConsOver(8.2f,6,"kishore");
    }
}