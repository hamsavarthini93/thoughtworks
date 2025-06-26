package Inheritance;

public class Parent extends GrandParent{
    int salary;
    String department;

    public Parent(int salary, String department) {
        super();
        this.salary = salary;
        this.department = department;
    }

    public Parent(String name, int age, int salary, String department) {
        super(name, age);
        this.salary = salary;
        this.department = department;
    }

    public Parent() {

    }

    void parentDisplay(){
        Parent parent = new Parent(400,"IT");
        System.out.println("Salary"+" "+parent.salary);
        System.out.println("Department"+" "+parent.department);
        displayGrantParent();
    }


}
