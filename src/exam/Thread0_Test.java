package exam;

//关键字synchronized保证任何时候只有一个线程访问关键资源
//wait方法执行时会释放对象锁。
//wait方法必须写在同步方法或同步块中
//使用wait方法后，线程需要被通知唤醒
//wait方法用于线程之间的通讯

//哪些是Thread类中本身的方法（不包括继承） (AB)（多选）
//a)	start()
//b)	sleep(long mi)
//c)	wait()
//d)	notify()

//如果你编写一个多线程序，可以使用的方法是1.扩展类Thread和2.实现Runnable接口

public class Thread0_Test extends Thread {

//	public void start() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Value of i = " + i);
//		}
//	}
	
	public void run() {
		System.out.println("线程执行体");
	}

	public static void main(String argv[]) {
		Thread0_Test b = new Thread0_Test();
		b.run();								//主线程调用方法而已
		b.start();								//如果注释上面的start函数，则开启一个新的线程。如果不注释，则是普通的调用一个方法
	}	
}
