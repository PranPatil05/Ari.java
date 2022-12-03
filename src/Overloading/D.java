package Overloading;

//Overloading Senario
public class D extends C{
    public static void method3()
    {
        System.out.println("D - Method 3");
    }

    public static void main(String[] args) {
        D a=new D();
        a.method3();

        C b=new C();
        b.method3();

        C d=new D();//Parent Method is C so method called is Parent
        d.method3();

    }

}
