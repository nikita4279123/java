class exception{
    public static void main(String[] args) {
        int a=10;
        int b=8;
        int c=8;
        int x,y;
        try
        {
            x=a/(b-c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero");
 }
 y=a/(b+c);
 System.out.println("y="+y);
 }
}