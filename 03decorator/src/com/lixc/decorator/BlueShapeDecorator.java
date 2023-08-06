package com.lixc.decorator;

/**
 * com.lixc.decorator
 * 具体装饰器
 * @author Lixc
 * @version 1.0
 * @since 2023-08-06 11:05
 */
public class BlueShapeDecorator extends ShapeDecorator{
    public BlueShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    @Override
    public void draw() {
        decoratedShape.draw();
        setBlueBackground();
    }
    private void setBlueBackground(){
        System.out.println("添加蓝色背景");
    }
}
