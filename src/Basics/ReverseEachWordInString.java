package Basics;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String s="Pranav is Great";

        String[] spilted=s.split(" ");
        int len= spilted.length;

        String[] revresedWords=new String[len];

        for (int i=0;i<len;i++){
            StringBuffer strBu=new StringBuffer(spilted[i]);
            String revese=new String(strBu.reverse());
            revresedWords[i]=revese;
        }

        for (String stri:revresedWords){
            System.out.println(stri);
        }

        String revresedSentecce="";

        for (int j=0;j<revresedWords.length;j++){
            revresedSentecce=revresedSentecce+revresedWords[j]+" ";
        }

        System.out.println(revresedSentecce);


    }
}
