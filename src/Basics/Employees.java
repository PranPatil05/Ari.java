package Basics;

public class Employees {
    public static void main(String[] args) {
        EncapDemo enCap=new EncapDemo();

        enCap.setName("Pranav");
        enCap.setId(1);

        System.out.println("Nmae"+enCap.getName());
        System.out.println("id"+enCap.getId());

    }
}
class EncapDemo {
    private String name;
    private int id;

    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

}