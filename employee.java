import java.util.Scanner;
public class employee {

    int emp_id;
    String emp_name;
    String emp_designation;
    int salary;

    public static void main(String[] args) {
        employee e=new employee();
        e.emp();
        e.show();
        
    }
    
    public void emp(){
        System.out.println("enter the name = ");
        Scanner Sc =new Scanner(System.in);
        emp_name=Sc.nextLine();
        System.out.println("enter the emp_id = ");
        emp_id=Sc.nextInt();
        System.out.println("enter the emp_designation");
        emp_designation=Sc.nextLine();
        System.out.println("enter the salary");
        salary=Sc.nextInt();
    
        
      



    }

    public void show(){


        System.out.println("the name is"+emp_name);
     
        System.out.println("the id is"+emp_id);
        
        System.out.println("the designation is"+emp_designation);

        
        System.out.println("the salary is"+salary);
    }
}

