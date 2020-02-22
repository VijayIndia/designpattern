package com.example.designpattern.creational.classcreation.factory.impl;

import com.example.designpattern.creational.classcreation.factory.Shape;

public class Square implements Shape {

    String shapeType=null;
    @Override
    public String getShapeType() {
        this.shapeType="Square";
        System.out.println("Set ShapeType");
        return shapeType;
    }
}
