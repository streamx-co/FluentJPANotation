package co.streamx.fluent.functions;

import java.io.Serializable;

@FunctionalInterface
public interface Function6<T1, T2, T3, T4, T5, T6, R> extends Serializable {
    R apply(T1 t1,
            T2 t2,
            T3 t3,
            T4 t4,
            T5 t5,
            T6 t6);

    default Function6<T1, T2, T3, T4, T5, T6, Boolean> and(Function6<T1, T2, T3, T4, T5, T6, Boolean> other) {
        return (t1,
                t2,
                t3,
                t4,
                t5,
                t6) -> (Boolean) apply(t1, t2, t3, t4, t5, t6) && other.apply(t1, t2, t3, t4, t5, t6);
    }

    default Function6<T1, T2, T3, T4, T5, T6, Boolean> or(Function6<T1, T2, T3, T4, T5, T6, Boolean> other) {
        return (t1,
                t2,
                t3,
                t4,
                t5,
                t6) -> (Boolean) apply(t1, t2, t3, t4, t5, t6) || other.apply(t1, t2, t3, t4, t5, t6);
    }

    /**
     * TRUE predicate
     */
    @SuppressWarnings("unchecked")
    static <T1, T2, T3, T4, T5, T6> Function6<T1, T2, T3, T4, T5, T6, Boolean> TRUE() {
        return (Function6<T1, T2, T3, T4, T5, T6, Boolean>) Predicates.TRUE6.instance;
    }

    /**
     * FALSE predicate
     */
    @SuppressWarnings("unchecked")
    static <T1, T2, T3, T4, T5, T6> Function6<T1, T2, T3, T4, T5, T6, Boolean> FALSE() {
        return (Function6<T1, T2, T3, T4, T5, T6, Boolean>) Predicates.FALSE6.instance;
    }
}
