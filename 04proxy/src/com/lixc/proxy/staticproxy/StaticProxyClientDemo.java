package com.lixc.proxy.staticproxy;

/**
 * com.lixc.proxy.staticproxy
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-07 9:33
 */
public class StaticProxyClientDemo {
    public static void main(String[] args) {
        ITeacher teacherProxy = new TeacherProxy(new Teacher());
        teacherProxy.teach();//代理主题：调用真实主题对象之前执行某操作...\n  讲师授课\n  代理主题：调用真实主题对象之后执行某操作...
    }
}
