package org.micro.annotations;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Resource {
    public boolean required() default true;

    public String name() default "";

    public Class<?> type() default Object.class;
}
