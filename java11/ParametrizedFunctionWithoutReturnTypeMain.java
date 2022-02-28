package java11;
import java.util.Scanner;
public class ParametrizedFunctionWithoutReturnTypeMain {

	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a,b;
	    ParametrizedFunctionWithoutReturnType obj=new ParametrizedFunctionWithoutReturnType();
	    System.out.println("Enter first Integer number: ");
	    a=s.nextInt();
	    System.out.println("Enter Second integer number: ");
		b=s.nextInt();
		obj.multiplication(a, b);

	}

}
