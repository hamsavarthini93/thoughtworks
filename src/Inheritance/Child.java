package Inheritance;

public class Child extends Parent{
    String designation;
    String location;


   Child(String designation,String location) {
       super();
   }
    void display(){
       Child child  = new Child("Manager","Bangalore");
       System.out.println("Designation"+" "+child.designation);
       System.out.println("Location"+" "+child.location);
       parentDisplay();
   }

    public static void main(String[] args){
      //  display();


    }

}
