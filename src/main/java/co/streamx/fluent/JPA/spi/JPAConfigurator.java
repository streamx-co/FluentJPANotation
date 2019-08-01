package co.streamx.fluent.JPA.spi;

import co.streamx.fluent.functions.Function0;
import co.streamx.fluent.functions.Function1;
import co.streamx.fluent.functions.Function2;
import co.streamx.fluent.functions.Function3;

/**
 * Generic configurator, should be separately implemented for SQL and JPQL
 */
public interface JPAConfigurator {

    /**
     * Register method substitution. In some cases type inference does not work well, so the from parameter must be
     * explicitly casted
     * 
     * @param from
     * @param to
     */
    <T1, T2, T3, R> void registerMethodSubstitution(Function3<T1, T2, T3, R> from,
                                                    Function3<? super T1, ? super T2, ? super T3, ? extends R> to);

    /**
     * Register method substitution. In some cases type inference does not work well, so the from parameter must be
     * explicitly casted
     * 
     * @param from
     * @param to
     */
    <T, U, R> void registerMethodSubstitution(Function2<T, U, R> from,
                                              Function2<? super T, ? super U, ? extends R> to);

    /**
     * Register method substitution. In some cases type inference does not work well, so the from parameter must be
     * explicitly casted
     * 
     * @param from
     * @param to
     */
    <T, R> void registerMethodSubstitution(Function1<T, R> from,
                                           Function1<? super T, ? extends R> to);

    /**
     * Register method substitution. In some cases type inference does not work well, so the from parameter must be
     * explicitly casted
     * 
     * @param from
     * @param to
     */
    <R> void registerMethodSubstitution(Function0<R> from,
                                        Function0<? extends R> to);

    /**
     * Unregister method substitution. In some cases type inference does not work well, so the from parameter must be
     * explicitly casted
     * 
     * @return true if removed
     */
    <T1, T2, T3, R> boolean unregisterMethodSubstitution(Function3<T1, T2, T3, R> from);

    /**
     * Unregister method substitution. In some cases type inference does not work well, so the from parameter must be
     * explicitly casted
     * 
     * @return true if removed
     */
    <T, U, R> boolean unregisterMethodSubstitution(Function2<T, U, R> from);

    /**
     * Unregister method substitution. In some cases type inference does not work well, so the from parameter must be
     * explicitly casted
     * 
     * @return true if removed
     */
    <T, R> boolean unregisterMethodSubstitution(Function1<T, R> from);

    /**
     * Unregister method substitution. In some cases type inference does not work well, so the from parameter must be
     * explicitly casted
     * 
     * @return true if removed
     */
    <R> boolean unregisterMethodSubstitution(Function0<R> from);
}
