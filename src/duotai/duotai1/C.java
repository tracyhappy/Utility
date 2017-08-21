package duotai.duotai1;

public class C extends A {

	@Override
	public void fun1() {
		System.out.println("C---------->fun1()");
	}

	@Override
	public void fun2() {
		System.out.println("C---------->fun2()");
	}
	
	public void fun3() {                          //自身独立的方法
		System.out.println("C---------->fun3()");
	}
	
}
