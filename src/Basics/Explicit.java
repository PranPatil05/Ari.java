package Basics;

public class Explicit {
    public static void main(String[] args) {
        double k= 166.66;
        float s= (float) k;
        long i= (long)k;
        int o= (int)i;
        int r= (int)k;

        System.out.println("k="+k);
        System.out.println("i="+i);
        System.out.println("o="+o);
        System.out.println("r="+r);
        System.out.println("s="+s);

    }
}
