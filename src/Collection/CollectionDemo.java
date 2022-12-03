package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {
    private static Object ArrayList;

    public static void main(String[] args) {
        ArrayList obj= new ArrayList();
        obj.add(10);
        obj.add("ABC");
        obj.add(10);
        obj.add("DEG");
        obj.add("ABC");
//        System.out.println(obj);
        obj.size();
//        System.out.println(obj.size());
        obj.add(1,"hjk");
//        System.out.println(obj);
        //obj.remove("ABC");
//        System.out.println(obj.get(0));
        //obj.set(2,1000);
//        System.out.println(obj.indexOf(10));
//        System.out.println(obj.lastIndexOf("ABC"));
//        System.out.println(obj.subList(1,4));
        //obj.clear();
        //obj.removeAll(obj.subList(1,4));
        //obj.removeAll(Collections.singleton("ABC"));
        obj.removeAll(obj);
        //System.out.println(obj.subList(1,4));
//        System.out.println("Last"+obj);

        Iterator itr= obj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }



    }
        }
