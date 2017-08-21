package exam.synchronize_demo;


public class Test {
	/**
	 * 如果想让当前资源被一个线程使用，不受其他线程的影响，应该给当前的资源上锁进行绑定，等当前线程释放锁以后，下一个线程才会进入。
	 * 使用sychrcnized关键字保证数据同步
	 * 如果一个资源被多个线程使用，不上锁会造成数据读取严重错误（如果是多个线程进行数据库操作，会造成脏读的现象）
	 */
	
	public static void main(String[] args) {
		//创建两个线程，分别表示张三和张三的老婆
		TestAccount at = new TestAccount();
		Thread san = new Thread(at);
		Thread san_wifr = new Thread(at);

		san.setName("张三");
		san_wifr.setName("太太");
		
		san.start();
		san_wifr.start();
	}

}
