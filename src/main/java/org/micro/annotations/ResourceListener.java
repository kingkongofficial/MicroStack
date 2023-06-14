package org.micro.annotations;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Target({METHOD})
@Retention(RUNTIME)
public @interface ResourceListener {
    boolean different() default true;
}