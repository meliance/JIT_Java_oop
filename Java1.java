package employee;

public class Employee {

    String name;
    String id;
    double sal;

    Employee() {
        System.out.println("costructor without variable");
        this.name = "null";
        this.id = "null";
        this.sal = 0.0;
    }

    Employee(String n) {
        System.out.println("costructor with one variable");

        this.name = n;
        this.id = "null";
        this.sal = 0.0;
    }

    Employee(String name, String id) {
        System.out.println("costructor with two variable");

        this.name = name;
        this.id = id;
        this.sal = 0.0;
    }

    Employee(String n, String id, double sal) {
        System.out.println("costructor with three variable");
        this.name = n;
        this.id = id;
        this.sal = sal;
    }

    public static void main(String[] args) {
        Employee ep1 = new Employee();
        System.out.println("ep1="+" "+ep1.name+" "+ ep1.id +" "+ep1.sal);
        Employee ep2 = new Employee("abebe");

        System.out.println("ep2 name="+ " "+ ep2.name + " " + ep2.id+ " " + ep2.sal);
        Employee ep3 = new Employee("biruk"+" "+ "ru0067/12"+" "+ 6000);

        System.out.println("ep3 =" +" "+ep3.name + ep3.id + ep3.sal);
        

    }

}
