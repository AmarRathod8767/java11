package java11;

public class StaticToDaynamicClass {
    
	static int x=60,y,z;
	
	void accept()
	{
	    x=100;
		y=200;
		z=x+y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		
		StaticToDaynamicClass obj=new StaticToDaynamicClass();
		System.out.println(x);
		obj.accept();
		x=500;
		System.out.println(obj.x);

	}

}
