package exam;

//final类中的属性可以被改变，但是其方法变为了final
//abstract不能与final并列修饰同一个类
//被final修饰的变量必须被初始化。
//如果final修饰的是一个对象，就表示这个变量被赋予的引用是不可变的

//被final修饰的变量必须被初始化。初始化的方式有以下几种：
//1. 在定义的时候初始化。
//2. final变量可以在初始化块中初始化，不可以在静态初始化块中初始化。
//3. 静态final变量可以在静态初始化块中初始化，不可以在初始化块中初始化。
//4. final变量还可以在类的构造器中初始化，但是静态final变量不可以。

public final class Final0_Test {
	private int a;
	private final int b;        //报错。被final修饰的变量必须被初始化。
	
	
	public Final0_Test(){
		b=3;
	}
	
	public void show(){
		System.out.println("a :" + a);
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		Final0_Test final_Test = new Final0_Test();
		final_Test.setA(9);//改变属性值
		final_Test.show();
	}
}

