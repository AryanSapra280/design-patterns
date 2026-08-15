package com.designpatterns.designpatterns.designPatterns.creational.singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable {
    private static LazySingleton object;
    private LazySingleton(){}

    public static LazySingleton getInstance() {
          if (object == null) {
              object = new LazySingleton();
          }
          return object;
    }
    public void printMessage(String message) {
        System.out.println("From Lazy" + message);
    }

    private Object readResolve() {
        return object;
    }
    /*
    * This can break in multithreading, when 2 or more threads call, then any 2 threads can have object==null at the same time.
    * can get this issue.
    * Someone can clone this class and create a new instance.
    * If this class implements serializable, then it can cause a problem because deserialization can create a new object[readResolve resolves this, as JVM calls this method during deserailization]
    * */
}
