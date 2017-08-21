package exam;

class B {
	public B(){
		System.out.println("Base");
	}
	
	public B(String str){
		System.out.println("父类带参构造");
	}
}

public class Inherit0_Test extends B{
	public Inherit0_Test(){
		System.out.println("子类-默认构造");
	}
	
	public Inherit0_Test(String str){
		System.out.println("子类-String str带参构造");
	}
	
	public Inherit0_Test(String str,int a){
		super(str);
		System.out.println("子类-String str,int a带参构造");
	}
	
	public Inherit0_Test(String str,int a,int b){
		this(str);
		System.out.println("子类-String str,int a,int b带参构造");
	}
	
	public static void main(String[] args){
		//实例化子类的时候，无论是带参构造还是默认构造都将先默认调用父类的默认构造。
		//如果子类使用super显示调用父类的带参构造函数，则不再调用父类默认构造。
		Inherit0_Test a0 = new Inherit0_Test();
		System.out.println("---------------");
		Inherit0_Test a1 = new Inherit0_Test("zhang");
		System.out.println("---------------");
		Inherit0_Test a2 = new Inherit0_Test("zhang",1);
		System.out.println("---------------");
		Inherit0_Test a3 = new Inherit0_Test("zhang",1,2);
	}
}