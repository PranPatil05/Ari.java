package PracticeProblems;

public class pall {
//    public static void main(String[] args)
//    {
//        String s1="Pranav";
//
//        StringBuffer s2=new StringBuffer(s1);
//        String revs1=new String(s2.reverse());
//
//        if(s1.equals(revs1)){
//        System.out.println("String "+ s1 +" is Pallindrome");
//        }else{
//        System.out.println("String "+ s1 +" is not Pallindrome");
//        }
//
//    }


    public static void main(String[] args)
    {
        String s1 ="ABBA";
        int j=0;

        char[] s1Str=s1.toCharArray();
        char[] recStr= new char[s1Str.length];

        for(int i=s1Str.length-1;i>=0;i--){

            recStr[j]=s1Str[i];
            j++;
        }

        String rev=new String(recStr);

        System.out.println(rev);

        if(s1.equals(rev)){
        System.out.println("String "+ s1 +" is Pallindrome");
    }else{
        System.out.println("String "+ s1 +" is not Pallindrome");
    }
    }
}
