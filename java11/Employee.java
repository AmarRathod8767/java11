package java11;
import java.util.Scanner;
public class Employee {
	 private int empid;
	  
	  int salary;
	  Scanner s=new Scanner(System.in);
	  void accept()
	  {
		System.out.println("Enter Employee id: ");
		empid=s.nextInt();
		System.out.println("Enter Employee salary: ");
		salary=s.nextInt();
		  
	  }
      void display()
      {
    	  System.out.println("Employee Id: "+empid);
    	  System.out.println("Employee salar: "+salary);
    	 
    	  
      }
}
