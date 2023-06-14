package org.micro.persistance;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({})
@Retention(RUNTIME)
public @interface UniqueConstraint {
    String name() default "";

    String[] columnNames();
}
