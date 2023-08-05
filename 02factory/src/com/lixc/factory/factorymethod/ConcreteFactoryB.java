package com.lixc.factory.factorymethod;

/**
 * com.lixc.factory.factorymethod
 * 具体工厂B：用于创建具体产品B
 * @author Lixc
 * @version 1.0
 * @since 2023-08-03 22:58
 */
public class ConcreteFactoryB implements FactoryMethodDemo {
    @Override
    public ProductDemo createProduct() {
        return new ConcreteProductB();
    }
}
