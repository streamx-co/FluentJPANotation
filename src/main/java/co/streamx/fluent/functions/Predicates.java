package co.streamx.fluent.functions;

import java.io.ObjectStreamException;

interface Predicates {

    class TRUE0 implements Function0<Boolean> {

        static final TRUE0 instance = new TRUE0();
        private static final Function0<Boolean> writeReplace = () -> true;

        @Override
        public Boolean get() {
            return true;
        }

        @Override
        public Function0<Boolean> and(Function0<Boolean> other) {
            return other;
        }

        @Override
        public Function0<Boolean> or(Function0<Boolean> other) {
            return this;
        }

        private Object writeReplace() throws ObjectStreamException {
            return writeReplace;
        }
    }

    class FALSE0 implements Function0<Boolean> {

        static final TRUE0 instance = new TRUE0();
        private static final Function0<Boolean> writeReplace = () -> false;

        @Override
        public Boolean get() {
            return false;
        }

        @Override
        public Function0<Boolean> and(Function0<Boolean> other) {
            return this;
        }

        @Override
        public Function0<Boolean> or(Function0<Boolean> other) {
            return other;
        }

        private Object writeReplace() throws ObjectStreamException {
            return writeReplace;
        }
    }

    class TRUE1<T> implements Function1<T, Boolean> {

        static final TRUE1<?> instance = new TRUE1<>();
        private static final Function1<?, Boolean> writeReplace = t -> true;

        @Override
        public Boolean apply(T t) {
            return true;
        }

        @Override
        public Function1<T, Boolean> and(Function1<T, Boolean> other) {
            return other;
        }

        @Override
        public Function1<T, Boolean> or(Function1<T, Boolean> other) {
            return this;
        }

        private Object writeReplace() throws ObjectStreamException {
            return writeReplace;
        }
    }

    class FALSE1<T> implements Function1<T, Boolean> {

        static final FALSE1<?> instance = new FALSE1<>();
        private static final Function1<?, Boolean> writeReplace = t -> false;

        @Override
        public Boolean apply(T t) {
            return false;
        }

        @Override
        public Function1<T, Boolean> and(Function1<T, Boolean> other) {
            return this;
        }

        @Override
        public Function1<T, Boolean> or(Function1<T, Boolean> other) {
            return other;
        }

        private Object writeReplace() throws ObjectStreamException {
            return writeReplace;
        }
    }

    class TRUE2<T1, T2> implements Function2<T1, T2, Boolean> {

        static final TRUE2<?, ?> instance = new TRUE2<>();
        private static final Function2<?, ?, Boolean> writeReplace = (t1,
                                                                      t2) -> true;

        @Override
        public Boolean apply(T1 t1,
                             T2 t) {
            return true;
        }

        @Override
        public Function2<T1, T2, Boolean> and(Function2<T1, T2, Boolean> other) {
            return other;
        }

        @Override
        public Function2<T1, T2, Boolean> or(Function2<T1, T2, Boolean> other) {
            return this;
        }

        private Object writeReplace() throws ObjectStreamException {
            return writeReplace;
        }
    }

    class FALSE2<T1, T2> implements Function2<T1, T2, Boolean> {

        static final FALSE2<?, ?> instance = new FALSE2<>();
        private static final Function2<?, ?, Boolean> writeReplace = (t1,
                                                                      t2) -> false;

        @Override
        public Boolean apply(T1 t1,
                             T2 t) {
            return false;
        }

        @Override
        public Function2<T1, T2, Boolean> and(Function2<T1, T2, Boolean> other) {
            return this;
        }

        @Override
        public Function2<T1, T2, Boolean> or(Function2<T1, T2, Boolean> other) {
            return other;
        }

        private Object writeReplace() throws ObjectStreamException {
            return writeReplace;
        }
    }

    class TRUE3<T1, T2, T3> implements Function3<T1, T2, T3, Boolean> {

        static final TRUE3<?, ?, ?> instance = new TRUE3<>();
        private static final Function3<?, ?, ?, Boolean> writeReplace = (t1,
                                                                         t2,
                                                                         t3) -> true;

        @Override
        public Boolean apply(T1 t1,
                             T2 t2,
                             T3 t3) {
            return true;
        }

        @Override
        public Function3<T1, T2, T3, Boolean> and(Function3<T1, T2, T3, Boolean> other) {
            return other;
        }

        @Override
        public Function3<T1, T2, T3, Boolean> or(Function3<T1, T2, T3, Boolean> other) {
            return this;
        }

        private Object writeReplace() throws ObjectStreamException {
            return writeReplace;
        }
    }

    class FALSE3<T1, T2, T3> implements Function3<T1, T2, T3, Boolean> {

        static final FALSE3<?, ?, ?> instance = new FALSE3<>();
        private static final Function3<?, ?, ?, Boolean> writeReplace = (t1,
                                                                         t2,
                                                                         t3) -> false;

        @Override
        public Boolean apply(T1 t1,
                             T2 t2,
                             T3 t3) {
            return false;
        }

        @Override
        public Function3<T1, T2, T3, Boolean> and(Function3<T1, T2, T3, Boolean> other) {
            return this;
        }

        @Override
        public Function3<T1, T2, T3, Boolean> or(Function3<T1, T2, T3, Boolean> other) {
            return other;
        }

        private Object writeReplace() throws ObjectStreamException {
            return writeReplace;
        }
    }

    class TRUE4<T1, T2, T3, T4> implements Function4<T1, T2, T3, T4, Boolean> {

        static final TRUE4<?, ?, ?, ?> instance = new TRUE4<>();
        private static final Function4<?, ?, ?, ?, Boolean> writeReplace = (t1,
                                                                            t2,
                                                                            t3,
                                                                            t4) -> true;

