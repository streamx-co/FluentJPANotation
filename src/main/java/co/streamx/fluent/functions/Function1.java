package co.streamx.fluent.functions;

import java.io.Serializable;
import java.util.function.Function;

@FunctionalInterface
public interface Function1<T, R> extends Function<T, R>, Serializable {

    default Function1<T, Boolean> and(Function1<T, Boolean> other) {
        return (t) -> (Boolean) apply(t) && other.apply(t);
    }

    default Function1<T, Boolean> or(Function1<T, Boolean> other) {
        return (t) -> (Boolean) apply(t) || other.apply(t);
    }

    static <T, R> Function1<T, R[]> emptyArray() {
        @SuppressWarnings("unchecked")
        R[] empty = (R[]) Predicates.emptyArray;
        return t -> empty;
    }

    /**
     * TRUE predicate
     */
    @SuppressWarnings("unchecked")
    static <T> Function1<T, Boolean> TRUE() {
        return (Function1<T, Boolean>) Predicates.TRUE1.instance;
    }

    /**
     * FALSE predicate
     */
    @SuppressWarnings("unchecked")
    static <T> Function1<T, Boolean> FALSE() {
        return (Function1<T, Boolean>) Predicates.FALSE1.instance;
    }
}
