package exam;


//1.单例和static属性,要考虑到多线程并发问题。(要在get,set,close等方法上加上synchornized或者使用threadLocal解决)
//2.单例都可以通过反射,序列化和反序列化创建出新的对象。（仅枚举是真正意义上的单例）
//3.Action一般为多例，service，dao为单例


//分析对比:
//相同点:
//	 单例模式属于创建模式，保证在同一个jvm中仅仅存在该类的一个实例。
//   在上面两种的单例模式中，可以看出，1、两种方式的构造函数都是私有的。2、对外接口都是工厂方法。
//
//不同点:
//  饿汉式是在类装载时直接得到该类的实例，可以说式前期绑定的。
//	而懒汉式在类加载时并没有指向具体的某个对象。而是当调用工厂方法后才被实例化。
//	因此，前者速度快，后者速度慢。但后者可以加载其他的类，（也就是动态扩展）灵活性高。

//饿汉式
class EagerSingleton{

	private static final EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton(){}////私有构造方法
	
	public static EagerSingleton getInstance(){//静态工厂方法
		return instance;
	}
}

//懒汉式
class LazySingleton{

	//volatile有两层语义。1.可见性(一个线程中对该变量的修改会马上由工作内存写回主内存) 2.禁止指令重排序优化
	private static volatile LazySingleton instance=null;
	
	private LazySingleton(){}//私有构造函数
	
	public  static synchronized LazySingleton getInstance(){ //注意这里的synchronized，如果没有可能导致重复创建对象
		if(instance==null){
			instance=new LazySingleton();
		}
		return instance;
	}
	
	//进一步优化getInstance：
	public static LazySingleton getInstance1() {   
		if(instance == null){								//访问getInstance多数是读操作,这里加上判断会大大增加效率，减少了线程排队
			synchronized(LazySingleton.class){					
				if(instance == null){						
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
}

//枚举法：线程安全,防止反射强行调用构造器
public enum Singleton{
	instance;
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void doSomething(){
		System.out.println(name + "雄起!");
	}

	public static void main(String[] args) {
		Singleton.instance.setName("zxk");
		Singleton.instance.doSomething();
	}
}


