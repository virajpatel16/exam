////1. Create a java class student with data member roll no, name, create a constructor
// with 2 parameters with the same name as data member to 
//initialized data member value, crate a member function display to print all values.
import java.util.Scanner;
public class student {

    int roll;
    String name;

     student(int roll,String name){

        System.out.println("the roll number = "+roll);
        System.out.println("the name = "+name);

     }
     public static void main(String[] args) {
   
        student s =new  student(11,"viraj");
     }
}
