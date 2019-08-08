package co.streamx.fluent.functions;

import java.io.Serializable;
import java.util.function.BiFunction;

@FunctionalInterface
public interface Function2<T, U, R> extends BiFunction<T, U, R>, Serializable {

    default Function2<T, U, Boolean> and(Function2<T, U, Boolean> other) {
        return (t,
                u) -> (Boolean) apply(t, u) && other.apply(t, u);
    }

    default Function2<T, U, Boolean> or(Function2<T, U, Boolean> other) {
        return (t,
                u) -> (Boolean) apply(t, u) || other.apply(t, u);
    }

    /**
     * TRUE predicate
     */
    @SuppressWarnings("unchecked")
    static <T1, T2> Function2<T1, T2, Boolean> TRUE() {
        return (Function2<T1, T2, Boolean>) Predicates.TRUE2.instance;
    }

    /**
     * FALSE predicate
     */
    @SuppressWarnings("unchecked")
    static <T1, T2> Function2<T1, T2, Boolean> FALSE() {
        return (Function2<T1, T2, Boolean>) Predicates.FALSE2.instance;
    }
}
