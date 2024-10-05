package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes5.dex */
public interface BaseStream extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    BaseStream onClose(Runnable runnable);

    BaseStream sequential();

    Spliterator spliterator();
}
