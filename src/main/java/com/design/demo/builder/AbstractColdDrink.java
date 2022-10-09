package com.design.demo.builder;

import com.design.demo.builder.Item;
import com.design.demo.builder.Packing;
import com.design.demo.builder.impl.BottlePacking;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/9/26
 */
public abstract class AbstractColdDrink implements Item {

    @Override
    public Packing packing() {
        return new BottlePacking();
    }

}
