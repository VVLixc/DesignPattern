package com.lixc.factory.simplefactory;

/**
 * com.lixc.factory
 * 简单工厂类
 * @author Lixc
 * @version 1.0
 * @since 2023-08-03 22:41
 */
public class SimpleFactoryDemo {
    public static ProductDemo createProduct(String type){
        if ("A".equals(type)){
            return new ConcreteProductA();
        }else if ("B".equals(type)){
            return new ConcreteProductB();
        }else {
            throw new IllegalArgumentException("Invalid Product Type");
        }
    }
}
