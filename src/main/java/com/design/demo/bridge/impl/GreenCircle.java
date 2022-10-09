package com.design.demo.bridge.impl;

import com.design.demo.bridge.DrawApi;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/10/8
 */
public class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "+ radius + ", x: "+ x +", "+ y + "]");
    }
}
