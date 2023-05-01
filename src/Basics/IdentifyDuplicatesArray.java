package Basics;

public class IdentifyDuplicatesArray {
    public static void main(String[] args) {
        int[] in={2,5,6,2,1,5,3};
        intArr(in);
        char[] cg={'a','b','A','a','C','B','D'};
        charAr(cg);
        System.out.println("Ignore Case");
        CharUpperLower(cg);



    }

    public static void intArr(int[] in){
        for (int i=0;i< in.length;i++){
            int j=0;
            for (j=0;j<i;j++){
                if (in[i]==in[j]){
                    System.out.println(in[i]);
                    break;
                }
            }
//            if (i==j){
//                System.out.println(in[i]);
//            }
        }
    }

    public static void charAr(char[] ch){
        for (int i=0;i< ch.length;i++){
            int j=0;
            for (j=0;j<i;j++){
                if (ch[i]==ch[j]){
                    System.out.println(ch[i]);
                    break;
                }
            }
            if (i==j){
                System.out.println(ch[i]);
            }
        }
    }
    public static void CharUpperLower(char[] ch){
        for (int i=0;i< ch.length;i++){
            int j=0;
            for (j=0;j<i;j++){
                if (String.valueOf(ch[i]).equalsIgnoreCase(String.valueOf(ch[j]))){
//                    System.out.println(ch[i]);
                    break;
                }
            }
            if (i==j){
                System.out.println(ch[i]);
            }
        }
    }
}
