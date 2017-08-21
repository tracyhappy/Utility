package exam;


class A{
	public int i;
}
public class Final1_Test {
	
	public void show(final int a){
		//a=9; 					//编译错误。final变量不能改变其值
	}
	
	public static void main(String[] args) {
		 int x=0;
		 int y=10;
//		 Exception in thread "main" java.lang.ArithmeticException: / by zero
//		 System.out.println(y%x); 
		 
		final A a = new A();	//如果final修饰的是一个对象，就表示这个变量被赋予的引用是不可变的
		//a = new A(); 
		a.i = 5;			    //值是可以变的
		System.out.println(a.i);
		
	}
}
