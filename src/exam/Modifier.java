package exam;

/**
 *   new了对象以后，无论是变量还是方法:
 *   public修饰的话，在哪里都可以进行访问。
 *   protected修饰的话，本类，同包，子类里都可以访问。
 *   default修饰的话，本类，同包可以访问。
 *   private修饰的话，仅本类可以访问。
 */

//作用域      当前类 同一package 子孙类 其他package 
//public     √     √          √       √ 
//protected  √     √          √       × 
//friendly   √     √          ×       × 
//private    √     ×          ×       × 
public class Modifier {
	
	public int a=1;
	
	protected int b=2;
	
	int c=3;
	
	private int d=4;
	
	public void display1(){
		
	}
	
	protected void display2(){
			
	}
	
    void display3(){
    	display4();								//private修饰的话,仅本类能访问
	}
	
	private void display4(){
		
	}
	
	private void test(){
		//无继承,现在这种情况属于:本类,同包情况
		Modifier obj = new Modifier();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);				//private，只能在本类里面才能访问	
		
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();							//private，只能在本类里面才能访问
	}

}


class TestXX{
	
	void test(){
		//无继承,现在这种情况属于:同包情况
		Modifier obj = new Modifier();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		//System.out.println(obj.d);		//private，只能在本类里面才能访问	
		
		obj.display1();
		obj.display2();
		obj.display3();
		//obj.display4();					//private，只能在本类里面才能访问
	}
	
	//不同包的情况参看exam1包下的DiffPackage.java
	
}
