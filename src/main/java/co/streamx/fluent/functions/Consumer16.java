package co.streamx.fluent.functions;

import java.io.Serializable;

@FunctionalInterface
public interface Consumer16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>
        extends Serializable {
    void accept(T1 t1,
                T2 t2,
                T3 t3,
                T4 t4,
                T5 t5,
                T6 t6,
                T7 t7,
                T8 t8,
                T9 t9,
                T10 t10,
                T11 t11,
                T12 t12,
                T13 t13,
                T14 t14,
                T15 t15,
                T16 t16);

    default Consumer16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> andThen(Consumer16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> other) {
        return (t1,
                t2,
                t3,
                t4,
                t5,
                t6,
                t7,
                t8,
                t9,
                t10,
                t11,
                t12,
                t13,
                t14,
                t15,
                t16) -> {
            this.accept(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16);
            other.accept(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16);
        };
    }
}
