import java.io.*;
class ExceptionDemo{
    void display()throws Exception{
        int x,y,z;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter two Number:");
        x=Integer.parseInt(br.readLine());
        y=Integer.parseInt(br.readLine());

        z=x/y;
        System.out.println(z);
    }
    public static void main(String[] args) {
        ExceptionDemo de=new ExceptionDemo();
        try
        {
            de.display();

        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero");
        }
    }
}