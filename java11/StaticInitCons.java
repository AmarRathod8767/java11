package java11;

public class StaticInitCons {
	private static int a,b;
	
	{
	 String name="Amar";
	 System.out.println("Init "+name);
	}
	
	static
	{
		a=2;
		b=5;
		int c=a*b;
		System.out.println("1. Static Method "+c);
	}

	
	StaticInitCons(int x,int y)
	{
		
		System.out.println("2.Constructor "+(x+y));
	}
	
	static
	{
		a=100;
		b=200;
		int c=a+b;
		System.out.println("3.Static Method "+c);
	}
	
	static
	{
		a=2;
		b=5;
		int c=a+b;
		System.out.println("4.Static Method "+c);
	}

	public static void main(String[] args) {
		StaticInitCons obj=new StaticInitCons(200,200);

	}
	static
	{
		a=2;
		b=5;
		int c=a+b;
		System.out.println("5.Static Method "+c);
	}

}
