package com.designpatterns.designpatterns.designPatterns.creational.singleton;

public class BillPughSingleton {
    public BillPughSingleton() {}
    public static class BillPughSingletonStatic {
        private static final BillPughSingleton object = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance() {
        return BillPughSingletonStatic.object;
    }
}
