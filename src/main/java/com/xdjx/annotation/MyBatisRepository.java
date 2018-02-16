package com.xdjx.annotation;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Only mybatis use this annotation and this annotation is a marker annotation.
 **/
@Target(TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyBatisRepository {

}
