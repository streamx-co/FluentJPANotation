package co.streamx.fluent.notation;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface Keyword {
    @Local
    static Keyword join(Keyword... keywords) {
        String joined = Stream.of(keywords).map(Object::toString).collect(Collectors.joining());
        return new Keyword() {
            @Override
            public String toString() {
                return joined;
            }
        };
    }
}
