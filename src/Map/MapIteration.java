package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {

    public static void main(String[] args) {

        Map<String, String> myMap = new HashMap<>();

        myMap.put("AAA", "Pune");
        myMap.put("JJJ", "Mumbai");
        myMap.put("ZZZ", "Kolhapur");
        myMap.put("CCC", "Sangli");

        //for-each on Entry Set
        for (Map.Entry<String,String> entry : myMap.entrySet())
        {
            System.out.println("Key : "+entry.getKey() +" Value : "+entry.getValue());
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // for-each on Keyset
        for (String k : myMap.keySet())
        {
            System.out.println("Key : "+k + " Value : "+myMap.get(k));
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //Iterating over values
        for (String v : myMap.values())
        {
            System.out.println(v);
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //Iterating Map using while Loop with Entryset
        Iterator<Map.Entry<String,String>> itr = myMap.entrySet().iterator();
        while(itr.hasNext())
        {
            Map.Entry<String, String> entry = itr.next();
            System.out.println("Key : "+entry.getKey() +" Value : "+entry.getValue());
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //Iterating Map using while Loop with Keyset
        Iterator<String> itr1 = myMap.keySet().iterator();
        while(itr1.hasNext())
        {
            String key = itr1.next();
            System.out.println("Key :" +key+" Value : "+myMap.get(key));
        }


    }
}
