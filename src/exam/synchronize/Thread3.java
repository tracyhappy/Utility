package exam.synchronize;

/**
 *  对象锁的用法
 */
class OutClass {
	class Resource {
		private void m4t1() {
			int i = 5;
			while (i-- > 0) {
				System.out.println(Thread.currentThread().getName()
						+ " : Inner.m4t1()=" + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException ie) {
				}
			}
		}
		 
		private synchronized void m4t2() {
//		private void m4t2() {
			int i = 5;
			while (i-- > 0) {
				System.out.println(Thread.currentThread().getName()
						+ " : Inner.m4t2()=" + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException ie) {
				}
			}
		}
	}

	public void play1(Resource res) {
		synchronized (res) { 				//使用对象锁
			res.m4t1();
		}
	}

	public void play2(Resource res) {
		res.m4t2();
	}
}


public class Thread3{
	
	public static void main(String[] args) {
		final OutClass outer = new OutClass();
		final OutClass.Resource res = outer.new Resource();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				outer.play1(res);
			}
		}, "t1");
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				outer.play2(res);
			}
		}, "t2");
		t1.start();
		t2.start();
	}
}