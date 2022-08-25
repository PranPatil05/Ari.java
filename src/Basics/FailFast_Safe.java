package Basics;

import java.util.*;

public class FailFast_Safe {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("A");
        myList.add("B");
        myList.add("C");

        Iterator itr = myList.listIterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
            // myList.add("D");
        }
        System.out.println(">>>>>>>>>>>>>enumeration>>>>>>>>>>");
        //failsafe example
        Vector<String> myVector = new Vector<>();
        myVector.add("A");
        myVector.add("B");
        myVector.add("C");

        Enumeration en = myVector.elements();

        while (en.hasMoreElements())
        {
            myVector.add("D");
            System.out.println(en.nextElement());
        }

    }
}
