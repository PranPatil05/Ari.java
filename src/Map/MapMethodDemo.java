package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapMethodDemo {


        public static void main(String[] args) {

            Map<String, Integer> map = new HashMap<>();

            map.put("BBB", 10);
            map.put("AAA", 20);
            map.put("TTT", 10);
            map.put("VVV", 40);

            System.out.println(map);

            System.out.println(map.size());
            System.out.println(map.isEmpty());
            System.out.println("contains key AAA : "+map.containsKey("AAA"));
            System.out.println("contains key 10 : "+map.containsValue(10));

            System.out.println(map.keySet());
            System.out.println(map.entrySet());
            System.out.println(map.values());

            Set<Integer> uniqSet = new HashSet(map.values());
            System.out.println(uniqSet);
        }

    }

