package co.streamx.fluent.notation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated enum values should be rendered as string literals, i.e. with quotes. If applied to enum,
 * the enum values will be always quoted. If applied to a parameter, the value will be quoted in the context of that
 * parameter only.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.PARAMETER })
public @interface Literal {
}
