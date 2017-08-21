package exam.threadlocal;


public class ThreadLocal01 {
    private static ThreadLocal<Long> longLocal = new ThreadLocal<Long>();
    private static ThreadLocal<String> stringLocal = new ThreadLocal<String>();
 
    public static void set() {
        longLocal.set(Thread.currentThread().getId());
        stringLocal.set(Thread.currentThread().getName());
    }
     
    public static long getLong() {
        return longLocal.get();
    }
     
    public static String getString() {
        return stringLocal.get();
    }
     
    public static void main(String[] args) throws InterruptedException {
	    set();
	    System.out.println(getLong());
	    System.out.println(getString());
	    
        Thread thread1 = new Thread(){
        	@Override
            public void run() {
                set();
                System.out.println(getLong());
                System.out.println(getString());
            };
        };
        thread1.start();
        thread1.join();
         
        //最后一次在main线程打印副本值是为了证明在main线程中和thread1线程中的副本值确实是不同的
        System.out.println(getLong());
        System.out.println(getString());
    }
}