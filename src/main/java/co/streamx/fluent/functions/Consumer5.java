package co.streamx.fluent.functions;

import java.io.Serializable;

@FunctionalInterface
public interface Consumer5<T1, T2, T3, T4, T5> extends Serializable {
    void accept(T1 t1,
                T2 t2,
                T3 t3,
                T4 t4,
                T5 t5);

    default Consumer5<T1, T2, T3, T4, T5> andThen(Consumer5<T1, T2, T3, T4, T5> other) {
        return (t1,
                t2,
                t3,
                t4,
                t5) -> {
            this.accept(t1, t2, t3, t4, t5);
            other.accept(t1, t2, t3, t4, t5);
        };
    }
}
