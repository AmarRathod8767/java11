package java11;
import java.util.Scanner;
public class StudentMarkMain {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sub[]= {"Hindi","English","Maths","Phisics","Chemistry"};
		System.out.println("Enter number of Student: ");
		StudentMark obj[]=new StudentMark[s.nextInt()];
		float ag=0;
		for(int i=0;i<obj.length;i++)
		{
			obj[i]=new StudentMark();
			int marks[]=new int[5];
			
			System.out.println("Enter record for student "+(i+1));		
			for(int j=0;j<5;j++)
			{
				System.out.println("Enter subject mark "+sub[j]);
				marks[j]=s.nextInt();
				
				
			}
			obj[i].enterSubjectMarks(sub,marks);
			obj[i].calculateMarks();
			ag+=obj[i].per;
			 
		}
		System.out.println("Aggregte percentage is "+ag/obj.length);

	}

}
