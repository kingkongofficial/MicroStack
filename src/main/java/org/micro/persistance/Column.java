package org.micro.persistance;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.*;

@Target({METHOD, FIELD})
@Retention(RUNTIME)
public @interface Column {
    String name() default "";

    String comment() default "";

    boolean unique() default false;
    
    boolean nullable() default true;

    String example() default "";

    boolean insertable() default true;

    boolean updatable() default true;

    int length() default 255;

    int precision() default 0;

    int scale() default 0;
}
