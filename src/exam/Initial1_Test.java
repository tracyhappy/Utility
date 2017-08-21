package exam;
//对于静态变量和静态初始化块之间、变量和初始化块之间的先后顺序:
//实际上这取决于它们在类中出现的先后顺序。同样，变量和初始化块也遵循这个规律。
class TestA {
	public TestA() {
		System.out.println("Test--A");
	}
}

class TestB {
	public TestB() {
		System.out.println("Test--B");
	}
}

class TestOrder {
	// 静态变量
	public static TestA a = new TestA();
	
	// 静态初始化块
	static {
		System.out.println("静态初始化块");
	}
	
	// 静态变量
	public static TestB b = new TestB();
	
}

public class Initial1_Test {
	public static void main(String[] args) {
		new TestOrder();
	}
}

