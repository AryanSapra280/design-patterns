package com.designpatterns.designpatterns.designPatterns.creational.singleton;

public class SynchronizedSingleton {
    private static SynchronizedSingleton object;
    private SynchronizedSingleton() {

    }
    public static synchronized SynchronizedSingleton getInstance() {
        if(object == null) {
            object = new SynchronizedSingleton();
        }
        return object;

    }
}
