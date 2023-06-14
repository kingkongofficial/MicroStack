package org.micro.annotations;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Documented
@Target({METHOD, CONSTRUCTOR})
@Retention(RUNTIME)
public @interface ConstructorParameters {
    String[] value();
}
