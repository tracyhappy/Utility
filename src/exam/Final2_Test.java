package exam;

//被final修饰的变量必须被初始化。初始化的方式有以下几种：
//1. 在定义的时候初始化。
//2. final变量可以在初始化块中初始化，不可以在静态初始化块中初始化。
//3. 静态final变量可以在静态初始化块中初始化，不可以在初始化块中初始化。
//4. final变量还可以在类的构造器中初始化，但是静态final变量不可以。

public class Final2_Test {
	// 在定义时初始化
	public final int A = 10;
	public final int B;
	// 在初始化块中初始化
	{
		B = 20;
	}
	// 非静态final变量不能在静态初始化块中初始化
	// public final int C;
	// static {
	// C = 30;
	// }
	// 静态常量，在定义时初始化
	public static final int STATIC_D = 40;
	public static final int STATIC_E;
	// 静态常量，在静态初始化块中初始化
	static {
		STATIC_E = 50;
	}
	// 静态变量不能在初始化块中初始化
	// public static final int STATIC_F;
	// {
	// STATIC_F = 60;
	// }
	public final int G;

	// 静态final变量不可以在构造器中初始化
	// public static final int STATIC_H;
	// 在构造器中初始化
	public Final2_Test() {
		G = 70;
		// 静态final变量不可以在构造器中初始化
		// STATIC_H = 80;
		// 给final的变量第二次赋值时，编译会报错
		// A = 99;
		// STATIC_D = 99;
	}
	// final变量未被初始化，编译时就会报错
	// public final int I;
	// 静态final变量未被初始化，编译时就会报错
	// public static final int STATIC_J;
}