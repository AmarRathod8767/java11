package java11;

public class StaticToStaticClass {
	static int x=50;
	
	static void display()
	{
		System.out.println(x);
		x=100;
		System.out.println(x);
		
	}

	public static void main(String[] args) {
		 x=200;//this statement change the value of method out side variable
		display();

	}

}
