package java11;

public class StudentTest {

	public static void main(String[] args) {
		Student obj1=new Student();
		{
		obj1.accept();
		obj1.display();
		}
		Student obj2=new Student();
		{
			obj2.accept();
			obj2.display();
			}
	}

}
