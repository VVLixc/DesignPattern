package com.lixc.decorator;

/**
 * com.lixc.decorator
 * 具体装饰器（装饰对象）：继承自抽象装饰器，并扩展其行为
 * @author Lixc
 * @version 1.0
 * @since 2023-08-06 9:49
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder();
    }
    private void setRedBorder(){
        System.out.println("添加红色边框");
    }
}
