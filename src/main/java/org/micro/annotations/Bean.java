package org.micro.annotations;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Inherited
@Documented
@Target(TYPE)
@Retention(RUNTIME)
public @interface Bean {

}