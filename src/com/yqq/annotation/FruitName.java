package com.yqq.annotation;

import java.lang.annotation.*;

/**
 * created by yqq 2020/3/27
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {

    String value() default "";
}
