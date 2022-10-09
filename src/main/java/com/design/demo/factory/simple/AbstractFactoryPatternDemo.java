package com.design.demo.factory.simple;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/9/26
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        //获取形状的工厂
        AbstractFactory shapeFactory=FactoryProducer.getFactory("SHAPE");

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();


        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color red = colorFactory.getColor("RED");
        red.fill();

        Color blue = colorFactory.getColor("BLUE");
        blue.fill();

        Color green = colorFactory.getColor("GREEN");
        green.fill();

    }
}
