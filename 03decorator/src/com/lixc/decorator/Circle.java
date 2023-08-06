package com.lixc.decorator;

/**
 * com.lixc.decorator
 * 具体组件（被装饰对象）：实现了抽象组件
 * @author Lixc
 * @version 1.0
 * @since 2023-08-06 9:45
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
