package Basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast_Safe_Demo {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("A");
        myList.add("B");
        myList.add("C");

        Iterator itr = myList.listIterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
            myList.add("D");
        }

    }
}
