package com.alllearn.config;

import java.lang.annotation.*;

/**
 * zyp
 * 2021/11/19
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ZypLogin {
    boolean value() default true;
}
