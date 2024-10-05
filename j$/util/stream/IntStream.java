package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.Spliterators;
import j$.util.function.IntPredicate;
import j$.util.stream.Streams;

/* loaded from: classes5.dex */
public interface IntStream extends BaseStream {
    IntStream filter(IntPredicate intPredicate);

    OptionalInt findFirst();

    /* renamed from: j$.util.stream.IntStream$-CC, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        public static IntStream empty() {
            return StreamSupport.intStream(Spliterators.emptyIntSpliterator(), false);
        }

        public static IntStream range(int i, int i2) {
            if (i >= i2) {
                return empty();
            }
            return StreamSupport.intStream(new Streams.RangeIntSpliterator(i, i2, false), false);
        }
    }
}
