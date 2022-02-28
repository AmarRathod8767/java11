package java11;

public class DaynamicTOStaticClass {
     int x=100; //daynamic variable
      
      static void display()
      {  
    	DaynamicTOStaticClass obj=new DaynamicTOStaticClass(); 
    	obj.x=50;
    	 System.out.println(obj.x);
    	  
      }
	public static void main(String[] args) {
		DaynamicTOStaticClass obj1=new DaynamicTOStaticClass();
		obj1.x=2000;
		obj1.display();
		System.out.println(obj1.x);
		

	}

}
