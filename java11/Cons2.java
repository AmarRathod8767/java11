package java11;

public class Cons2 {
	int a,b,c;
	Cons2(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	void function()
	{
		c=a+b;
	}
	Cons2(Cons2 obj)
	{
		this.a=obj.a;
		
	}
    void function2()
    {
    	c=a+b;
    }
	
	void display()
	{
		System.out.println(c);
	}
}
