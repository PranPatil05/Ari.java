package Basics;

import java.util.Objects;

public class StringUpperandLowerCaseSeperation {
    public static void main(String[] args){

        String s = "I am Pranav Patil";
        char[] ch=s.toCharArray();
        int upper=0;
        int lowercase=0;
        int number=0;
        int other=0;
        int space=0;

        for(int i=0;i<s.length();i++){
            char ch1=ch[i];

            if(ch1>='A'&&ch1<='Z'){
                upper++;
                System.out.println(ch1);
            }
            else if(ch1>='a' && ch1<='z'){
                lowercase++;
                System.out.println(ch1);
            }
            else if(ch1>='0' && ch1<='9'){
                number++;
                System.out.println(ch1);
            }
            else if(Objects.equals(ch1, ' ')){
                space++;
                System.out.println(ch1);
            }
            else{
                other++;
                System.out.println(ch1);
            }


        }
        System.out.println("Number of Uppercase=="+upper);
        System.out.println("Number of Lowercase=="+lowercase);
        System.out.println("Number of Number=="+number);
        System.out.println("Number of other=="+other);
        System.out.println("Number of space=="+space);
    }
}
