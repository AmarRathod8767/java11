package java11;
import java.util.Scanner;
public class StudentRollMain {
	public static void main(String[]args)
	{   
		int r;
		String n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nUmber of Student: ");
		
		StudentRoll obj[]=new StudentRoll[sc.nextInt()];
		for(int i=0;i<obj.length;i++)
		{
			obj[i]=new StudentRoll();
			System.out.println("Enter Roll Number: ");
			r=sc.nextInt();
			System.out.println("ENter Student Name:");
			n=sc.next();
			obj[i].accept(r, n);
			
			
		}
		
		for(int i=0;i<obj.length;i++)
		{
			obj[i].display();
		}
		
		
		
		
		
		
		
	}

}
