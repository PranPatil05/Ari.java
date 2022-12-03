package Constructor;

public class StaticBlo {
    int i;
    String s;
    static
    {
        System.out.println("Inside A's static Block!!!");
    }

    {
        System.out.println("Inside A's instance Block!!!");
    }

    public StaticBlo(int i, String j)
    {
        System.out.println("in A's constructor!!");
        this.i = i;
        this.s = j;
    }

    public static void main(String[] args) {
        System.out.println("inside main method...");
        StaticBlo a = new StaticBlo(10, "Abc");
        StaticBlo a1 = new StaticBlo(20, "Pqr");

    }
}
