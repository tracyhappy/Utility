package exam.synchronize;


/**
 *  多线程访问同一资源时,如果资源类里有多个sychronized方法,一个线程A已经进入到了其中一个sychronized方法，
 *  其他线程如果要访问其他非static sychronized方法，也必须等待线程A执行完,释放出对象锁,其他线程才能继续。
 *  但是其他线程可以访问非sychronized方法,也可以访问static sychronized方法
 *	(因static synchronized方法占用的是类锁，而访问非static synchronized方法占用的是对象锁)
 *  由此可见Hashtable和Collections.synchronizedMap(map)的原理
 *  
 */
class Resource2 {

	public void play1() {
		synchronized (this) {
			int i = 5;
			while (i-- > 0) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException ie) {
				}
			}
		}
	}
	
//	public static synchronized void play2() {
	public synchronized void play2() {
//	public void play2() {
		int i = 5;
		while (i-- > 0) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
			}
		}
	}
}

public class Thread2{
	public static void main(String[] args) {
		//多个线程操作同一资源
		final Resource2 res = new Resource2();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				res.play1();
			}
		}, "t1");
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				res.play2();
			}
		}, "t2");
		t1.start();
		t2.start();
	}
}