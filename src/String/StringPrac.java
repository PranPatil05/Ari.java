package String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringPrac {
    public static void main(String[] args) {
        String s1="Pranav";
        String s2="Patil";

        String s3=s1.concat(s2);
        System.out.println(s2);
        System.out.println(s1);
        System.out.println(s3);

        String s4="Pranav";
        String s5="Patil";

        String s6=s4+s5;
        System.out.println(s6);

        System.out.println(s3.equals(s6));
        System.out.println(s3 == s6);

        System.out.println(s3+123);
        System.out.println(s3.concat("Extra"));

        HashMap<String,Integer> test=new HashMap<>();
        test.put("Pranav",10);
        test.put("Anuj",20);
        test.put("Raju",30);
        test.put("Pranav",40);

        System.out.println(test);

        Iterator<Map.Entry<String,Integer>> itr=test.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String,Integer> ele=itr.next();
            System.out.println(ele.getKey()+"   "+ele.getValue());
        }

    }

}
