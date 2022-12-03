package Collection;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector ls = new Vector();
        ls.add("A");
        ls.add("B");
        ls.add("C");
        ls.add("D");
        ls.add("D");
        ls.add("D");
        ls.add("D");
        ls.add("D");
        ls.add("D");
        ls.add("D");
        ls.add("D");


        System.out.println(ls);

        Student1 s1=new Student1(10,"Ram");
        Student1 s2=new Student1(30,"Ram");
        Student1 s3=new Student1(20,"Ram");

        Vector vo=new Vector();

        vo.add(s1);
        vo.add(s2);
        vo.add(s3);
        System.out.println(vo);


    }

}
class Student1
{
    int rollNo;
    String name;

    public Student1(int rollNo, String name) {
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
