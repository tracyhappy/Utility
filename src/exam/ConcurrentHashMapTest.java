package exam;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 在ConcurrentHashMap中，就是把Map分成了N个Segment，put和get的时候，都是现根据key.hashCode()算出放到哪个Segment中.
 * ConcurrentHashMap 线程安全。当同时操作一个Segment的时候，哪个线程先到segment先获得锁，操作该Segment的另外的线程阻塞，操作完后，另外的线程才能继续操作。
 * 若线程都是访问的不同的segment，则毫不影响。（即每个Segment上都有自己的锁,只要多个修改操作发生在不同的段上，它们就可以并发进行）
 * 详细请看concurrent.txt
 */
public class ConcurrentHashMapTest {

	private static ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<Integer, Integer>();

	/**
	 * 	多个线程访问同一个资源
	 */
	public static void main(String[] args) {
		
		new Thread("Thread1") {
			public void run() {
				map.put(3, 33);
			}
		}.start();

		new Thread("Thread2") {
			public void run() {
				map.put(4, 44);
			}
		}.start();

		new Thread("Thread3") {
			public void run() {
				map.put(7, 77);
			}
		}.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(map);
		
	}
}