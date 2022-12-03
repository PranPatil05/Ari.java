package com.company;

public class WrapperImp {
    public static void main(String[] args) {
        /*Integer a=10;
        Float b= (Float) a; //Wrapper Exlicit  promoton i.e Inteher to Float conversion not possible*/

        Integer c=10;
        //Float d= c; it not possible as both are objects
        Float d= Float.valueOf(c);//value of() function requierd call to convert Integer into Float
        System.out.println(d);


    }
}
