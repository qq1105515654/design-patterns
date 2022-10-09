package com.design.demo.bridge;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/10/8
 */
public abstract class Shape {
    protected DrawApi drawApi;
    protected Shape(DrawApi drawApi){
        this.drawApi=drawApi;
    }

    public abstract void draw();
}
