package com.lixc.decorator.teach;

/**
 * com.lixc.decorator
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-05 22:33
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
