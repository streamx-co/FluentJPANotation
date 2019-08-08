package co.streamx.fluent.functions;

import java.io.Serializable;

@FunctionalInterface
public interface Function4<T1, T2, T3, T4, R> extends Serializable {
    R apply(T1 t1,
            T2 t2,
            T3 t3,
            T4 t4);

    default Function4<T1, T2, T3, T4, Boolean> and(Function4<T1, T2, T3, T4, Boolean> other) {
        return (t1,
                t2,
                t3,
                t4) -> (Boolean) apply(t1, t2, t3, t4) && other.apply(t1, t2, t3, t4);
    }

    default Function4<T1, T2, T3, T4, Boolean> or(Function4<T1, T2, T3, T4, Boolean> other) {
        return (t1,
                t2,
                t3,
                t4) -> (Boolean) apply(t1, t2, t3, t4) || other.apply(t1, t2, t3, t4);
    }

    /**
     * TRUE predicate
     */
    @SuppressWarnings("unchecked")
    static <T1, T2, T3, T4> Function4<T1, T2, T3, T4, Boolean> TRUE() {
        return (Function4<T1, T2, T3, T4, Boolean>) Predicates.TRUE4.instance;
    }

    /**
     * FALSE predicate
     */
    @SuppressWarnings("unchecked")
    static <T1, T2, T3, T4> Function4<T1, T2, T3, T4, Boolean> FALSE() {
        return (Function4<T1, T2, T3, T4, Boolean>) Predicates.FALSE4.instance;
    }
}
