package com.lixc.proxy.dynamicproxy.cglib;

/**
 * com.lixc.proxy.dynamicproxy.cglib
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-07 18:05
 */
public class CGLibProxyClient {
    public static void main(String[] args) {
        System.out.println("ClientTest：获取目标对象的代理对象");
        Teacher proxyInstance = (Teacher) new TeacherProxy(new Teacher()).getProxyInstance();
        System.out.println("ClientTest：执行代理对象的方法，触发CGLib依赖的intercept方法，从而实现对目标对象的调用");
        proxyInstance.teach();

        // ClientTest：获取目标对象的代理对象
        // CGLib提供的API：获取目标对象的代理对象
        // ClientTest：执行代理对象的方法，触发CGLib依赖的intercept方法，从而实现对目标对象的调用
        // CGLib代理模式>>>start
        // 讲师授课
        // CGLib代理模式>>>end
    }
}
