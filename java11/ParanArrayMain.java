package java11;

public class ParanArrayMain {

	public static void main(String[] args) {
		
		ParamArray obj=new ParamArray();
		int ar[]= {11,12,13,14,15,16,17,18,19};
		obj.sum(ar);
		int array[]=obj.sub();
		for(int c:array)
		{
		 System.out.println(c);	
		}

	}

}
