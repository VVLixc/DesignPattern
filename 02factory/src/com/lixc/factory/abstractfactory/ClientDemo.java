package com.lixc.factory.abstractfactory;

/**
 * com.lixc.factory.abstractfactory
 * 客户端代码使用工厂创建对象
 * @author Lixc
 * @version 1.0
 * @since 2023-08-03 23:27
 */
public class ClientDemo {
    public static void main(String[] args) {
        AbstractFactoryDemo concreteFactory1 = new ConcreteFactory1();
        AbstractFactoryDemo concreteFactory2 = new ConcreteFactory2();
        ProductDemoA productA1 = concreteFactory1.createProductA();
        ProductDemoB productB1 = concreteFactory1.createProductB();
        ProductDemoA productA2 = concreteFactory2.createProductA();
        ProductDemoB productB2 = concreteFactory2.createProductB();
        productA1.operationA();
        productB1.operationB();
        productA2.operationA();
        productB2.operationB();
    }
}
