package Exception_Handling;

public class Classtry extends Exceptionhandlingmethods{

    public static void main(String[] args) throws Exception {
        Exceptionhandlingmethods s1=new Classtry();
         s1.method3();

    }

    public  static void method3() throws NullPointerException {
        System.out.println("I am from classtry method 3");
    }

}
