package co.streamx.fluent.functions;

import java.io.Serializable;

@FunctionalInterface
public interface Consumer9<T1, T2, T3, T4, T5, T6, T7, T8, T9> extends Serializable {
    void accept(T1 t1,
                T2 t2,
                T3 t3,
                T4 t4,
                T5 t5,
                T6 t6,
                T7 t7,
                T8 t8,
                T9 t9);

    default Consumer9<T1, T2, T3, T4, T5, T6, T7, T8, T9> andThen(Consumer9<T1, T2, T3, T4, T5, T6, T7, T8, T9> other) {
        return (t1,
                t2,
                t3,
                t4,
                t5,
                t6,
                t7,
                t8,
                t9) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8, t9);
            other.accept(t1, t2, t3, t4, t5, t6, t7, t8, t9);
        };
    }
}
