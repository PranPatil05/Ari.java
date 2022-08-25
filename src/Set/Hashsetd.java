package Set;

import java.util.*;

public class Hashsetd {
    public static void main(String[] args) {
//        HashSet ha=new HashSet();
//        ha.add(10);
//        ha.add("ABB");
//
//        System.out.println(ha);
//
//        LinkedHashSet ls=new LinkedHashSet();
//
//        ls.add(20);
//        ls.add("ABC");

//        System.out.println(ls);

        Student s1=new Student(10,"Pranav");
        Student s2=new Student(20,"Vikas");
        Student s3=new Student(30,"Aditya");

        System.out.println(s1);
         HashSet aj=new HashSet();
         aj.add(s1);
         aj.add(s2);
         aj.add(s3);

//        System.out.println(aj);
//        RollNoComparator rollCompare = new RollNoComparator();
//        TreeSet ts = new TreeSet(rollCompare);
//        ts.add(s2);
//        ts.add(s3);
//        ts.add(s1);
//        System.out.println(ts);






    }
}
class Student{
    int roll;
    String name;

    public Student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "roll=" + roll +
//                ", name='" + name + '\'' +
//                '}';
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return roll == student.roll && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }




}
//class RollNoComparator implements Comparator<Student>
//{
//    @Override
//    public int compare(Student student1, Student student2) {
//        int res = 0;
//        if (student1.roll > student2.roll)
//            res = 1;
//        else if (student1.roll < student2.roll)
//            res =  -1;
//        else if (student1.roll == student2.roll)
//            res =  0;
//
//        return res;
//    }
//
//}
