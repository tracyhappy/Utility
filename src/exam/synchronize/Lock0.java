package exam.synchronize;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Lock是一个接口，而synchronized是Java中的关键字，synchronized是内置的语言实现；　
//synchronized在发生异常时，会自动释放线程占有的锁，因此不会导致死锁现象发生；而Lock在发生异常时，如果没有主动通过unLock()去释放锁，则很可能造成死锁现象，因此使用Lock时需要在finally块中释放锁；
//Lock可以让等待锁的线程响应中断，而synchronized却不行，使用synchronized时，等待的线程会一直等待下去，不能够响应中断；
//通过Lock可以知道有没有成功获取锁，而synchronized却无法办到。


//public interface Lock {
//    void lock();											//如果锁已被其他线程获取，则进行等待
//	  boolean tryLock();
//	  boolean tryLock(long time, TimeUnit unit) throws InterruptedException;
//    void lockInterruptibly() throws InterruptedException;
//    void unlock();				//释放锁
//    Condition newCondition();
//}

//lock()如果锁已被其他线程获取，则进行等待
//代码:
//Lock lock = ...;
//lock.lock();
//try{
//    //处理任务
//}catch(Exception ex){
//     
//}finally{
//    lock.unlock();  		 //释放锁,必须手动释放
//}


//tryLock()方法是有返回值的，它表示用来尝试获取锁，如果获取成功，则返回true，如果获取失败（即锁已被其他线程获取），则返回false，也就说这个方法无论如何都会立即返回。在拿不到锁时不会一直在那等待。
//tryLock(long time, TimeUnit unit)方法和tryLock()方法是类似的，只不过区别在于这个方法在拿不到锁时会等待一定的时间，在时间期限之内如果还拿不到锁，就返回false。如果如果一开始拿到锁或者在等待期间内拿到了锁，则返回true。
//代码:
//Lock lock = ...;
//if(lock.tryLock()) {
//     try{
//         //处理任务
//     }catch(Exception ex){
//         
//     }finally{
//         lock.unlock();   //释放锁
//     } 
//}else {
//    //如果不能获取锁，则直接做其他事情
//}


//lockInterruptibly()方法比较特殊，当通过这个方法去获取锁时，如果线程正在等待获取锁，则这个线程能够响应中断，即中断线程的等待状态。
//也就使说，当两个线程同时通过lock.lockInterruptibly()想获取某个锁时，假若此时线程A获取到了锁，而线程B只有在等待，那么对线程B调用threadB.interrupt()方法能够中断线程B的等待过程。
//由于lockInterruptibly()的声明中抛出了异常，所以lock.lockInterruptibly()必须放在try块中或者在调用lockInterruptibly()的方法外声明抛出InterruptedException。
//代码:
//public void method() throws InterruptedException {
//    lock.lockInterruptibly();
//    try {  
//     //.....
//    }
//    finally {
//        lock.unlock();
//    }  
//}
public class Lock0 {
	private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private Lock lock = new ReentrantLock();    //注意这个地方
    
    public void insert(Thread thread) {
        if(lock.tryLock()) {					//演示使用tryLock
            try {
                System.out.println(thread.getName()+"得到了锁");
                for(int i=0;i<5;i++) {
                    arrayList.add(i);
                }
            } catch (Exception e) {
                // TODO: handle exception
            }finally {
                System.out.println(thread.getName()+"释放了锁");
                lock.unlock();
            }
        } else {
            System.out.println(thread.getName()+"获取锁失败");
        }
    }
    
    
    public static void main(String[] args)  {
        final Lock0 test = new Lock0();
         
        new Thread(){
            public void run() {
                test.insert(Thread.currentThread());
            };
        }.start();
         
        new Thread(){
            public void run() {
                test.insert(Thread.currentThread());
            };
        }.start();
    }  
}


//运行结果可能是:
//Thread-0得到了锁
//Thread-1获取锁失败
//Thread-0释放了锁

//或者：

//Thread-1得到了锁
//Thread-1释放了锁
//Thread-0得到了锁
//Thread-0释放了锁