package TreeSet;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx {

    public static void main(String[] args) {

        Student s1 = new Student(1,"Ram");
        Student s2 = new Student(2,"Sham");
        Student s3 = new Student(3,"Abc");

        RollNoComparator rollCompare = new RollNoComparator();

        TreeSet ts = new TreeSet(rollCompare);
        ts.add(s2);
        ts.add(s3);
        ts.add(s1);
        System.out.println(ts);
    }
}

class Student
{
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}

class RollNoComparator implements Comparator<Student>
{
    @Override
    public int compare(Student student1, Student student2) {
        int res = 0;
        if (student1.roll > student2.roll)
            res = 1;
        else if (student1.roll < student2.roll)
            res =  -1;
        else if (student1.roll == student2.roll)
            res =  0;

        return res;
    }

}

