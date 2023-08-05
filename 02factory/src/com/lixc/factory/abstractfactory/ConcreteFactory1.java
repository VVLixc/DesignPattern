package com.lixc.factory.abstractfactory;

/**
 * com.lixc.factory.abstractfactory
 * 具体工厂1：用于创建具体产品组合1
 * @author Lixc
 * @version 1.0
 * @since 2023-08-03 23:25
 */
public class ConcreteFactory1 implements AbstractFactoryDemo{
    @Override
    public ProductDemoA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductDemoB createProductB() {
        return new ConcreteProductB1();
    }
}
