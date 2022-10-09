package com.design.demo.builder;

import com.design.demo.builder.Item;
import com.design.demo.builder.Packing;
import com.design.demo.builder.impl.WrapperPacking;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/9/26
 */
public abstract class AbstractBurger implements Item {

    @Override
    public Packing packing() {
        return new WrapperPacking();
    }


}
