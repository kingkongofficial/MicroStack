package org.micro.persistance;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.*;

@Target({TYPE})
@Retention(RUNTIME)
public @interface Cacheable {
    boolean value() default true;

    int interval() default 0;

    boolean direct() default false;

    boolean continousid() default false;
}