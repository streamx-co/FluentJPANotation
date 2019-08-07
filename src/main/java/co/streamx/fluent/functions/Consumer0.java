package co.streamx.fluent.functions;

import java.io.Serializable;

@FunctionalInterface
public interface Consumer0 extends Serializable {
    void accept();

    default Consumer0 andThen(Consumer0 other) {
        return () -> {
            this.accept();
            other.accept();
        };
    }
}
