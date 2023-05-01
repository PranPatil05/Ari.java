package Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        String s1="AAA";
        String s2="AAA";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        Map<String, Integer> imap = new IdentityHashMap();
        imap.put(s1, 10);
        imap.put(s2, 20);
        System.out.println(imap);

        System.out.println(imap.keySet());
        System.out.println(imap.entrySet());
        System.out.println(imap.values());

        Map<String, Integer> hm = new HashMap();
        hm.put(s1, 10);
        hm.put(s2, 20);
        System.out.println(hm);


    }
}
