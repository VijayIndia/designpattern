package com.example.designpattern.creational.classcreation.abstractfactory;

import com.example.designpattern.creational.classcreation.abstractfactory.factory.OrdinaryFactory;
import com.example.designpattern.creational.classcreation.abstractfactory.factory.RoundedFactory;

public class AbstractFactoryImpl {

    public AbstractFactoryImpl(String shapeType) {
        AbstractFactory abstractFactory=null;
        if(shapeType.equalsIgnoreCase("ROUND")){
            abstractFactory=new RoundedFactory();
        }else if(shapeType.equalsIgnoreCase("ORDINARY")){
            abstractFactory=new OrdinaryFactory();
        }
    }
}
