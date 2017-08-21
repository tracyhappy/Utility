package proxy.dynamicProxy.cglib;
//package com.cglibProxy;
//
//import java.lang.reflect.Method;
//import org.aopalliance.intercept.MethodInterceptor;
//import org.aopalliance.intercept.MethodInvocation;
//
///**
// * 使用cglib动态代理（真实类不需要接口实现）
// * Cglib需要spring的第三方包
// * 
// */
//public class CglibProxy implements MethodInterceptor {
//
//    private Object target;
//
//    /**
//     * 创建代理对象
//     * 
//     * @param target
//     * @return
//     */
//    public Object getInstance(Object target) {
//        this.target = target;
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(this.target.getClass());
//        // 回调方法
//        enhancer.setCallback(this);
//        // 创建代理对象
//        return enhancer.create();
//    }
//
//    @Override
//    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
//        Object result = null;
//        System.out.println("事物开始");
//        result = methodProxy.invokeSuper(proxy, args);		//反射
//        System.out.println("事物结束");
//        return result;
//    }
//
//
//}