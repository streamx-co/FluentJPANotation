package co.streamx.fluent.notation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ViewDeclaration {

    /**
     * Indicates that the method should apply view declaration on the arguments of the method, or to the argument used
     * to create the view
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface From {
        /**
         * Should alias the columns or not
         */
        boolean aliased() default false;
    }

    /**
     * Indicates that the method returns the view declaration
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface Columns {
    }

    /**
     * Indicates that the method return the view declaration
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface Alias {
    }
}
