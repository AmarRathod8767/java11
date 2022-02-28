package java11;

public class StaticExampleWithDiffClassMain {

	public static void main(String[] args) {
		int z=50;
		StaticExampleWithDiffClass.x=500;
		System.out.println(StaticExampleWithDiffClass.x+StaticExampleWithDiffClass.y);

	}

}
