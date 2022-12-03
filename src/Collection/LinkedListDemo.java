package Collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(10);
        ll.add("ABC");
        ll.add("ABC");
        ll.add(20);
        ll.add("def");
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.element());
        System.out.println(ll.peek());
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
        System.out.println(ll.offer(30));
        //System.out.println(ll.pop());
        ll.pop();

        System.out.println(ll);

        ll.addFirst(10);
        ll.addLast(40);
        System.out.println(ll);
        System.out.println("Clone>>>>>>>>>>>>>"+ll.clone());

        ArrayList al=new ArrayList(ll);


//        ll.remove(3);
         //ll.poll();//write and remove first element
//       System.out.println(ll.poll());
//        System.out.println(ll.pollFirst());
//        System.out.println(ll.pollLast());
//        ll.push(50);
        Iterator s=ll.descendingIterator();//Reverse the order of current Linkedlist
        while(s.hasNext()){
            System.out.println(s.next());
        }

        System.out.println("Final="+ll);

        Student s1=new Student(10,"Ram");
        Student s2=new Student(20,"Sham");
        Student s3=new Student(30,"Ajit");

        LinkedList sl=new LinkedList();
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);

        System.out.println("sl>>>>>>>>>>>>>>>>>>"+sl);





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
