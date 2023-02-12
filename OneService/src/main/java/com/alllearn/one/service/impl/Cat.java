package com.alllearn.one.service.impl;

import com.alllearn.one.service.Animal;

/**
 * 实现类Cat
 */
public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }
}
