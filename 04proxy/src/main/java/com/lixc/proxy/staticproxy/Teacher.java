package com.lixc.proxy.staticproxy;

/**
 * com.lixc.proxy.staticproxy
 * 真实主题Real Subject：定义代理所代表的真正对象
 * @author Lixc
 * @version 1.0
 * @since 2023-08-07 9:28
 */
public class Teacher implements ITeacher{
    @Override
    public void teach() {
        System.out.println("讲师授课");
    }
}
