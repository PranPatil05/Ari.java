package Basics;

public class Palindrom {
    public static void main(String[] args) {

//        boolean res = isPalindrome("ABBA");
//        System.out.println("isPalindrome : " + res);

        int num=123;
        int rev=0;
        System.out.println("Intial Number= "+num);
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println("Reverse Number = "+rev);



    }
    //Using StringBuffer
    //    public static boolean isPalindrome(String input){
//            StringBuffer sb = new StringBuffer(input);
//            String revStr = new String(sb.reverse());
//            if (revStr.equals(input))
//                return true;
//            else
//                return false;
//        }
    /*Using Char array*/

    public static boolean isPalindrome(String inp) {
        char[] cha = inp.toCharArray();
        char[] revcha = new char[cha.length];
        int j = 0;

        for (int i = cha.length - 1; i >= 0; i--) {
            revcha[j] = cha[i];
            j++;
        }
        System.out.println(cha);
        System.out.println(revcha);

        String rev=new String(revcha);

        if(inp.equals(rev))
            return true;
        else
            return false;

    }




}