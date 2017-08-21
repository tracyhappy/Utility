package exam;

public class Override { 
	protected Override aMethod() throws Exception{
		return this;
	}
}
	
class Y extends Override { 
//	A. public void aMethod() {}  
//	B. private void aMethod() {} 
//	C. public void aMethod(String s) {}  
//	D. private Y aMethod() { return null; } 
//	E. public X aMethod() { return new Y(); } 
	
//	public void aMethod() {}           //不能通过。重写的方法和被重写的方法要有相同的返回值
//	private void aMethod() {}          //无法覆盖，访问权限太低。要相同（public）。要有相同的返回值
//	private Y aMethod() { return null; }   //和B一样原因
	
	
	private void aMethod(String s)throws Error {}   //重载
	
	
//	public Override aMethod(){return new Y();}  							//重写
	protected Override aMethod() throws RuntimeException{return new Y();}  	//重写
} 

/*
重载Overload:参数个数或类型不同。重载对访问属性和返回值和抛出的异常没有要求；方法的异常类型和数目不会对重载造成影响；
			对于继承来说，如果某一方法在父类中是访问权限是priavte，那么就不能在子类对其进行重载，如果定义的话，也只是定义了一个新方法，而不会达到重载的效果。
重写Override:必须与父类的函数一样，返回值必须相同,访问权限的话：子类方法的访问权限必须比基类的高。
			覆盖的方法所抛出的异常必须只能比父类抛出更少的异常或者所抛出的异常一致，或者是其子类；
			被覆盖的方法不能为private，否则在其子类中只是新定义了一个方法，并没有对其进行覆盖。
*/	