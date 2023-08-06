package com.lixc.decorator.teach;

/**
 * com.lixc.decorator
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-05 22:55
 */
public class CoffeeBar {
    public static void main(String[] args) {
        Drink order1 = new LongBlack();
        System.out.println("order1订单："+order1.description+order1.cost()+order1.getPrice());
    }
}
