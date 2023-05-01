package String;

public class Replaceawith {
    public static void main(String[] args) {
        String s="Madagascar Camp";
        String aReplace="";

        char[] ch=s.toCharArray();
        int aCount=0;

        for (int i=0;i< ch.length;i++){
            if (ch[i]=='a'){
                aCount++;
                for (int j=0;j<aCount;j++){
                    aReplace=aReplace+'@';
                }
            }else {
                aReplace=aReplace+ch[i];
            }
        }

        System.out.println(aReplace);
    }
}
