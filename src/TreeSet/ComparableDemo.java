package TreeSet;

import java.util.TreeSet;

public class ComparableDemo {
    public static void main(String[] args) {
        Emoloyee e1 = new Emoloyee(1, "AAAA");
        Emoloyee e2 = new Emoloyee(8, "JJJJ");
        Emoloyee e3 = new Emoloyee(5, "ZZZZ");

        TreeSet ts= new TreeSet();



        ts.add(e2);
        ts.add(e1);
        ts.add(e3);

//        ArrayList<Emoloyee> al=new ArrayList<>();
//        al.add(e1);
//        al.add(e2);
//        al.add(e3);

//        System.out.println(al);

    }

}
class Emoloyee implements Comparable{
    int empId;
    String name;

    public Emoloyee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Emoloyee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }


    public int compareTo(Object o){
        Emoloyee e = (Emoloyee) o;
        if (this.empId == e.empId)
            return 0;
        else if (this.empId > e.empId)
            return 4;
        else
            return -2;

    }

//    public int compareTo(Object o){
//        Emoloyee e = (Emoloyee) o;
//        int res=this.name.compareTo(e.name);
//        return res;
//    }





}






