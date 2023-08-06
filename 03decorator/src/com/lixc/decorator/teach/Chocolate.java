package com.lixc.decorator.teach;

/**
 * com.lixc.decorator
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-05 22:44
 */
public class Chocolate extends Decorator{
    public Chocolate(Drink drink) {
        super(drink);
        setDescription("巧克力");
        setPrice(3.0F);
    }
}
