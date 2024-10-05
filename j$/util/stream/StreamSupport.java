package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntPipeline;
import j$.util.stream.ReferencePipeline;

/* loaded from: classes5.dex */
public abstract class StreamSupport {
    public static Stream stream(Spliterator spliterator, boolean z) {
        spliterator.getClass();
        return new ReferencePipeline.Head(spliterator, StreamOpFlag.fromCharacteristics(spliterator), z);
    }

    public static IntStream intStream(Spliterator.OfInt ofInt, boolean z) {
        return new IntPipeline.Head(ofInt, StreamOpFlag.fromCharacteristics(ofInt), z);
    }
}
