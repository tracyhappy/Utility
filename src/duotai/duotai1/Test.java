package duotai.duotai1;


public class Test {

	public static void fun(A a) {   //向上转型
		a.fun1();                   //能实现各自重写的fun1
		if ((a instanceof B)){    
			B b = (B)a;             //向下转型
			b.fun3();                //实现自身的fun3方法
		} 
		if ((a instanceof C)){
			C c = (C)a;             //向下转型
			c.fun3();				//实现自身的fun3方法
		}
	}
	
	public static void main(String[] args) {
	/*
		A a = new B();		   //向上转型
		a.fun1();              //向上转型后，会调用子类中覆写过的方法
		a.fun2();              
	  //a.fun3();              //错误！向上转型后无法调用子类中独立的新方法
	*/
	
//		A a = new B();		   //向上转型
//		B b = (B)a; 		   //向下转型
// 		b.fun1();              //向下转型后，调用子类中覆写过的方法
//		b.fun2();			   //向下转型后，调用子类中覆写过的方法	
//		b.fun3();              //也可以调用子类中独立的新方法
	 
	 
		fun(new B());
		fun(new C());	
	 
	 
//		A a = new B();
//		System.out.println((a instanceof A));   //true
//		System.out.println((a instanceof B));   //true
//		
//		A a1 = new A();
//		System.out.println((a1 instanceof A));   //true
//		System.out.println((a1 instanceof B));   //false
	
		
		
		
		
		
	}
	
	

}
