package exam;

public class Inherit1_Test {
	int mine = 9;

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.getMine());
	}
}

class Child extends Inherit1_Test {
	int getMine() {
		return mine;
		// return this.mine;
	}
}
