package java11;
import java.util.Scanner;
public class ParametrizedFunctionWithReturnTypeMain {

	public static void main(String[] args) {
		
		int a,b;
		Scanner s=new Scanner(System.in);
		ParametrizedFunctionWithReturnType obj=new ParametrizedFunctionWithReturnType();
		System.out.println("Enter first number ");
		a=s.nextInt();
		System.out.println("Enter second number ");
		b=s.nextInt();
		int ret=obj.division(a, b);
		System.out.println(ret);
	}

}
