package com.lixc.factory.simplefactory;

/**
 * com.lixc.factory.simplefactory
 * 具体产品A
 * @author Lixc
 * @version 1.0
 * @since 2023-08-03 22:44
 */
public class ConcreteProductA implements ProductDemo{
    @Override
    public void operation() {
        System.out.println("ConcreteProductA operation");
    }
}
