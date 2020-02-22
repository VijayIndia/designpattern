package com.example.designpattern.creational.classcreation.abstractfactory.impl;

import com.example.designpattern.creational.classcreation.abstractfactory.Shape;

public class RoundedRectangle implements Shape {
    @Override
    public void drawShape() {
        System.out.println("Inside Rounded Rectangle");
    }
}
