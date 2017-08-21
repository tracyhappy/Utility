package duotai.duotai1;

public class B extends A {

	@Override
	public void fun1() {
		System.out.println("B-------->fun1()");
	}

	@Override
	public void fun2() {
		System.out.println("B-------->fun2()");
	}
	
	public void fun3() {                       //自身独立的方法
		System.out.println("B-------->fun3()");
	}
}
