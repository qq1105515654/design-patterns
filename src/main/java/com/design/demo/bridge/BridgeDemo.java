package com.design.demo.bridge;

import com.design.demo.bridge.impl.Circle;
import com.design.demo.bridge.impl.GreenCircle;
import com.design.demo.bridge.impl.RedCircle;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/10/8
 */
public class BridgeDemo {

    public static void main(String[] args) {
        Circle redCircle = new Circle(100, 100, 10, new RedCircle());
        Circle greenCircle = new Circle(100, 100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
