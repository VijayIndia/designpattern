package com.example.designpattern.creational;

import com.example.designpattern.creational.classcreation.factory.Shape;
import com.example.designpattern.creational.classcreation.factory.ShapeFactory;
import com.example.designpattern.creational.classcreation.singleton.SingletonClass;

public class CreationalMainClass {

    public CreationalMainClass() {
        printSingletonClass();
        printFactoryClass();
    }

    private void printSingletonClass(){
        SingletonClass singletonClass=SingletonClass.getSingletonObject();
        System.out.println("1)Calling SingletonClass i-->"+singletonClass.getLocalValue());
        SingletonClass singletonClass1=SingletonClass.getSingletonObject();
        System.out.println("2)Calling SingletonClass i-->"+singletonClass1.getLocalValue());
    }

    private void printFactoryClass(){
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape square=shapeFactory.getShapeObj("SQUARE");
        System.out.println("ShapeType-->"+square.getShapeType());
        Shape circle=shapeFactory.getShapeObj("CIRCLE");
        System.out.println("ShapeType-->"+circle.getShapeType());
    }
}
