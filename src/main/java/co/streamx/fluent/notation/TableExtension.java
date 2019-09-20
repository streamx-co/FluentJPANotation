package co.streamx.fluent.notation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated method provides access to join table (SecondaryTable, InheritanceType.JOIN)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Notation
public @interface TableExtension {
    TableExtensionType value();
}
