package Set;

public class Employee implements Comparable<Employee> {
    int id;
    String name;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Employee(int i, String nam){
        this.id=i;
        this.name=nam;
    }

    @Override
    public int compareTo(Employee emp1) {
        int res;
        if (this.id== emp1.id){
            res=0;
        }
        else if (this.id> emp1.id){
            res=1;
        }
        else {
            res=-1;
        }

        return res;
    }

//    @Override
//    public int compareTo(Employee emp) {
//        int res=this.name.compareTo(emp.name);
//        return res;
//    }

}
