package java11;

public class DaynamicToDaynamicClass {
    int x=100;
	
    void display()
	{
		System.out.println(x);
		x=500;
		System.out.println(x);
	}
	 
	public static void main(String[]args)
	{
		DaynamicToDaynamicClass obj=new DaynamicToDaynamicClass();
        obj.display();
		
	}

}
