package co.streamx.fluent.functions;

import java.io.Serializable;

@FunctionalInterface
public interface Consumer1<T1> extends Serializable {
    void accept(T1 t1);

    default Consumer1<T1> andThen(Consumer1<T1> other) {
        return t1 -> {
            this.accept(t1);
            other.accept(t1);
        };
    }
}
