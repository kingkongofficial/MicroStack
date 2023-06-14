package org.micro.annotations;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Inherited
@Documented
@Target({METHOD})
@Retention(RUNTIME)
public @interface Command {
    
}
