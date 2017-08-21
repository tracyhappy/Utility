package exam;


class Base {
	public int x = 2;
	public static int y = 5; 
	
	public int method1(){
		return x;
	}
	public int method2(){
		return y;
	}
	public void method3(){
		System.out.println(x);;
	}
}

//继承。则Sub中含有父类继承下来的变量,也含有自己定义的变量。（静态变量也是可以被继承的）
//若自己定义的变量与从父类继承下来的变量同名。是不会覆盖override的。儿子可以有父亲的属性（比如年龄，性别。但是不能改变父亲的属性的值）
//以下子类含有两个x变量。可以通过super和this区分。

class Sub extends Base{                    
	public int x = 3;
	public static int y = 6; 
	
	public int method1(){
		return x;                //super.x
	}
	public int method2(){
		return y;				 //super.y
	}
	
}


interface AAA{
	int aaa = 10;
}

class BBB{
    int aaa = 11;
   
    public void show(){
    	System.out.println(aaa);
    }
}

class CCC extends BBB implements AAA{
   
	public void display(){
//	      System.out.println(aaa);                //ambiguous,编译报错
	}
}
	
	
/**
 * 
 * 功能：变量不能override。方法可以override。
 * 作者：张学恺
 */
public class DuoTai_Test {
	public static void main(String[] args) {
		Base b = new Sub();					
		System.out.println(b.x);               //2 成员变量是不能覆盖override的
		System.out.println(b.method1());	   //3 向上转型调用子类重写的方法。方法可以override
		System.out.println(b.y);               //5 成员变量是不能覆盖override的
		System.out.println(b.method2());       //6 成员变量是不能覆盖override的
		b.method3(); 						   //2 向上转型可以调用从父类继承的方法和重写的方法。不能调用子类自己的方法
		
		System.out.println("-----------");
		Sub b1 = new Sub();
		System.out.println(b1.x);              //3
		System.out.println(b1.method1());	   //3
		
		CCC c = new CCC();
		c.show();
	}
}





	
	
	