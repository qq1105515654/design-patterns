package com.design.demo.factory.simple.impl;

import com.design.demo.factory.simple.Shape;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/9/23
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
