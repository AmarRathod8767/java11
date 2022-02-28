package java11;

public class Cons2Main {

	public static void main(String[] args) {
		
		  Cons2 obj1=new Cons2(1000,2000);
		  Cons2 obj=new Cons2(obj1);
		  obj1.function();
		  obj.function2();
		  obj.display();
		  obj1.display();

	}

}
