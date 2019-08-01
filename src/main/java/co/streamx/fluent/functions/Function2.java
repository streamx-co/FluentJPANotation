package co.streamx.fluent.functions;

import java.io.Serializable;
import java.util.function.BiFunction;

@FunctionalInterface
public interface Function2<T, U, R> extends BiFunction<T, U, R>, Serializable {

}
