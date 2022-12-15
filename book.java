/*1. Create a java class Book with data member book_id, title and author. Initialize all member
variable value using default and parameterized constructor.*/

public class book {

    int book_id = 1;
    String title="ramayan";
    int page=222;

    book(){

        System.out.println("the book_id is" +" = " +book_id);

        System.out.println("  ");

        System.out.println("the book_id is"+" = "+title);

        
    }
    book(int a){
        System.out.println("the page is "+" = "+page);
    }
    public static void main(String[] args) {
        
        book a =new book();
   
        book b =new book(222);
    }

    
}
