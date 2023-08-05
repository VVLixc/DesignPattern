package com.lixc.factory.factorymethod;

/**
 * com.lixc.factory.factorymethod
 * 具体工厂A：用于创建具体产品A
 * @author Lixc
 * @version 1.0
 * @since 2023-08-03 22:58
 */
public class ConcreteFactoryA implements FactoryMethodDemo {
    @Override
    public ProductDemo createProduct() {
        return new ConcreteProductA();
    }
}
