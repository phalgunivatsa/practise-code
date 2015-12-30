package com.yash;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface AnnotationForSum {
	public int value1();
	public int value2();
}
