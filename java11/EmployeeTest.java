package java11;
import java.util.Scanner;
public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Employee:");
		 int num=sc.nextInt();
		 int sum=0;
		 int max=0;
		Employee obj[]=new Employee[num];
		for(int i=0;i<obj.length;i++)
		{
         obj[i]=new Employee();
         obj[i].accept();
         

		}
		for(int i=0;i<obj.length;i++)
		{
		 sum=sum+obj[i].salary;
		 obj[i].display();	
		 if(max<obj[i].salary)
		 {
			 max=obj[i].salary;
		 }
		}
		 System.out.println("Sum of salary: "+sum);
		 System.out.println("Maximum Salary: "+max);
	}

}
