package com.alllearn.one.service;

/**
 * 只有一个抽象方法eat所以就满足是个函数式接口
 */
public interface Animal {

    void eat();

    /**
     * 默认方法:子类可以也可以继承或者重写,
     */
    default void say() {
        System.out.println("Animal say");
    };

    /**
     * 子类不可继承,接口直接调用
     */
    static void run() {
        System.out.println("Animal run");
    };
}

