package org.micro.persistance;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(TYPE)
@Retention(RUNTIME)
public @interface Table {
    String name() default "";

    String catalog() default "";

    UniqueConstraint[] uniqueConstraints() default {};

    Index[] indexes() default {};

    String comment() default "";

}