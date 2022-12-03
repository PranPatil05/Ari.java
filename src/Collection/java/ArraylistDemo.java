package Collection.java;

import java.util.*;

public class ArraylistDemo {
    public static void main(String[] args) {

        Student s1 = new Student(10, "Ram");
        Student s2=new Student(20,"Sham");

        ArrayList<Student> al3=new ArrayList<>();

        al3.add(s1);
        al3.add(s2);

        System.out.println(al3);


        List al = new ArrayList();
        al.add(10);
        al.add("ABC");
        al.add('A');
        al.add(20);
        al.add(10);
        al.add(30);
        al.add(s1);
        al.add(s2);

        System.out.println(al);

        LinkedList<java.io.Serializable> ll = new LinkedList<>();

        ll.add(10);
        ll.add("BAC");
        ll.add(20);

        ArrayList al2 = new ArrayList(al);
        System.out.println(al2);

        System.out.println(ll);

        System.out.println(al.indexOf(10));
        System.out.println(al.size());
        //System.out.println(al.remove(2));
        System.out.println(al.hashCode());
        System.out.println(al.containsAll(al2));
        Iterator ltr = al.iterator();
        while (ltr.hasNext()) {
            System.out.println(ltr.next());
            //al.add(20);//Gives concurrent modification exception during iteration add or remove element (i.e Structural change) not allowed
        }
        ListIterator k = al.listIterator();
        while (k.hasNext()) {
            System.out.println((k.next()));
        }


        System.out.println("Final-----" + al);


    }
}

    class Student
    {
        int rollNo;
        String name;

        public Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "rollNo=" + rollNo +
                    ", name='" + name + '\'' +
                    '}';
        }
    }


