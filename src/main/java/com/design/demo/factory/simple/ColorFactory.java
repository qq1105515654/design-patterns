package com.design.demo.factory.simple;

import com.design.demo.factory.simple.impl.Blue;
import com.design.demo.factory.simple.impl.Green;
import com.design.demo.factory.simple.impl.Red;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/9/26
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if("RED".equalsIgnoreCase(color))
            return new Red();
        if ("BLUE".equalsIgnoreCase(color))
            return new Blue();
        if ("GREEN".equalsIgnoreCase(color))
            return new Green();
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
