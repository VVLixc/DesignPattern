package com.lixc.factory.factorymethod;

/**
 * com.lixc.factory.factorymethod
 * 客户端代码使用工厂创建对象
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-03 22:59
 */
public class ClientDemo {
    public static void main(String[] args) {
        FactoryMethodDemo concreteFactoryA = new ConcreteFactoryA();
        FactoryMethodDemo concreteFactoryB = new ConcreteFactoryB();
        ProductDemo productA = concreteFactoryA.createProduct();
        ProductDemo productB = concreteFactoryB.createProduct();
        productA.operation();
        productB.operation();
    }
}
