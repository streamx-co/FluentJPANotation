package co.streamx.fluent.notation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated function creates an alias, i.e. the last argument is an alias for the first argument or
 * "this".
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Notation
public @interface Alias {
    boolean value() default true;

    /**
     * Indicates that in the context of the annotated function usage of aliases is allowed.
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ ElementType.METHOD, ElementType.PARAMETER })
    @Notation
    @interface Use {
    }
}
