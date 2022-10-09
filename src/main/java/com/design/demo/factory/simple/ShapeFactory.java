package com.design.demo.factory.simple;

import com.design.demo.factory.simple.impl.Circle;
import com.design.demo.factory.simple.impl.Rectangle;
import com.design.demo.factory.simple.impl.Square;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/9/23
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    public Color getColor(String color) {
        return null;
    }

    /**
     * 创建一个工厂方法获取具体类型对象
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if("CIRCLE".equalsIgnoreCase(shapeType))
            return new Circle();
        if("RECTANGLE".equalsIgnoreCase(shapeType))
            return new Rectangle();
        if("SQUARE".equalsIgnoreCase(shapeType))
            return new Square();
        return null;
    }

    public Shape getShape(Class<? extends Shape> type) throws InstantiationException, IllegalAccessException {
        if(type==null){
            return null;
        }
        Shape shape = type.newInstance();
        return shape;
    }


    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }

}
