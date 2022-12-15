public class exam1 {

    public static void main(String[] args) {
        book1 b = new book1();
        book1 k = new book1(1,"ramayan");
    }
    
}
class book1{


     int book_page;
     String book_name;

     book1(){
        System.out.println("the book_name is  =  mahabhart");
        System.out.println("the book_page is =  220");

     }
    

    

    book1(int book_id,String book_title){

        System.out.println("enter the book_id =  "+book_id);
        System.out.println("enter the book_title = "+book_title);



    }

}