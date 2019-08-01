package co.streamx.fluent.functions;

import java.io.Serializable;
import java.util.function.Supplier;

@FunctionalInterface
public interface Function0<T> extends Supplier<T>, Serializable {

}
