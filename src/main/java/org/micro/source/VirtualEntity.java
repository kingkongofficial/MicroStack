package org.micro.source;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.*;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;

@Deprecated(since = "2.8.0")
@Documented
@Target(TYPE)
@Retention(RUNTIME)
public @interface VirtualEntity {
    boolean direct() default false;

    Class<? extends BiFunction<DataSource, EntityInfo, CompletableFuture<List>>> loader() default DefaultFunctionLoader.class;

    public static class DefaultFunctionLoader implements BiFunction<DataSource, EntityInfo, CompletableFuture<List>> {

        @Override
        public CompletableFuture<List> apply(DataSource source, EntityInfo info) {
            return null;
        }
    }
}