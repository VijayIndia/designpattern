package com.example.designpattern.creational.classcreation.abstractfactory.impl;

import com.example.designpattern.creational.classcreation.abstractfactory.Shape;

public class Rectangle implements Shape {
    @Override
    public void drawShape() {
        System.out.println("Inside Rectangle");
    }
}
