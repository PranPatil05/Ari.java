package Exception_Handling;

public class Exceptionhandlingmethods {



//    public static void main(String[] args)throws Exception {
//        method1();
//        try {
//            System.out.println(10/0);
//        }
//        catch (ArithmeticException e) {
//            System.out.println("can not divide by zero");
//            e.printStackTrace();
//            System.out.println(e.toString());
//            System.out.println(e.getMessage());
////            ArithmeticException f= new ArithmeticException();
////            throw f;
//        }
//        catch (Exception e) {
//            System.out.println("can not divide by zero");
//        }
//
//
//
//    }
    public  static void method1() throws Exception{
        System.out.println("I am from method 1");
        method2();
    }
    public  static void method2() throws Exception {
        System.out.println("I am from method 2");
        method3();
    }
    public  static void method3() throws Exception,RuntimeException {
        System.out.println("I am from method 3");
        System.out.println(10/0);
    }

}
