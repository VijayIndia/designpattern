package com.example.designpattern.creational.classcreation.abstractfactory.factory;

import com.example.designpattern.creational.classcreation.abstractfactory.AbstractFactory;
import com.example.designpattern.creational.classcreation.abstractfactory.Shape;
import com.example.designpattern.creational.classcreation.abstractfactory.impl.Rectangle;
import com.example.designpattern.creational.classcreation.abstractfactory.impl.Square;

public class OrdinaryFactory extends AbstractFactory {

    public Shape getShape(String shapeType){
        Shape shape=null;
        if(shapeType.equalsIgnoreCase("SQUARE")){
            shape=new Square();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            shape=new Rectangle();
        }
        return shape;
    }
}
