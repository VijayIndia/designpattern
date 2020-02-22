package com.example.designpattern.creational.classcreation.singleton;

public class SingletonClass {

    private static SingletonClass singletonClass;
    private Integer i;

    private SingletonClass(){
        i=10;
    }
    public static SingletonClass getSingletonObject(){
        if(singletonClass == null){
            System.out.println("Singleton Object is Created");
            singletonClass=new SingletonClass();
        }
        System.out.println("Singleton Object is Provided");
        return singletonClass;
    }
    public Integer getLocalValue(){
        return i;
    }

}



