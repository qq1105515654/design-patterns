package com.design.demo.prototype.impl;

import com.design.demo.prototype.Shape;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/9/26
 */
public class Square  extends Shape {

    public Square(){
        type ="square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
