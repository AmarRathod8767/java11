package java11;
import java.util.Scanner;
public class PramJaggedMain {

	public static void main(String[] args) {
     
		PramJagged obj=new PramJagged();
		
		int arr[][]=new int[2][];
		arr[0]=new int[5];
		arr[1]=new int[3];
		
		for(int i=0;i<arr.length;i++)
		{
		for(int j=0;j<arr[i].length;j++)
		{ 
			System.out.println("Enter arary elemnt "+i+""+j+" index");
			arr[i][j]=new Scanner(System.in).nextInt();
	    }
			
		}
		obj.jarr(arr);
		
	}

}
