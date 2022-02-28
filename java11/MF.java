package java11;

public class MF {
	private static int x, y;
	int a,b;
	static void addition()
	{
		MF o=new MF();
		x=100;
		y=200;
		o.a=50;
		o.b=60;
		System.out.println("static addition: "+(x+y));
		System.out.println("daynamic addition: "+(o.a+o.b));
	}
	
	void subtraction()
	{
		
		x=1000;
		y=400;
		
		a=5000;
		b=2000;
		System.out.println("static subtraction: "+(x-y));
		System.out.println("daynamic subtraction: "+(a-b));
	}

}
