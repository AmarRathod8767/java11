package java11;

public class Const1 {

	int a;
	Const1()
	{
		a=100;
	
	}
	Const1(int a)
	{
		this.a=a;
	}
	Const1(Const1 obj)
	{
		this.a=obj.a;
	}
	void display()
	{
		System.out.println(a*a);
	}
}
