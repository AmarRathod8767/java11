package java11;

public class Constructor {
	int a=1000;
	int b=2000;
	Constructor()
	{
		a=100;
		b=200;
		
		System.out.println(a+b);
	}
	Constructor(int x)
	{
		a=x;
		System.out.println(a+b);
	}
	Constructor(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}
	Constructor(Constructor obj, Constructor obj1)
	{
		this.a=obj.a;
		this.b=obj.b;
		System.out.println(a+","+b);
		this.a=obj1.a;
		this.b=obj1.b;
		System.out.println(a*b);
	}

}
