package exam.synchronize;


/**
 *  理解线程的无规律性： 1.谁先执行都是有可能的   2.谁先执行完成也是有可能的
 *  什么时候会出现线程不安全问题？
 *  有可能出现多个线程同时访问同一个资源的情况，这种资源可以是各种类型的的资源：一个变量、一个对象、一个文件、一个数据库表等。
 *  由于每个线程执行的过程是不可控的，所以很可能导致最终的结果与实际上的愿望相违背。
 *  比如下面的例子如果调用的是modifyValue方法,获取a的值的时候总是不确定的。
 *  
 *  线程的其他知识点:
 *  sleep方法不会释放锁，也就是说如果当前线程持有对某个对象的锁，即使调用sleep方法，也不会释放锁,其他线程也无法访问这个对象。
 *  调用某个对象的wait()方法，相当于让当前线程交出此对象的锁。因此当前线程必须拥有这个对象的锁，调用wait()方法必须在同步块或者同步方法中进行（synchronized块或者synchronized方法）
 *	notify()方法能够唤醒一个正在等待该对象的锁的线程，当有多个线程都在等待该对象的锁的话，则只能唤醒其中一个线程，具体唤醒哪个线程则不得而知。
 *	调用某个对象的notify()方法，当前线程也必须拥有这个对象的monitor，因此调用notify()方法必须在同步块或者同步方法中进行（synchronized块或者synchronized方法）
 *	nofityAll()方法能够唤醒所有正在等待该对象的monitor的线程
 *
 */

class Resource{
    int a = 0;
	
    //线程的无规律性
	public void modifyValue(int value){
		System.out.println(Thread.currentThread().getName());
		this.a = value;
		System.out.println(Thread.currentThread().getName() + "修改成功");
	}
	
	public synchronized void changeValue(int value){
		System.out.println("线程执行开始---->" + Thread.currentThread().getName());
		this.a = value;
		System.out.println("线程执行完毕---->" + Thread.currentThread().getName());
	}
}


/**
 *  多个线程操作同一资源
 */
public class Thread0{
	
	//多个线程操作同一资源
	private static Resource res = new Resource();
	
	public static void main(String[] args) {
		new Thread("T1"){
			@Override
			public void run(){
				res.changeValue(1);
			}
		}.start();
		
		System.out.println(res.a);
		
		new Thread("T2"){
			@Override
			public void run(){
				res.changeValue(2);
			}
		}.start();
		
		new Thread("T3"){
			@Override
			public void run(){
				res.changeValue(3);
			}
		}.start();
		
		System.out.println(res.a);
	}
}

//如果调用的是modifyValue,则执行到modifyValue函数中的线程,可能一个时间点有多个
//除了以下执行顺序,其他情况,也是有可能的
//0
//0
//T1
//T3
//T3修改成功
//T1修改成功
//T2
//T2修改成功

//0
//T1
//T2
//T3
//T1修改成功
//1
//T2修改成功
//T3修改成功

//0
//T1
//T1修改成功
//1
//T2
//T2修改成功
//T3
//T3修改成功

//如果调用的是changeValue,则执行到modifyValue函数中的线程,同一个时间点只能有一个

//0
//0
//线程执行开始---->T2
//线程执行完毕---->T2
//线程执行开始---->T3
//线程执行完毕---->T3
//线程执行开始---->T1
//线程执行完毕---->T1

//0
//线程执行开始---->T2
//线程执行完毕---->T2
//0
//线程执行开始---->T3
//线程执行完毕---->T3
//线程执行开始---->T1
//线程执行完毕---->T1

