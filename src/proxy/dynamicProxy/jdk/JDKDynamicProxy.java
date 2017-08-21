package proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理实现InvocationHandler（原理:反射,真实类需要接口实现）
 */
public class JDKDynamicProxy implements InvocationHandler {

    /** 需要代理的目标类 */
    private Object target;

    /**
     * 写法固定，aop专用:绑定委托对象并返回一个代理类
     * 
     * @param delegate
     * @return
     */
    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * @param Object
     *            target：指被代理的对象。
     * @param Method
     *            method：要调用的方法
     * @param Object
     *            [] args：方法调用时所需要的参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        // 切面之前执行
        System.out.println("切面之前执行");
        // 执行业务
        result = method.invoke(target, args);			//反射
        // 切面之后执行
        System.out.println("切面之后执行");
        return result;
    }
}