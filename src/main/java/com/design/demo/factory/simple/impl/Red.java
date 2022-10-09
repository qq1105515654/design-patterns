package com.design.demo.factory.simple.impl;

import com.design.demo.factory.simple.Color;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/9/26
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
