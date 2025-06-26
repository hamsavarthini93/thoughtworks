package Polymorphism;

public class Student {
    String name ="Hamsi";

}

 class Book extends Student{
    String name = "Maths";


}

class Main{
    public static void main(String[] args){
        Student s = new Book();
        System.out.println(s.name);
    }
}
