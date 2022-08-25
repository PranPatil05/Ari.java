package PracticeProblems;

class PalindromCheck{
    public static void main(String[] args){
        int i=1221;
        String s1= new String(String.valueOf(i));
        boolean res=isPalindrome(s1);
        System.out.println("Is String is Palindrome"+res);

    }
//    public static boolean isPalindrome(String input){
//        StringBuffer sb=new StringBuffer(input);
//        String revStr= new String(sb.reverse());
//
//        if(revStr.equalsIgnoreCase(input)){
//            return true;
//        }else{
//            return false;
//        }
//    }
public static boolean isPalindrome(String input){
    char[] inputStr=input.toCharArray();
    char[] revStr=new char[inputStr.length];
    int j=0;

    for(int i=inputStr.length-1;i>=0;i--){
        revStr[j]=inputStr[i];
        j++;
    }

    String reverseString=new String(revStr);

    if(reverseString.equals(input)){
        return true;
    }else{
        return false;
    }


}
}
