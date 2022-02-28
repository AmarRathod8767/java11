package java11;

public class StringClass {

	public static void main(String[] args) {
		String s="hello";
		String s1="hello";
		String s2=new String("hello");
		if(s==s2)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equals");
		}
		if(s.equals(s2))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not equal");
		}

	}

}
