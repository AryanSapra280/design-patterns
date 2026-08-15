package com.designpatterns.designpatterns.designPatterns.creational.singleton;

public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton object;
    public DoubleCheckSingleton() {

    }
    public static DoubleCheckSingleton getInstance() {
        if(object == null) {
            synchronized (DoubleCheckSingleton.class) {
                object = new DoubleCheckSingleton();
            }
        }
        return object;
    }
}
