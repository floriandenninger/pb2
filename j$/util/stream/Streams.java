package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntConsumer;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class Streams {

    /* loaded from: classes5.dex */
    final class RangeIntSpliterator implements Spliterator.OfInt {
        private int from;
        private int last;
        private final int upTo;

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 17749;
        }

        @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.OfInt.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // j$.util.Spliterator
        public Comparator getComparator() {
            return null;
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return Spliterator.OfInt.CC.$default$tryAdvance(this, consumer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public RangeIntSpliterator(int i, int i2, boolean z) {
            this(i, i2, z ? 1 : 0);
        }

        private RangeIntSpliterator(int i, int i2, int i3) {
            this.from = i;
            this.upTo = i2;
            this.last = i3;
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public boolean tryAdvance(IntConsumer intConsumer) {
            intConsumer.getClass();
            int i = this.from;
            if (i < this.upTo) {
                this.from = i + 1;
                intConsumer.accept(i);
                return true;
            }
            if (this.last <= 0) {
                return false;
            }
            this.last = 0;
            intConsumer.accept(i);
            return true;
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public void forEachRemaining(IntConsumer intConsumer) {
            intConsumer.getClass();
            int i = this.from;
            int i2 = this.upTo;
            int i3 = this.last;
            this.from = i2;
            this.last = 0;
            while (i < i2) {
                intConsumer.accept(i);
                i++;
            }
            if (i3 > 0) {
                intConsumer.accept(i);
            }
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return (this.upTo - this.from) + this.last;
        }

        @Override // j$.util.Spliterator
        public Spliterator.OfInt trySplit() {
            long estimateSize = estimateSize();
            if (estimateSize <= 1) {
                return null;
            }
            int i = this.from;
            int splitPoint = splitPoint(estimateSize) + i;
            this.from = splitPoint;
            return new RangeIntSpliterator(i, splitPoint, 0);
        }

        private int splitPoint(long j) {
            return (int) (j / (j < 16777216 ? 2 : 8));
        }
    }

    /* loaded from: classes5.dex */
    abstract class AbstractStreamBuilderImpl implements Spliterator {
        int count;

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 17488;
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            return null;
        }

        private AbstractStreamBuilderImpl() {
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return (-this.count) - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class StreamBuilderImpl extends AbstractStreamBuilderImpl implements Consumer {
        SpinedBuffer buffer;
        Object first;

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer.CC.$default$andThen(this, consumer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public StreamBuilderImpl(Object obj) {
            super();
            this.first = obj;
            this.count = -2;
        }

        @Override // j$.util.function.Consumer
        public void accept(Object obj) {
            int i = this.count;
            if (i == 0) {
                this.first = obj;
                this.count = i + 1;
            } else {
                if (i > 0) {
                    if (this.buffer == null) {
                        SpinedBuffer spinedBuffer = new SpinedBuffer();
                        this.buffer = spinedBuffer;
                        spinedBuffer.accept(this.first);
                        this.count++;
                    }
                    this.buffer.accept(obj);
                    return;
                }
                throw new IllegalStateException();
            }
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            consumer.getClass();
            if (this.count != -2) {
                return false;
            }
            consumer.accept(this.first);
            this.count = -1;
            return true;
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            consumer.getClass();
            if (this.count == -2) {
                consumer.accept(this.first);
                this.count = -1;
            }
        }
    }

    /* loaded from: classes5.dex */
    abstract class ConcatSpliterator implements Spliterator {
        protected final Spliterator aSpliterator;
        protected final Spliterator bSpliterator;
        boolean beforeSplit = true;
        final boolean unsized;

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        public ConcatSpliterator(Spliterator spliterator, Spliterator spliterator2) {
            this.aSpliterator = spliterator;
            this.bSpliterator = spliterator2;
            this.unsized = spliterator.estimateSize() + spliterator2.estimateSize() < 0;
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            Spliterator trySplit = this.beforeSplit ? this.aSpliterator : this.bSpliterator.trySplit();
            this.beforeSplit = false;
            return trySplit;
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            if (this.beforeSplit) {
                boolean tryAdvance = this.aSpliterator.tryAdvance(consumer);
                if (tryAdvance) {
                    return tryAdvance;
                }
                this.beforeSplit = false;
                return this.bSpliterator.tryAdvance(consumer);
            }
            return this.bSpliterator.tryAdvance(consumer);
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            if (this.beforeSplit) {
                this.aSpliterator.forEachRemaining(consumer);
            }
            this.bSpliterator.forEachRemaining(consumer);
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            if (this.beforeSplit) {
                long estimateSize = this.aSpliterator.estimateSize() + this.bSpliterator.estimateSize();
                if (estimateSize >= 0) {
                    return estimateSize;
                }
                return Long.MAX_VALUE;
            }
            return this.bSpliterator.estimateSize();
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            if (this.beforeSplit) {
                return this.aSpliterator.characteristics() & this.bSpliterator.characteristics() & (((this.unsized ? 16448 : 0) | 5) ^ (-1));
            }
            return this.bSpliterator.characteristics();
        }

        @Override // j$.util.Spliterator
        public Comparator getComparator() {
            if (this.beforeSplit) {
                throw new IllegalStateException();
            }
            return this.bSpliterator.getComparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public class OfRef extends ConcatSpliterator {
            /* JADX INFO: Access modifiers changed from: package-private */
            public OfRef(Spliterator spliterator, Spliterator spliterator2) {
                super(spliterator, spliterator2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable composeWithExceptions(final Runnable runnable, final Runnable runnable2) {
        return new Runnable() { // from class: j$.util.stream.Streams.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                    runnable2.run();
                } catch (Throwable th) {
                    try {
                        runnable2.run();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable composedClose(final BaseStream baseStream, final BaseStream baseStream2) {
        return new Runnable() { // from class: j$.util.stream.Streams.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    BaseStream.this.close();
                    baseStream2.close();
                } catch (Throwable th) {
                    try {
                        baseStream2.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        };
    }
}
