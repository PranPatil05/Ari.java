package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList obj= new ArrayList();
        obj.add(10);
        obj.add("ABC");
        obj.add(10);
        obj.add("DEG");
        obj.add("ABC");
        LinkedList ll=new LinkedList();
        ll.add(10);
        ll.add("ABC");
        ll.add("ABC");
        ll.add(20);
        ll.add("def");

//        Iterator itr=obj.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

//        do {
//            System.out.println(itr.next());
//        }while (itr.hasNext());

        ListIterator li=obj.listIterator(obj.size());

        while (li.hasPrevious()){
            System.out.println(li.previous());
        }

        Iterator s=ll.descendingIterator();
        while (s.hasNext()){
            System.out.println(s.next());
        }


    }
}
