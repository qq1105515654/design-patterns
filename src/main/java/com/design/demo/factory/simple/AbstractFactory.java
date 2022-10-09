package com.design.demo.factory.simple;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/9/26
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);

}
