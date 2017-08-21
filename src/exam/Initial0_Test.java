package exam;

//加载一个类的时候，静态变量和静态初始化块就会被执行，因此静态的东西一定在最前面。当实例化对象的时候，才会实例变量，普通初始化块	
//无继承时：初始化顺序依次是（静态变量、静态初始化块）>（变量、初始化块）>构造器。
public class Initial0_Test {
	// 静态变量
	public static String staticField = "静态变量";
	// 变量
	public String field = "变量";
	// 静态初始化块
	static {
		System.out.println(staticField);
		System.out.println("静态初始化块");
	}
	// 初始化块
	{
		System.out.println(field);
		System.out.println("初始化块");
	}

	// 构造器
	public Initial0_Test() {
		System.out.println("构造器");
	}

	public static void main(String[] args) {
		//new Initial0_Test();					//如果注释了这句,则仅加载了该类
	}
}


class XXX{
   public static void main(String[] args)
   {
     //new Initial0_Test();						//注释后就不会去加载Initial0_Test类，而是加载XXX
   }
}
