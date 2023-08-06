package com.lixc.decorator.teach;

/**
 * com.lixc.decorator
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-05 22:39
 */
public class Decorator extends Drink{
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice()+ drink.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription()+super.getPrice()+drink.description;
    }
}
