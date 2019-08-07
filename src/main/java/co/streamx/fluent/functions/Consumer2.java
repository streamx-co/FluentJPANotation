package co.streamx.fluent.functions;

import java.io.Serializable;

@FunctionalInterface
public interface Consumer2<T1, T2> extends Serializable {
    void accept(T1 t1,
                T2 t2);

    default Consumer2<T1, T2> andThen(Consumer2<T1, T2> other) {
        return (t1,
                t2) -> {
            this.accept(t1, t2);
            other.accept(t1, t2);
        };
    }
}
