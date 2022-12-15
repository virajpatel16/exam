import java.util.Scanner;
public class bank {

    public static void main(String[] args) {
        cul c = new cul();
        c.show();
        c.getrateinsterest();
        
    }
    
}
abstract class bank1{
    abstract void getrateinsterest();
   int rate;
   int inerest;
   int c;
   abstract void show();



}
class cul extends bank1{

    public void show(){
        System.out.println("enter the rate");

        Scanner Sc =new Scanner(System.in);
        rate = Sc. nextInt();
        System.out.println("enter the inersetr");
        inerest=Sc.nextInt();

    }



    public void getrateinsterest(){
       c=rate*inerest/100;



       System.out.println("the rate of inerest is "+c);

    }
}
