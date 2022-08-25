package Exception_Handling;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Starting main execution...");
        int a = 10;
        int b = 0;
        int division = 0;
        try
        {
            division = a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Can not divide by zero ArithmeticException ");
        }
        catch (Exception e)
        {
            System.out.println("Can not divide by zero... ");
        }

        System.out.println("Division is : "+division);
        System.out.println("main execution ended..!!");
    }
}
