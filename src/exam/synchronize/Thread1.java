package exam.synchronize;


//synchronized方法和 synchronized块,能够保证在同一时刻只能一个线程执行该段代码。
//当并发线程访问同一个对象中的synchronized同步代码时，一个时间内只能有一个线程得到执行。另外的线程必须等待当前线程执行完这个代码块以后才能执行该代码块。
//当一个线程访问对象的一个synchronized同步代码时，它就获得了这个对象的对象锁,其他线程对该对象中所有其它synchronized同步代码的访问将被阻塞,
//等到当前线程执行该同步代码完毕，释放出对象锁，其他线程才能获得对象锁进行依次访问。
//如果资源类里有多个sychronized方法,一个线程A已经进入到了其中一个sychronized方法，其他线程如果要访问其他非static sychronized方法,
//也必须等待线程A执行完,释放出对象锁,其他线程才能继续。但是其他线程可以访问非sychronized方法,也可以访问static sychronized方法
//(因static synchronized方法占用的是类锁，而访问非static synchronized方法占用的是对象锁)
//synchronized缺陷：因线程排队顺序执行,花时间较多,并发性低
//synchronized仅以下两种情况才释放锁:
//1）获取锁的线程执行完了该代码块，然后线程释放对锁的占有；
//2）线程执行发生异常，此时JVM会让线程自动释放锁。



public class Thread1 implements Runnable {

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);
			}
		}
	}

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread ta = new Thread(t1, "A");
		Thread tb = new Thread(t1, "B");
		ta.start();
		tb.start();
	}
}

//结果：
//A synchronized loop 0
//A synchronized loop 1
//A synchronized loop 2
//A synchronized loop 3
//A synchronized loop 4
//B synchronized loop 0
//B synchronized loop 1
//B synchronized loop 2
//B synchronized loop 3
//B synchronized loop 4
//或者：
//B synchronized loop 0
//B synchronized loop 1
//B synchronized loop 2
//B synchronized loop 3
//B synchronized loop 4
//A synchronized loop 0
//A synchronized loop 1
//A synchronized loop 2
//A synchronized loop 3
//A synchronized loop 4
