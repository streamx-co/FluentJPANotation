package co.streamx.fluent.functions;

import java.io.Serializable;
import java.util.function.Supplier;

@FunctionalInterface
public interface Function0<T> extends Supplier<T>, Serializable {

    default Function0<Boolean> and(Function0<Boolean> other) {
        return () -> (Boolean) get() && other.get();
    }

    default Function0<Boolean> or(Function0<Boolean> other) {
        return () -> (Boolean) get() || other.get();
    }

    /**
     * TRUE predicate
     */
    static Function0<Boolean> TRUE() {
        return (Function0<Boolean>) Predicates.TRUE0.instance;
    }

    /**
     * FALSE predicate
     */
    static Function0<Boolean> FALSE() {
        return (Function0<Boolean>) Predicates.FALSE0.instance;
    }
}
