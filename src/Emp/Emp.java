package Emp;

public class Emp {
    private int eid;
    private float salary;
    private String ename;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Emp(){

    }

    public void display(){
        System.out.println("Eid"+" "+eid);
        System.out.println("Salary"+" "+salary);
        System.out.println("Ename"+" "+ename);

    }
    @Override
    public String toString(){
        return "Eid: 5\n"
                +"Ename: Rahul\n"
                +"Salary: 340f\n";
    }

    public static class Laptop {
    }
}
