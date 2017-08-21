package proxy.dynamicProxy.jdk;



/**
 *  JDK动态代理：灵活 
 *  动态代理类的源码是在程序运行期间由JVM根据反射等机制动态的生成，包括调用函数的时候也是反射
 *  所以不存在代理类的字节码文件。代理类和委托类的关系是在程序运行时确定。
 */

public class Test {
	
	public static void main(String[] args) {
        ITalk iTalk = (ITalk) new JDKDynamicProxy().bind(new PeopleTalk("张学恺","25"));
        iTalk.talk("业务说明");
    }
}


 