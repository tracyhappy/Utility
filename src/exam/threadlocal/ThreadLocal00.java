package exam.threadlocal;

public class ThreadLocal00 {}
//代码一：
//
//class ConnectionManager {
//    
//    private static Connection connect = null;				//全局共享变量
//     
//    public static Connection openConnection() {
//        if(connect == null){
//            connect = DriverManager.getConnection();
//        }
//        return connect;
//    }
//     
//    public static void closeConnection() {
//        if(connect!=null)
//            connect.close();
//    }
//}

//问题1： openConnection方法：没有进行线程同步,很可能会多次创建connect
//问题2： 由于connect是共享变量。那么在调用connect的地方需要使用到同步来保障线程安全，因为很可能一个线程在使用connect进行数据库操作，而另外一个线程调用closeConnection关闭链接。
//	         即调用openConnection方法就不能调用closeConnection方法。所以出于线程安全的考虑，必须将这段代码的两个方法进行同步处理。
//问题3： 即便上面两个问题通过同步可以解决,但是这样将会大大影响程序执行效率，因为一个线程在使用connect进行数据库操作的时候，其他线程只有等待。
//     如果不是数据库连接问题，解决了同步问题的话，还是可以的

//代码二：根据代码一的问题,制定代码二
//
//class ConnectionManager {
//    
//    private Connection connect = null;
//     
//    public Connection openConnection() {
//        if(connect == null){
//            connect = DriverManager.getConnection();
//        }
//        return connect;
//    }
//     
//    public void closeConnection() {
//        if(connect!=null)
//            connect.close();
//    }
//}
//class Dao{
//    public void insert() {
//        ConnectionManager connectionManager = new ConnectionManager();
//        Connection connection = connectionManager.openConnection();
//        //使用connection进行操作
//        connectionManager.closeConnection();
//    }
//}

//问题1：这样处理确实也没有任何问题，由于每次都是在方法内部创建的连接，那么线程之间自然不存在线程安全问题。
//	        但是这样会有一个致命的影响：由于在方法中需要频繁地开启和关闭数据库连接，严重影响程序执行性能和效率，导致服务器压力非常大。


//代码三：
//private static final ThreadLocal threadSession = new ThreadLocal();			//全局共享变量
//
//public static Session getSession() throws InfrastructureException {
//    Session s = (Session) threadSession.get();
//    try {
//        if (s == null) {
//            s = getSessionFactory().openSession();
//            threadSession.set(s);
//        }
//    } catch (HibernateException ex) {
//        throw new InfrastructureException(ex);
//    }
//    return s;
//}
//
//或者：
//
//private static ThreadLocal<Connection> connectionHolder = new ThreadLocal<Connection>() {  //全局共享变量
//		@override
//		public Connection initialValue() {
//		    return DriverManager.getConnection(DB_URL);
//		}
//};
// 
//public static Connection getConnection() {
//		return connectionHolder.get();
//}



//那么这种情况下使用ThreadLocal是再适合不过的了，因为ThreadLocal在每个线程中对该变量会创建一个副本，即每个线程内部都会有一个该变量。
//在线程内部任何地方都可以使用，线程之间互不影响，这样一来就不存在线程安全问题，也不会严重影响程序执行性能。
//但是要注意，虽然ThreadLocal能够解决上面代码一和代码二说的问题，但是由于在每个线程中都创建了副本，所以要考虑它对资源的消耗，比如内存的占用会比不使用ThreadLocal要大。


//ThreadLocal原理： 为变量在每个线程中都创建了一个副本，那么每个线程可以访问自己内部的副本变量。
//通过源码可见：1、首先,在每个线程Thread内部有一个ThreadLocalMap类型的成员变量threadLocals。
//		               这个threadLocals就是用来存储实际的变量副本的，键值为当前ThreadLocal变量，value为变量副本（即T类型的变量）。
//		              初始时，在Thread里面，threadLocals为空，当通过ThreadLocal变量调用get()方法或者set()方法，
//		              就会对Thread类中的threadLocals进行初始化，并且以当前ThreadLocal变量为键值，以要保存的变量为value，存到Thread的threadLocals中。
//		  2、因为每个线程中的threadLocals为Map类型，则可以存放多个threadLocal作为键值。（如ThreadLocal01例子中的longLocal和stringLocal）
//		  3、ThreadLocal在进行get之前，必须先set，否则会报空指针异常； 如果想在get之前不需要调用set就能正常访问的话，必须重写initialValue()方法。（如ThreadLocal02例子）


//ThreadLocal不是用来解决共享对象(即static共享变量)的多线程访问问题的，通过ThreadLocal.set()到线程中的对象是该线程自己使用的对象，各个线程中访问的是不同的对象（即应该属于普通实例）。 
//static共享变量,没必要放到ThreadLocal中。放了也是一样的,也是所有线程访问的一个共享变量,还是会有并发访问问题。 
//ThreadLocal的应用场合，我觉得最适合的是按线程多实例（每个线程对应一个实例）的对象的访问，并且这个对象很多地方都要用到。 
//ThreadLocal不是线程
//ThreadLocal的这种设计是"空间换时间";synchronized顺序执行是"时间换取空间"。
//以上的举例都是存放的数据库连接对象，也有可能是存的是普通的一个对象
//但是ThreadLocal并不能让线程同步，只是保证每个线程的数据都一个副本，才使得数据安全