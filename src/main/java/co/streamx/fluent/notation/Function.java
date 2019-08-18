package co.streamx.fluent.notation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the method is a DSL function, i.e. a function implemented elsewhere
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Notation
public @interface Function {

    /**
     * standard SQL parameter marker, so cannot be a real name
     */
    static String USE_METHOD_NAME = "?";

    String name() default USE_METHOD_NAME;

    boolean omitParentheses() default false;

    /**
     * Useful in VarArgs cases
     */
    boolean omitParenthesesIfArgumentess() default false;

    boolean omitArgumentsDelimiter() default false;

    ParameterContext parameterContext() default ParameterContext.INHERIT;

    /**
     * Specifies optional capabilities. If exist, will override {@link #parameterContext()} value.
     */
    Capability[] parameterContextCapabilities() default {};

    /**
     * Delimiter emitted between the arguments
     */
    String argumentsDelimiter() default ",";

    boolean underscoresAsBlanks() default true;

    boolean aliasesVisible() default false;

    boolean requiresAlias() default false;
}
