package com.lixc.decorator.teach;

/**
 * com.lixc.decorator
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-05 22:44
 */
public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDescription("牛奶");
        setPrice(2.0F);
    }
}
