package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparableDemo2 {
    public static void main(String[] args) {
        Employee e1= new Employee(1,"Pranav");
        Employee e2= new Employee(5,"Anuj");
        Employee e3= new Employee(3,"Aditya");

        Idcompare idcomp=new Idcompare();
        NameCompare namecomp=new NameCompare();

        TreeSet ts=new TreeSet(namecomp);
        TreeSet ts2=new TreeSet(idcomp);



        ts.add(e2);
        ts.add(e1);
        ts.add(e3);

        ts2.add(e2);
        ts2.add(e1);
        ts2.add(e3);

        System.out.println(ts);
        System.out.println(ts2);

    }
}

class Employee{
    int empId;
    String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
        public String toString() {
            return "Employee{" +
                    "empId=" + empId +
                    ", name='" + name + '\'' +
                    '}';
        }
}
class Idcompare implements Comparator<Employee>{


    @Override
    public int compare(Employee e1, Employee e2) {

        if (e1.empId == e2.empId)
            return 0;
        else if (e1.empId > e2.empId)
            return 1;
        else
            return -1;
    }
}

class NameCompare implements  Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        int res=e1.name.compareTo(e2.name);
        return res;

    }
}

