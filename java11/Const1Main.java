package java11;

public class Const1Main {

	public static void main(String[] args) {
		
		Const1 obj=new Const1();
		Const1 obj1=new Const1(150);
	    Const1 obj2=new Const1(obj);
        obj.display();
        obj1.display();
        obj2.display();
	}

}
