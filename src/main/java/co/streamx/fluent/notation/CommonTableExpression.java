package co.streamx.fluent.notation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated function declares a common table expression(s).
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Notation
public @interface CommonTableExpression {
    boolean value() default false;

    /**
     * "Pass through" the CTE for later declaration
     */
    boolean decorator() default false;

    /**
     * Reference the CTE which will be declared later
     */
    boolean reference() default false;

    /**
     * Indicates that the annotated function marks the table to recurse on (i.e. should be the current sub-query return
     * type).
     */
    boolean self() default false;
}
