package com.company;

public class Boxing {
    public static void main(String[] args) {
        int a = 10;
        Integer i = new Integer(a);//Boxing
        Integer h= i;//Confirmation of coversion int to Integer
        System.out.println(h);

        Integer j = new Integer (i);//Unboxing
        int b=j;//confirmation of conversion of Integer to int
        System.out.println(b);
    }
}
