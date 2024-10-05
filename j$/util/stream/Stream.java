package j$.util.stream;

import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.function.ToLongFunction;
import j$.util.stream.Streams;
import java.util.Comparator;

/* loaded from: classes5.dex */
public interface Stream extends BaseStream {
    boolean allMatch(Predicate predicate);

    boolean anyMatch(Predicate predicate);

    Object collect(Collector collector);

    long count();

    Stream filter(Predicate predicate);

    Optional findFirst();

    Stream flatMap(Function function);

    void forEach(Consumer consumer);

    Stream limit(long j);

    Stream map(Function function);

    LongStream mapToLong(ToLongFunction toLongFunction);

    Optional max(Comparator comparator);

    boolean noneMatch(Predicate predicate);

    Stream sorted(Comparator comparator);

    Object[] toArray(IntFunction intFunction);

    /* renamed from: j$.util.stream.Stream$-CC, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        public static Stream of(Object obj) {
            return StreamSupport.stream(new Streams.StreamBuilderImpl(obj), false);
        }

        public static Stream of(Object... objArr) {
            return DesugarArrays.stream(objArr);
        }

        public static Stream concat(Stream stream, Stream stream2) {
            stream.getClass();
            stream2.getClass();
            return (Stream) StreamSupport.stream(new Streams.ConcatSpliterator.OfRef(stream.spliterator(), stream2.spliterator()), stream.isParallel() || stream2.isParallel()).onClose(Streams.composedClose(stream, stream2));
        }
    }
}
