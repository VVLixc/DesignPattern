package com.lixc.factory.simplefactory;

/**
 * com.lixc.factory.simplefactory
 * 客户端代码使用工厂创建对象
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-03 22:49
 */
public class ClientDemo {
    public static void main(String[] args) {
        ProductDemo productA = SimpleFactoryDemo.createProduct("A");
        ProductDemo productB = SimpleFactoryDemo.createProduct("B");
        productA.operation();
        productB.operation();
        ProductDemo productC = SimpleFactoryDemo.createProduct("C");

    }
}
