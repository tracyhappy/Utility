package exam.threadlocal;

/**
 *  ThreadLocal在spring中的应用。将每个线程所生成的代理类保存在ThreadLocal中
 *  AopContext.currentProxy() 获取到当前线程的代理类
 */

//public abstract class AopContext{  
//  
// private static final ThreadLocal <Object> currentProxy= new ThreadLocal <Object> ( );  
//  
// public static Object currentProxy() throws IllegalStateException {  
//	 Object proxy= currentProxy.get();  
//	 if (proxy== null ) {  
//	 throw new IllegalStateException(  
//	 " Cannot find current proxy: Set 'exposeProxy' property on Advised to 'true' to make it available. " );  
//	 }  
//	 return proxy;  
// } 
//  
// static Object setCurrentProxy(Object proxy) {  
//	 Object old= currentProxy.get();  
//	 if (proxy != null ) {  
//		 currentProxy.set(proxy);  
//	 }  
//	 else {  
//		 currentProxy.remove();  
//	 }  
//	 return old;  
// }  
//  
//}  