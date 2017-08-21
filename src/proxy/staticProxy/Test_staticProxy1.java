package proxy.staticProxy;

/**  
 * 代理接口--->处理任务。 
 */
interface Subject1{
	public void dealTask(String taskName);   
};

/**
 * 真正执行任务的类，实现了代理接口。
 */
class RealSubject1 implements Subject1 {

 /**
  * 执行给定名字的任务。这里打印出任务名，并休眠500ms模拟任务执行了很长时间
  * @param taskName 
  */
   @Override
   public void dealTask(String taskName) {
      System.out.println("正在执行任务："+taskName);
      try {
         Thread.sleep(500);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }
}

/**
 *　代理类，实现了代理接口。
 */
class ProxySubject1 implements Subject1 {
	 //代理类持有一个委托类的对象引用
	 private Subject1 delegate;
	 
	 public ProxySubject1(Subject1 delegate) {
	  this.delegate = delegate;
	 }
	
	 /**
	  * 将请求分派给委托类执行，记录任务执行前后的时间，时间差即为任务的处理时间
	  */
	 @Override
	 public void dealTask(String taskName) {
		  long stime = System.currentTimeMillis(); 
		  delegate.dealTask(taskName);				//将请求分派给委托类处理
		  long ftime = System.currentTimeMillis(); 
		  System.out.println("执行任务耗时"+(ftime - stime)+"毫秒");
	 }
}

class SubjectStaticFactory {  
	 //客户类调用此工厂方法获得代理对象。  
	 //对客户类来说，其并不知道返回的是代理类对象还是委托类对象。  
	 public static Subject1 getInstance(){   
		 return new ProxySubject1(new RealSubject1());  
	 }  
}  

/*
 *静态代理设计:一个操作的接口，一个是委托类，一个是代理类
 *所谓静态就是在程序运行前就已经存在代理类的字节码文件，代理类和委托类的关系在运行前就确定了。 
 */
public class Test_staticProxy1 {

	public static void main(String[] args) {
		Subject1 proxy = SubjectStaticFactory.getInstance();  
		proxy.dealTask("DBQueryTask");  
	}

}


//静态代理缺点： 
//1）代理对象的一个接口只服务于一种类型的对象，如果要代理的方法很多，势必要为每一种方法都进行代理，静态代理在程序规模稍大时就无法胜任了。 
//2）如果接口增加一个方法，除了所有实现类需要实现这个方法外，所有代理类也需要实现此方法。增加了代码维护的复杂度。 
