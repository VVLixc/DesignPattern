package com.lixc.decorator;

/**
 * com.lixc.decorator
 * 抽象装饰器：实现了抽象组件接口，并持有抽象组件类型引用，且内部调用了被装饰对象的方法。
 * @author Lixc
 * @version 1.0
 * @since 2023-08-06 9:46
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
