package PracticeProblems;

import java.util.TreeSet;

public class CompareToDemo{
    public static void main(String[] args){

        Employee e1=new Employee(10,"Ram");
        Employee e2=new Employee(30,"Sham");
        Employee e3=new Employee(20,"Amar");

        TreeSet<Employee> ts=new TreeSet<>();
//        idcompare idcom=new idcompare();
//
//        TreeSet<Employee> ts= new TreeSet<>(idcom);



        ts.add(e1);
        ts.add(e2);
        ts.add(e3);


        System.out.println(ts);
    }
}

class Employee implements Comparable{
    int id;
    String name;

    public Employee(int id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Object O){
        Employee e=(Employee) O;

        if(this.id==e.id)
            return 0;
        else if(this.id>e.id)
            return 1;
        else
            return -1;
    }
//    public int compareTo(Object o){
//        Employee e=(Employee) o;
//
//        int res=this.name.compareTo(e.name);
//        return res;
//    }
}

//class idcompare implements comparator<Employee>{
//
//    public int compare(Employee e1,	Employee e2){
//        if(e1.id==e2.id)
//            return 0;
//        else if(e1.id>e2.id)
//            return 1;
//        else
//            return -1;
//    }
//}
