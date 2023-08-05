package com.lixc.factory.factorymethod;

/**
 * com.lixc.factory.factorymethod
 * 具体产品B
 * @author Lixc
 * @version 1.0
 * @since 2023-08-03 22:55
 */
public class ConcreteProductB implements ProductDemo{
    @Override
    public void operation() {
        System.out.println("ConcreteProductB operation");
    }
}
