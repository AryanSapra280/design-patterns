package com.designpatterns.designpatterns.designPatterns.creational.singleton;

public class EagerSingleton {
    private static EagerSingleton object=new EagerSingleton();
    private EagerSingleton(){}
    public static EagerSingleton getInstance() {
        return object;
    }
}
