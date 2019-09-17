package co.streamx.fluent.functions;

import java.io.Serializable;

@FunctionalInterface
public interface Function3<T1, T2, T3, R> extends Serializable {
    R apply(T1 t1,
            T2 t2,
            T3 t3);

    default Function3<T1, T2, T3, Boolean> and(Function3<T1, T2, T3, Boolean> other) {
        return (t1,
                t2,
                t3) -> (Boolean) apply(t1, t2, t3) && other.apply(t1, t2, t3);
    }

    default Function3<T1, T2, T3, Boolean> or(Function3<T1, T2, T3, Boolean> other) {
        return (t1,
                t2,
                t3) -> (Boolean) apply(t1, t2, t3) || other.apply(t1, t2, t3);
    }

    static <T1, T2, T3, R> Function3<T1, T2, T3, R[]> emptyArray() {
        @SuppressWarnings("unchecked")
        R[] empty = (R[]) Predicates.emptyArray;
        return (t1,
                t2,
                t3) -> empty;
    }

    /**
     * TRUE predicate
     */
    @SuppressWarnings("unchecked")
    static <T1, T2, T3> Function3<T1, T2, T3, Boolean> TRUE() {
        return (Function3<T1, T2, T3, Boolean>) Predicates.TRUE3.instance;
    }

    /**
     * FALSE predicate
     */
    @SuppressWarnings("unchecked")
    static <T1, T2, T3> Function3<T1, T2, T3, Boolean> FALSE() {
        return (Function3<T1, T2, T3, Boolean>) Predicates.FALSE3.instance;
    }
}
