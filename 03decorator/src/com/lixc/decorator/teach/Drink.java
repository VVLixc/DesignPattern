package com.lixc.decorator.teach;

/**
 * com.lixc.decorator
 * 抽象组件Component
 * @author Lixc
 * @version 1.0
 * @since 2023-08-05 22:29
 */
public abstract class Drink {
    // 描述
    public String description;
    private float price=0.0F;
    // 计算费用的抽象方法
    // 由子类实现
    public abstract float cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
