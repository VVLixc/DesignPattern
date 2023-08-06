package com.lixc.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * com.lixc.decorator
 * 测试装饰器模式的功能
 * @author Lixc
 * @version 1.0
 * @since 2023-08-06 9:51
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circleShape = new Circle();
        Shape redBorderCircleDecorator = new RedShapeDecorator(circleShape);
        Shape blueBackgroundRedBorderCircleDecorator = new BlueShapeDecorator(redBorderCircleDecorator);
        Shape blueBackgroundRedBorderTriangleDecorator = new BlueShapeDecorator(new RedShapeDecorator(new Triangle()));

        System.out.println("普通圆形：");
        circleShape.draw();// 绘制圆形

        System.out.println("\n红色边框装饰后的圆形：");
        redBorderCircleDecorator.draw();// 绘制圆形\n 添加红色边框

        System.out.println("\n红色边框、蓝色背景装饰后的圆形：");
        blueBackgroundRedBorderCircleDecorator.draw();// 绘制圆形\n 添加红色边框\n 添加蓝色背景

        System.out.println("\n红色边框、蓝色背景装饰后的矩形");
        blueBackgroundRedBorderTriangleDecorator.draw();// 绘制矩形\n 添加红色边框\n 添加蓝色背景
    }
}
