package Basics;

public class RemoveJunk {
    public static void main(String[] args) {
//        String s="3837#$##$GPranav787#$Patil";
        String s="3837#$# #$GPr  anav787#$  Patil";
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);

        String s1="Pranav is here Please Contact Him";
//        s1=s1.replaceAll(" ","");
        s1=s1.replaceAll("\\s","");
        System.out.println(s1);

    }
}