        @Override
        public Boolean apply(T1 t1,
                             T2 t2,
                             T3 t3,
                             T4 t4) {
            return true;
        }

        @Override
        public Function4<T1, T2, T3, T4, Boolean> and(Function4<T1, T2, T3, T4, Boolean> other) {
            return other;
        }

        @Override
        public Function4<T1, T2, T3, T4, Boolean> or(Function4<T1, T2, T3, T4, Boolean> other) {
            return this;
        }

        private Object writeReplace() throws ObjectStreamException {
            return writeReplace;
        }
    }

    class FALSE4<T1, T2, T3, T4> implements Function4<T1, T2, T3, T4, Boolean> {

        static final FALSE4<?, ?, ?, ?> instance = new FALSE4<>();
        private static final Function4<?, ?, ?, ?, Boolean> writeReplace = (t1,
                                                                            t2,
                                                                            t3,
                                                                            t4) -> false;

        @Override
        public Boolean apply(T1 t1,
                             T2 t2,
                             T3 t3,
                             T4 t4) {
            return false;
        }

        @Override
        public Function4<T1, T2, T3, T4, Boolean> and(Function4<T1, T2, T3, T4, Boolean> other) {
            return this;
        }

        @Override
        public Function4<T1, T2, T3, T4, Boolean> or(Function4<T1, T2, T3, T4, Boolean> other) {
            return other;
        }

        private Object writeReplace() throws ObjectStreamException {
            return writeReplace;
        }
    }

    class TRUE5<T1, T2, T3, T4, T5> implements Function5<T1, T2, T3, T4, T5, Boolean> {

        static final TRUE5<?, ?, ?, ?, ?> instance = new TRUE5<>();
        private static final Function5<?, ?, ?, ?, ?, Boolean> writeReplace = (t1,
                                                                               t2,
                                                                               t3,
                                                                               t4,
                                                                               t5) -> true;

        @Override
        public Boolean apply(T1 t1,
                             T2 t2,
                             T3 t3,
                             T4 t4,
                             T5 t5) {
            return true;
        }

        @Override
        public Function5<T1, T2, T3, T4, T5, Boolean> and(Function5<T1, T2, T3, T4, T5, Boolean> other) {
            return other;
        }

        @Override
        public Function5<T1, T2, T3, T4, T5, Boolean> or(Function5<T1, T2, T3, T4, T5, Boolean> other) {
            return this;
        }

        private Object writeReplace() throws ObjectStreamException {
            return writeReplace;
        }
    }

    class FALSE5<T1, T2, T3, T4, T5> implements Function5<T1, T2, T3, T4, T5, Boolean> {

        static final FALSE5<?, ?, ?, ?, ?> instance = new FALSE5<>();
        private static final Function5<?, ?, ?, ?, ?, Boolean> writeReplace = (t1,
                                                                               t2,
                                                                               t3,
                                                                               t4,
                                                                               t5) -> false;

        @Override
        public Boolean apply(T1 t1,
                             T2 t2,
                             T3 t3,
                             T4 t4,
                             T5 t5) {
            return false;
        }

        @Override
        public Function5<T1, T2, T3, T4, T5, Boolean> and(Function5<T1, T2, T3, T4, T5, Boolean> other) {
            return this;
        }

        @Override
        public Function5<T1, T2, T3, T4, T5, Boolean> or(Function5<T1, T2, T3, T4, T5, Boolean> other) {
            return other;
        }

        private Object writeReplace() throws ObjectStreamException {
            return writeReplace;
        }
    }

    class TRUE6<T1, T2, T3, T4, T5, T6> implements Function6<T1, T2, T3, T4, T5, T6, Boolean> {

        static final TRUE6<?, ?, ?, ?, ?, ?> instance = new TRUE6<>();
        private static final Function6<?, ?, ?, ?, ?, ?, Boolean> writeReplace = (t1,
                                                                                  t2,
                                                                                  t3,
                                                                                  t4,
                                                                                  t5,
                                                                                  t6) -> true;

        @Override
        public Boolean apply(T1 t1,
                             T2 t2,
                             T3 t3,
                             T4 t4,
                             T5 t5,
                             T6 t6) {
            return true;
        }

        @Override
        public Function6<T1, T2, T3, T4, T5, T6, Boolean> and(Function6<T1, T2, T3, T4, T5, T6, Boolean> other) {
            return other;
        }

        @Override
        public Function6<T1, T2, T3, T4, T5, T6, Boolean> or(Function6<T1, T2, T3, T4, T5, T6, Boolean> other) {
            return this;
        }

        private Object writeReplace() throws ObjectStreamException {
            return writeReplace;
        }
    }

    class FALSE6<T1, T2, T3, T4, T5, T6> implements Function6<T1, T2, T3, T4, T5, T6, Boolean> {

        static final FALSE6<?, ?, ?, ?, ?, ?> instance = new FALSE6<>();
        private static final Function6<?, ?, ?, ?, ?, ?, Boolean> writeReplace = (t1,
                                                                                  t2,
                                                                                  t3,
                                                                                  t4,
                                                                                  t5,
                                                                                  t6) -> false;

        @Override
        public Boolean apply(T1 t1,
                             T2 t2,
                             T3 t3,
                             T4 t4,
                             T5 t5,
                             T6 t6) {
            return false;
        }

        @Override
        public Function6<T1, T2, T3, T4, T5, T6, Boolean> and(Function6<T1, T2, T3, T4, T5, T6, Boolean> other) {
            return this;
        }

        @Override
        public Function6<T1, T2, T3, T4, T5, T6, Boolean> or(Function6<T1, T2, T3, T4, T5, T6, Boolean> other) {
            return other;
        }

        private Object writeReplace() throws ObjectStreamException {
            return writeReplace;
        }
    }
}
