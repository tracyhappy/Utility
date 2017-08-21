package exam;

//调用sleep()方法并不会让线程释放它所持有的同步锁

//如果线程拥有某个或某些对象的同步锁，那么在调用了wait()后，这个线程就会
//释放它持有的所有同步资源，而不限于这个被调用了wait()方法的对象。wait()方法同样会被
//Thread类的interrupt()方法中断，并产生一个 InterruptedException异常，效果同sleep()方法
//被中断一样。


public class InterruptTest {
	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				try {
					System.out.println("我被执行了-在sleep()方法前");
					// 停止运行10分钟
					Thread.sleep(1000 * 60 * 60 * 10);
					System.out.println("我被执行了-在sleep()方法后");
				} catch (InterruptedException e) {
					System.out.println("我被执行了-在catch语句块中");
				}
				System.out.println("我被执行了-在try{}语句块后");
			}
		};
		// 启动线程
		t.start();
		// 在sleep()结束前中断它
		t.interrupt();
	}
}