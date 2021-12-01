class AssetValue{
    public static void main(String[] args)
    {
        long i = 10000;
        float iv;
        iv = i+(0.2f*i);
        System.out.println("the value of the investment after 1st year: "+iv);

        iv = iv-500;
        System.out.println("the value of the investment after 2nd year: "+iv);

        iv = iv + iv*0.16f;
        System.out.println("the value of the investment after 3rd year: "+iv);
    }
}