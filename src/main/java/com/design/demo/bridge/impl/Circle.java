package com.design.demo.bridge.impl;

import com.design.demo.bridge.DrawApi;
import com.design.demo.bridge.Shape;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/10/8
 */
public class Circle extends Shape {
    private Integer x, y, radius;

    public Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
