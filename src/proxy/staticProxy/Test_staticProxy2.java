package proxy.staticProxy;

/**
 * 代理接口。处理任务。 
 */
abstract class Subject {
	abstract public void request();
}


/**
 * 真实主题
 */
 class RealSubject extends Subject {
	@Override
	public void request() {
		System.out.println("实现请求！");
	}
}

/**
 * 代理主题
 */
class ProxySubject extends Subject {

	private RealSubject realSubject;
	@Override
	public void request() {
		preRequest();
		if(realSubject == null){
			realSubject = new RealSubject();
		}
		realSubject.request();
		postRequest();
	}
	
	/**
	 * 请求前的操作
	 */
	private void preRequest(){
		System.out.println("请求前的操作！");
	}
	/**
	 * 请求后的操作
	 */
	private void postRequest(){
		System.out.println("请求后的造作！");
	}

}

/*
 *静态代理设计:一个操作的抽象类，一个是委托类，一个是代理类
 *所谓静态就是在程序运行前就已经存在代理类的字节码文件，代理类和委托类的关系在运行前就确定了。 
 */
public class Test_staticProxy2 {
	
	public static void main(String[] args) {
		Subject subject = new ProxySubject();
		subject.request();
	}
}

//静态代理缺点： 
//1）代理对象的一个接口只服务于一种类型的对象，如果要代理的方法很多，势必要为每一种方法都进行代理，静态代理在程序规模稍大时就无法胜任了。 
//2）如果接口增加一个方法，除了所有实现类需要实现这个方法外，所有代理类也需要实现此方法。增加了代码维护的复杂度。 
