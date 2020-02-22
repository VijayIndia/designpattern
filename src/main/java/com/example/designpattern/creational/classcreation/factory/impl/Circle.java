package com.example.designpattern.creational.classcreation.factory.impl;


import com.example.designpattern.creational.classcreation.factory.Shape;

public class Circle implements Shape {

    String shapeType=null;
    @Override
    public String getShapeType() {
        shapeType="Circle";
        System.out.println("Set ShapeType");
        return shapeType;
    }
}
