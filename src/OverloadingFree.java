public class OverloadingFree {
    public static void main(String[] args) {
        test(1.3,3);
        test(1,3.2);

    }

    public static void test(double a, Integer b){
        System.out.println("Inside double a, Integer b");
    }

    public static void test(double a, Double b){
        System.out.println("double a, Double b");
    }
}
