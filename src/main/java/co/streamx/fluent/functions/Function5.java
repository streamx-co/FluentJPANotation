package co.streamx.fluent.functions;

import java.io.Serializable;

@FunctionalInterface
public interface Function5<T1, T2, T3, T4, T5, R> extends Serializable {
    R apply(T1 t1,
            T2 t2,
            T3 t3,
            T4 t4,
            T5 t5);

    default Function5<T1, T2, T3, T4, T5, Boolean> and(Function5<T1, T2, T3, T4, T5, Boolean> other) {
        return (t1,
                t2,
                t3,
                t4,
                t5) -> (Boolean) apply(t1, t2, t3, t4, t5) && other.apply(t1, t2, t3, t4, t5);
    }

    default Function5<T1, T2, T3, T4, T5, Boolean> or(Function5<T1, T2, T3, T4, T5, Boolean> other) {
        return (t1,
                t2,
                t3,
                t4,
                t5) -> (Boolean) apply(t1, t2, t3, t4, t5) || other.apply(t1, t2, t3, t4, t5);
    }

    /**
     * TRUE predicate
     */
    @SuppressWarnings("unchecked")
    static <T1, T2, T3, T4, T5> Function5<T1, T2, T3, T4, T5, Boolean> TRUE() {
        return (Function5<T1, T2, T3, T4, T5, Boolean>) Predicates.TRUE5.instance;
    }

    /**
     * FALSE predicate
     */
    @SuppressWarnings("unchecked")
    static <T1, T2, T3, T4, T5> Function5<T1, T2, T3, T4, T5, Boolean> FALSE() {
        return (Function5<T1, T2, T3, T4, T5, Boolean>) Predicates.FALSE5.instance;
    }
}
