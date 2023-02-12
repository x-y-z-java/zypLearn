package com.alllearn;

import com.alllearn.one.service.Animal;
import com.alllearn.one.service.impl.Cat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    public void testFunctionInterface(){

        /**
         * 函数式接口应用场景一
         */
        // 直接调用接口中的静态方法
        Animal.run();

        // 相当于定义了Animal的唯一的一个抽象方法(eat)中的实现
        Animal animal = () -> System.out.println("Lambda表达式实现的eat");
        animal.eat();

        // 执行默认方法
        animal.say();

        /**
         * 函数式接口应用场景二
         */
        Animal cat = new Cat();

        // 执行子类重写的say方法
        cat.say();

        // 子类常规实现父接口中的eat方法
        cat.eat();

        /**
         * 函数式接口应用场景三
         */
//        fead( );
    }

    public void fead(Animal animal) {

        // 调用函数式接口中的抽象方法
        animal.eat();
    }
}
