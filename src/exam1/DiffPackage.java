package exam1;

import exam.Modifier;
//作用域      当前类 同一package 子孙类 其他package 
//public     √     √          √       √ 
//protected  √     √          √       × 
//friendly   √     √          ×       × 
//private    √     ×          ×       × 


class ChildX extends Modifier{
	//现在这种情况属于:不同包的子类情况，仅public和protected修饰的可以访问
	public void haha(){
		System.out.println(a);				
		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		
		display1();
		display2();
//		display3();
//		display4();
	}
	
	void haha1(){
		
	}
}


public class DiffPackage{
	
	void test(){
		//无继承,现在这种情况属于:不同类,不同包的情况,仅public修饰的可以访问
		Modifier obj = new Modifier();
		System.out.println(obj.a);
		obj.display1();
	}

	void test2(){
		//继承
		ChildX child = new ChildX();
		System.out.println(child.a);
		child.display1();
		child.haha();
	}
}
