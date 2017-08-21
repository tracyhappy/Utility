package exam;
/*继承中初始化顺序
	父类--静态变量
	父类--静态初始化块
	子类--静态变量
	子类--静态初始化块
	父类--变量
	父类--初始化块
	父类--构造器
	子类--变量
	子类--初始化块
	子类--构造器
*/

//大家可能会注意到一点，那就是，并不是父类完全初始化完毕后才进行子类的初始化。
//实际上子类的静态变量和静态初始化块的初始化是在父类的变量、初始化块和构造器初始化之前就完成了。
//加载一个类的时候，静态变量和静态初始化块就会被执行。因此静态的东西一定在最前面。

class Parent {
	// 静态变量
	public static String p_StaticField = "父类--静态变量";
	// 变量
	public String p_Field = "父类--变量";
	// 静态初始化块
	static {
		System.out.println(p_StaticField);
		System.out.println("父类--静态初始化块");
	}
	// 初始化块
	{
		System.out.println(p_Field);
		System.out.println("父类--初始化块");
	}

	// 构造器
	public Parent() {
		System.out.println("父类--构造器");
	}
}

class SubClass extends Parent {
	// 静态变量
	public static String s_StaticField = "子类--静态变量";
	// 变量
	public String s_Field = "子类--变量";
	// 静态初始化块
	static {
		System.out.println(s_StaticField);
		System.out.println("子类--静态初始化块");
	}
	// 初始化块
	{
		System.out.println(s_Field);
		System.out.println("子类--初始化块");
	}

	// 构造器
	public SubClass() {
		System.out.println("子类--构造器");
	}

}

public class Initial2_Test {
	// 程序入口
	public static void main(String[] args) {
		new SubClass();
	}
}