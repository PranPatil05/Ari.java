package Exception_Handling;

public class Demo {
    public static void main(String[] args) {
        try
        {
            System.out.println("Statement 1");
            System.out.println("Statement 2");
//            System.out.println(10/0);
            System.out.println("Statement 3");
            try
            {
                System.out.println("Statement 4");
                System.out.println("Statement 5");
//                System.out.println(10/0);
                System.out.println("Statement 6");
            }
            catch (ArithmeticException e)
            {
                System.out.println("Statement 7");
                System.out.println(10/0);
            }
            finally
            {
                System.out.println("Statement 8");
//                System.out.println(10/0);
            }
            System.out.println("Statement 9");
//            System.out.println(10/0);
        }
        catch (Exception e)
        {
            System.out.println("Statement 10");
            System.out.println(10/0);
        }
        finally
        {
            System.out.println("Statement 11");
//            System.out.println(10/0);
        }
        System.out.println("Statement 12");
    }
    }

