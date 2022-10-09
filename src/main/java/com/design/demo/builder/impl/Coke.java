package com.design.demo.builder.impl;

import com.design.demo.builder.AbstractColdDrink;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/9/26
 */
public class Coke extends AbstractColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
