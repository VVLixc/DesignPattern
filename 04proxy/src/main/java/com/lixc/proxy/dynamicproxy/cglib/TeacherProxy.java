package com.lixc.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * com.lixc.proxy.dynamicproxy.cglib
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-07 17:06
 */
public class TeacherProxy implements MethodInterceptor {
    private Object target;

    public TeacherProxy(Object target) {
        this.target = target;
    }

    /**
     *
     * @return 返回target对象的代理对象（CGLib提供的API）
     */
    public Object getProxyInstance(){
        System.out.println("CGLib提供的API：获取目标对象的代理对象");
        // 创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建子类对象，即代理对象
        return enhancer.create();
    }

    // 实现对目标对象方法的调用（CGLib提供的API接口重写方法）
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLib代理模式>>>start");
        Object returnVal = method.invoke(target, objects);
        System.out.println("CGLib代理模式>>>end");
        return returnVal;
    }
}
