package co.streamx.fluent.notation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the class is a dynamic entity, e.g. temporary table or Sub Query result. This annotation is applied to
 * the entity class. To specify table name, use {@link javax.persistence.Table} annotation
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
@Notation
public @interface Tuple {
    /**
     * (Optional) The dynamic entity name.
     */
    String value() default "";
}
