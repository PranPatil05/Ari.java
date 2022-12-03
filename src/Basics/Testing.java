package com.company;

public class Testing  {
    public static void main(String[] args) {

        int additionRes = doAddition(30,50);

        int sqrRes = doSquare(additionRes);

        System.out.println("Addition result : "+doAddition(30,50) + " Square result : " +doSquare(additionRes));
    }
    public static int doAddition(int num1, int num2){
        int additionRes = num1+ num2;
        return additionRes;
    }
    public static int doSquare (int num3){
        return num3*num3;
    }

}
