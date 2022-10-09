package com.design.demo.builder.impl;

import com.design.demo.builder.AbstractBurger;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/9/26
 */
public class ChickenBurger extends AbstractBurger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
