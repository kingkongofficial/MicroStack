package org.micro.persistance;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
public @interface SearchColumn {
    boolean text() default false;

    String highlight() default "";

    boolean ignore() default false;

    String options() default "";

    boolean html() default false;

    boolean date() default false;

    boolean ip() default false;

    String analyzer() default "";

    String searchAnalyzer() default "";
}