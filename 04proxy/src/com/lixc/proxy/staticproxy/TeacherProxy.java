package com.lixc.proxy.staticproxy;

/**
 * com.lixc.proxy.staticproxy
 * 代理主题：
 * @author Lixc
 * @version 1.0
 * @since 2023-08-07 9:31
 */
public class TeacherProxy implements ITeacher{
    private final ITeacher iTeacher;

    public TeacherProxy(ITeacher iTeacher) {
        this.iTeacher = iTeacher;
    }

    @Override
    public void teach() {
        System.out.println("代理主题：调用真实主题对象之前执行某操作...");
        iTeacher.teach();
        System.out.println("代理主题：调用真实主题对象之后执行某操作...");
    }
}
