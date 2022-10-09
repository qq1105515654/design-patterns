package com.design.demo.factory.simple;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/9/26
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if (choice == null) return null;
        if ("SHAPE".equalsIgnoreCase(choice))
            return new ShapeFactory();
        if ("COLOR".equalsIgnoreCase(choice))
            return new ColorFactory();
        return null;
    }
}
