package String;

public class Stringtrial {

    public static void main(String[] args) {
        String s1="Ind12%ia@Is34Grea45t";
        String alphabeticalStr="";
        String numericStr="";
        String specialCharStr="";

        for(int i=0;i<s1.length();i++) {
            if(Character.isAlphabetic(s1.charAt(i))) {
                alphabeticalStr=alphabeticalStr.concat(String.valueOf(s1.charAt(i)));
            }
            else if(Character.isDigit(s1.charAt(i))) {
                numericStr=numericStr.concat(String.valueOf(s1.charAt(i)));
            }
            else{
                specialCharStr=specialCharStr.concat(String.valueOf(s1.charAt(i)));
            }

        }
        System.out.println(alphabeticalStr);
        System.out.println(numericStr);
        System.out.println(specialCharStr);

    }

}

