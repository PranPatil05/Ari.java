package com.company;

public class OverloadingSc1  {

    public void method(int a)
    {
        System.out.println("inside method with primitive param");
    }

    public void method(Float a)
    {
        System.out.println("inside method with wrapper param");
    }

   // public void method(long a, int b)
   // {
   //     System.out.println("inside method with (long int) param");
   // }

    public void method(int a, long b)
    {
        System.out.println("inside method with (int long) param");
    }
    //public void method(int a, int b)
    //{
    //    System.out.println("inside method with (int int) param");
    //}
    //public void method(long a, long b)
    //{
    //    System.out.println("inside method with (long long) param");
    //}

    public static void main(String[] args) {
        OverloadingSc1 obj = new OverloadingSc1();
        obj.method(10);
        //obj.method(10L,20);
        //obj.method(10,20L);
        //obj.method (10,20);
        //obj.method(10L,20L);
    }

}

