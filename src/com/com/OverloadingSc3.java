package com.com;

public class OverloadingSc3 {
    public void method(Object a){
        System.out.println("Object executed");
    }
    public void method(Number a){
        System.out.println("Number executed");
    }
  /*  public void method(Integer a){
        System.out.println("Integer executed");
    }*/

    public static void main(String[] args) {
        OverloadingSc3 obj=new OverloadingSc3();
        obj.method (null);
    }
}
