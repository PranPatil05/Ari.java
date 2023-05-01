package String;

public class SpiltDemo {
    public static void main(String[] args) {
        String str="Ok is Good Good is Ok,Ok";
        String[] strarry=str.split(" ");
//        System.out.println(strarry);
        int countOk=0;
        int countis=0;
        int countGood=0;
        String[] arrayFinal;
        int j=0;

//        for (String s : strarry){
//            System.out.println(s);
//            if (s.equals("Ok")){
//                countOk++;
//            } else if (s.equals("is")) {
//                countis++;
//            }
//            else {
//                countGood++;
//            }
//        }
//
//        System.out.println(countOk);
//        System.out.println(countis);
//        System.out.println(countGood);

        for (String st:strarry){
            System.out.println(st);
            String[] str1=st.split(",");
            if (str1.length==1){

            }
        }
    }
}
