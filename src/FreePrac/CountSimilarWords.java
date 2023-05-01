package FreePrac;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountSimilarWords {
    public static void main(String[] args) {
        String sen="Hook is Crook Crook is Hook";

        HashMap<String,Integer> duplicates=new HashMap<String, Integer>();

        String[] words=sen.split(" ");

        for(String s:words){
            System.out.println(s);
        }

        for (int i=0;i< words.length;i++){
            if (duplicates.containsKey(words[i])){
                duplicates.put(words[i], duplicates.get(words[i])+1);
            }
            else {
                duplicates.put(words[i],1);
            }
        }
        for (String wo:duplicates.keySet()){
            System.out.println(wo+"  "+duplicates.get(wo));
        }

    }
}
