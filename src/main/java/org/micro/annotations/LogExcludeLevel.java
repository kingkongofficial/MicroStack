package org.micro.annotations;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Target({TYPE})
@Retention(RUNTIME)
@Repeatable(LogExcludeLevel.LogExcludeLevels.class)
public @interface LogExcludeLevel {

    String[] levels();

    String[] keys();

    @Documented
    @Target({TYPE})
    @Retention(RUNTIME)
    @interface LogExcludeLevels {

        LogExcludeLevel[] value();
    }
}