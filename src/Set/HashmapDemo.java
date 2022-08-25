package Set;

import java.util.HashMap;

public class HashmapDemo {

    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        String[] s= {"s","a","v"};
        int[] in={1,3,4};




        for (int j=0;j<s.length;j++){
            map.put(s[j],in[j]);
        }

        System.out.println(map);
    }
}
