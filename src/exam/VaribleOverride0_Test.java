package exam;

class ParentClass {
	public int i = 10;
}

class Child_Class extends ParentClass {
	public int i = 30;
}

public class VaribleOverride0_Test {

	public static void main(String[] args) {
		ParentClass parentclass = new Child_Class();
		Child_Class subClass = new Child_Class();
		System.out.println(parentclass.i + subClass.i);			//40
	}

}
