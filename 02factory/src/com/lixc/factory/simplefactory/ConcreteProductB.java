package com.lixc.factory.simplefactory;

/**
 * com.lixc.factory.simplefactory
 * 具体产品B
 * @author Lixc
 * @version 1.0
 * @since 2023-08-03 22:45
 */
public class ConcreteProductB implements ProductDemo{
    @Override
    public void operation() {
        System.out.println("ConcreteProductB operation");
    }
}
