package java11;

public class Addition1 {
	static int x=0;
	   int y;
	   int z;
	   
  static void acceptX(int x)
   {
	  Addition1.x=x;
   }
   
  static void displayX()
  {
	  System.out.println(x); 
	   
  }
  
   void acceptY(int y)
   {
	   
	  this.y=y; 
   } 
  void functionZ()
   {
	   z=x+y;
	   
   }
   
   void displayZ()
   {
	   System.out.println(z);
   }
}
