package com.lixc.factory.abstractfactory;

/**
 * com.lixc.factory.abstractfactory
 * 具体产品A1
 * @author Lixc
 * @version 1.0
 * @since 2023-08-03 23:15
 */
public class ConcreteProductA1 implements ProductDemoA{
    @Override
    public void operationA() {
        System.out.println("ConcreteProductA1 operationA");
    }
}
