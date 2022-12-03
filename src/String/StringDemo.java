package String;

public class StringDemo {

    public static void main(String[] args) {

        String s = new String("ABC");
        String s1 = "ABC";
        String s2 = "ABC";

        System.out.println("reference equality : "+ (s == s1)); //reference equality
        boolean res = s1.equals(s2); //content equality
        System.out.println("content equality : "+res);
        System.out.println(s1 == s2);
        int a=s1.length();

        String s3 = "ABCDEFG";
        char c = s3.charAt(2);
        System.out.println(c);
        System.out.println(s3.length());

        System.out.println(s3.substring(5));// begin index
        System.out.println(s3.substring(2,5));// start index and end index

        System.out.println(s3.contains("a"));

        String s4 = "ABC";
        String s5 = "Abc";
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));
        s.intern();
        System.out.println(s4.concat(s5));
        System.out.println(s4+s5);


        System.out.println(s5.toUpperCase());
        System.out.println(s5.toLowerCase());

    }
}