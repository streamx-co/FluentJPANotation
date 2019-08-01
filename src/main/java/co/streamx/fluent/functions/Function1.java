package co.streamx.fluent.functions;

import java.io.Serializable;
import java.util.function.Function;

@FunctionalInterface
public interface Function1<T, R> extends Function<T, R>, Serializable {

}
