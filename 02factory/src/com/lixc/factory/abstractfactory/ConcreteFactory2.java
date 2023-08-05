package com.lixc.factory.abstractfactory;

/**
 * com.lixc.factory.abstractfactory
 * 具体工厂2：用于创建具体产品组合2
 * @author Lixc
 * @version 1.0
 * @since 2023-08-03 23:25
 */
public class ConcreteFactory2 implements AbstractFactoryDemo{
    @Override
    public ProductDemoA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductDemoB createProductB() {
        return new ConcreteProductB2();
    }
}
