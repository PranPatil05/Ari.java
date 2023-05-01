package Set;

import java.util.TreeSet;

public class ComparableDemo {
    public static void main(String[] args) {
        Employee e1=new Employee(10,"Pranav");
        Employee e2=new Employee(20,"Anuj");
        Employee e3=new Employee(10,"Pranav");
        Employee e4=new Employee(40,"Pranav");

        TreeSet ts=new TreeSet<>();
        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);

        System.out.println(ts);


    }

}
