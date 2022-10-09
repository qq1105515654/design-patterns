package com.design.demo.prototype.impl;

import com.design.demo.prototype.Shape;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/9/26
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
