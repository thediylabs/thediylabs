package com.diy.labs.model.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Truncate {
	
	int length() default 0;
	boolean enabled() default false;
}
