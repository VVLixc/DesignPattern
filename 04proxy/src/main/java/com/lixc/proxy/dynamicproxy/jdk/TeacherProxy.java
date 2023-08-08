package com.lixc.proxy.dynamicproxy.jdk;

import java.lang.reflect.Proxy;

/**
 * com.lixc.proxy.staticproxy
 * 代理主题：
 * @author Lixc
 * @version 1.0
 * @since 2023-08-07 9:31
 */
public class TeacherProxy {
    private final Object target;

    public TeacherProxy(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        // ClassLoader：指定当前目标对象（被代理对象）使用的类加载器
        // Class<?>[]：目标对象实现的接口类型，使用泛型方式确认类型
        // InvocationHandler：事件处理，执行目标对象的方法时，会触发事件处理器的方法（会把目标对象方法作为参数传入）
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (o, method, objects) -> {
            System.out.println("JDK代理开始---被代理对象方法名："+method.getName());
            // 反射机制调用目标对象的方法
            Object returnVal = method.invoke(target, objects);
            System.out.println("JDK代理结束");
            return returnVal;
        });
    }
}
