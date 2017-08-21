package exam;


class Base1 {
	
	public Base1(){
		method();
	}
	
	public void method(){
		System.out.println("Base的方法");
	}
}

public class DuoTai1_Test extends Base1{

	
	public void method(){      				 //重写基类
		System.out.println("Child的方法");
	}
	
	
	public static void main(String[] args) {
		Base1 b = new DuoTai1_Test();   	//向上转型,调用重写的方法（Child的方法）
		DuoTai1_Test c = new DuoTai1_Test();  //没转型

		b.method();             //调用重写的方法（Child的方法）
		
	}

}
