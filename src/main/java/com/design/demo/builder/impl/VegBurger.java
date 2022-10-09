package com.design.demo.builder.impl;

import com.design.demo.builder.AbstractBurger;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/9/26
 */
public class VegBurger extends AbstractBurger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
