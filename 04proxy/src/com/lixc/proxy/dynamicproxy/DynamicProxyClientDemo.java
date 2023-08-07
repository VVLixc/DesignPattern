package com.lixc.proxy.dynamicproxy;

/**
 * com.lixc.proxy.staticproxy
 * 动态代理（又叫做JDK代理、接口代理）功能测试
 * @author Lixc
 * @version 1.0
 * @since 2023-08-07 9:33
 */
public class DynamicProxyClientDemo {
    public static void main(String[] args) {
        ITeacher target = new Teacher();
        // 给目标对象创建代理对象（将获取到的代理对象强转为目标对象实现的接口）
        // proxyInstance：com.lixc.proxy.dynamicproxy.Teacher@2503dbd3
        // proxyInstance.getClass()：class com.sun.proxy.$Proxy0     $表示代理对象 表明内存中动态生成了代理对象
        ITeacher proxyInstance =(ITeacher) new TeacherProxy(target).getProxyInstance();
        proxyInstance.teach();
    }
}
