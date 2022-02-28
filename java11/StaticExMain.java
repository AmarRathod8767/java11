package java11;

public class StaticExMain {

	public static void main(String[] args) {
	  StaticDemoEx obj=new StaticDemoEx();
	  obj.addition();
     System.out.println(obj.x);
      
      StaticDemoEx obj1=new StaticDemoEx();
      obj1.addition();
      obj1.x=2000;
      System.out.println(obj1.x);
	}

}
