package co.streamx.fluent.notation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that a {@link Function} is an operator. Logically it can be applied on a method with 1 or 2 parameters,
 * making it a unary or a binary operator. The second parameter can be <code>varargs</code>. In practice this annotation
 * lets apply the function name after its first argument and all the other arguments will be grouped in parentheses.
 * <p>
 * E.g. given IN a <code>right = true</code> operator,
 * 
 * <pre>
 * Java: <code>IN(a, b, c, d)</code>
 * will become: <code>a IN (b, c, d)</code>
 * </pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Notation
public @interface Operator {

    /**
     * If true, the operator is applied on the right of its first argument. Otherwise it's applied on the left of its
     * argument.
     */
    boolean right() default true;

    /**
     * If true, omits parentheses around second and further arguments
     */
    boolean omitParentheses() default false;
}
