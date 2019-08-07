package co.streamx.fluent.functions;

import java.io.Serializable;

@FunctionalInterface
public interface Consumer3<T1, T2, T3> extends Serializable {
    void accept(T1 t1,
                T2 t2,
                T3 t3);

    default Consumer3<T1, T2, T3> andThen(Consumer3<T1, T2, T3> other) {
        return (t1,
                t2,
                t3) -> {
            this.accept(t1, t2, t3);
            other.accept(t1, t2, t3);
        };
    }
}
