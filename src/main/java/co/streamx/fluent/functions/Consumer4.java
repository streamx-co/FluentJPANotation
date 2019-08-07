package co.streamx.fluent.functions;

import java.io.Serializable;

@FunctionalInterface
public interface Consumer4<T1, T2, T3, T4> extends Serializable {
    void accept(T1 t1,
                T2 t2,
                T3 t3,
                T4 t4);

    default Consumer4<T1, T2, T3, T4> andThen(Consumer4<T1, T2, T3, T4> other) {
        return (t1,
                t2,
                t3,
                t4) -> {
            this.accept(t1, t2, t3, t4);
            other.accept(t1, t2, t3, t4);
        };
    }
}
