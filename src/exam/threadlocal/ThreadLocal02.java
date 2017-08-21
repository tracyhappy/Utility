package exam.threadlocal;

//ThreadLocal在进行get之前，必须先set，否则会报空指针异常； 如果想在get之前不需要调用set就能正常访问的话，必须重写initialValue()方法。
//源码分析：
//在get函数中,如果没有找到map,则会通过调用setInitialValue方法返回value，
//而在setInitialValue方法中，有一个语句是T value = initialValue()， 而默认情况下，initialValue方法返回的是null。
//public T get() {
//    Thread t = Thread.currentThread();
//    ThreadLocalMap map = getMap(t);
//    if (map != null) {
//        ThreadLocalMap.Entry e = map.getEntry(this);
//        if (e != null)
//            return (T)e.value;
//    }
//    return setInitialValue();
//}
//private T setInitialValue() {
//    T value = initialValue();
//    Thread t = Thread.currentThread();
//    ThreadLocalMap map = getMap(t);
//    if (map != null)
//        map.set(this, value);
//    else
//        createMap(t, value);
//    return value;
//}
//protected T initialValue() {
//    return null;
//}

public class ThreadLocal02 {
    ThreadLocal<Long> longLocal = new ThreadLocal<Long>(){
        protected Long initialValue() {
            return Thread.currentThread().getId();
        };
    };
    ThreadLocal<String> stringLocal = new ThreadLocal<String>(){
        protected String initialValue() {
            return Thread.currentThread().getName();
        };
    };
 
     
    public void set() {
        longLocal.set(Thread.currentThread().getId());
        stringLocal.set(Thread.currentThread().getName());
    }
     
    public long getLong() {
        return longLocal.get();
    }
     
    public String getString() {
        return stringLocal.get();
    }
     
    public static void main(String[] args) throws InterruptedException {
        final ThreadLocal02 test = new ThreadLocal02();
//        test.set();
        System.out.println(test.getLong());
        System.out.println(test.getString());
     
        Thread thread1 = new Thread(){
            public void run() {
//                test.set();
                System.out.println(test.getLong());
                System.out.println(test.getString());
            };
        };
        thread1.start();
        thread1.join();
         
        System.out.println(test.getLong());
        System.out.println(test.getString());
    }
}