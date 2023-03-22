public class FreePractice{
    static int a;
    public static void main(String[] args) {
        FreePractice fp=new FreePractice();
        test(a);
        int a=10;
        test(a);
        System.out.println(a);
        int c=100;
        Integer d=c;
        Double e= Double.valueOf(c);

        String q="pra";
        String r="nav";

        System.out.println(q+r);
        System.out.println(a+q);
        System.out.println(q+a+r);
        System.out.println(a+"abc");
        System.out.println("abc"+10);
    }
    public FreePractice(){
        this.a=20;
        System.out.println(a);
    }
    public static void test(int a){

        System.out.println("a ="+a);
    }

}

