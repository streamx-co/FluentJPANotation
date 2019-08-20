package co.streamx.fluent.notation;

import java.util.Arrays;
import java.util.stream.Collectors;

public interface Keyword {
    @Local
    static Keyword join(Keyword... keywords) {
        String joined = Arrays.stream(keywords).map(Object::toString).collect(Collectors.joining());
        return new Keyword() {
            @Override
            public String toString() {
                return joined;
            }
        };
    }
}
