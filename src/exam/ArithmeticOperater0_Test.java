package exam;

//自增与自减运算符还遵循以下规律：
//1. 可以用于整数类型byte、short、int、long，浮点类型float、double，以及字符串类型char。
//2. 在Java5.0及以上版本中，它们可以用于基本类型对应的包装器类
//Byte、Short、Integer、Long、Float、Double、Character。
public class ArithmeticOperater0_Test {
	
	private int aaa;
	
	private ArithmeticOperater0_Test(){}

	public static void main(String[] args) {
		System.out.println(new ArithmeticOperater0_Test().aaa);   //成员变量默认值为0
		int i=0;
		System.out.println(i++);          //0
		
		float f=0.1F;
		f++;
		double d=0.1;
		d++;
		char c='a';
		c++;
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		
		Integer pack = new Integer(0);
		pack++;
		System.out.println("pack = " + pack);
	}
}

class Person11{
	
	public void play(){
//		new ArithmeticOperater0_Test();				//private构造函数后，不能在外部new
		
	}
}
