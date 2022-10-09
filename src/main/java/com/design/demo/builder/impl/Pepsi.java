package com.design.demo.builder.impl;

import com.design.demo.builder.AbstractColdDrink;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/9/26
 */
public class Pepsi extends AbstractColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
