package org.micro.annotations;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.*;

@Documented
@Target({TYPE})
@Retention(RUNTIME)
public @interface AutoLoad {
    boolean value() default true;
}
