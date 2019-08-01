package co.streamx.fluent.functions;

import java.io.Serializable;

@FunctionalInterface
public interface Consumer1<T1> extends Serializable {
    void accept(T1 t1);
}
