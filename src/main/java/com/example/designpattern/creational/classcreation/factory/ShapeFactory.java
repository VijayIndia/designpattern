package com.example.designpattern.creational.classcreation.factory;

import com.example.designpattern.creational.classcreation.factory.impl.Circle;
import com.example.designpattern.creational.classcreation.factory.impl.Square;

public class ShapeFactory {
    private Shape shape;
    public Shape getShapeObj(String shapeType) {
        if(shapeType.equalsIgnoreCase("SQUARE" )) {
            shape = new Square();
        }else if(shapeType.equalsIgnoreCase("CIRCLE")){
            shape = new Circle();
        }
        return shape;
    }
}
