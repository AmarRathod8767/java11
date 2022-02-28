package java11;

public class StaticDemo {
	static int x=10;//global static variable
	static int y=20;
    public static void main(String[]args)
    {   
    	int z=500; //local static
    	x=100;
    	System.out.println(x+y+z);
    }

}
