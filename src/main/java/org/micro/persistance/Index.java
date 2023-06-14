package org.micro.persistance;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({})
@Retention(RUNTIME)
public @interface Index {
    String name() default "";
    String columnList();
    boolean unique() default false;
}
