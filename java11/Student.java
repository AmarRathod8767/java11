package java11;
import java.util.Scanner;
public class Student {
	private int rno;
	private String sname;
	private String branch;
	Scanner s=new Scanner(System.in);
	void accept()
	{   System.out.println("Enter Student Roll number:");
		rno=s.nextInt();
		System.out.println("Student Name: ");
		sname=s.next();
		System.out.println("Strudent branch:");
		branch=s.next();
		
	}
	 void display()
	 {
		 System.out.println("Roll Number: "+rno);
		 System.out.println("Student name: "+sname);
		 System.out.println("Branch: "+branch);
		 
	 }

}
