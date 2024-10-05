package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.DoubleConsumer;
import j$.util.function.IntConsumer;
import j$.util.function.LongConsumer;
import j$.util.stream.StreamSpliterators$SliceSpliterator;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class StreamSpliterators$SliceSpliterator {
    long fence;
    long index;
    Spliterator s;
    final long sliceFence;
    final long sliceOrigin;

    protected abstract Spliterator makeSpliterator(Spliterator spliterator, long j, long j2, long j3, long j4);

    StreamSpliterators$SliceSpliterator(Spliterator spliterator, long j, long j2, long j3, long j4) {
        this.s = spliterator;
        this.sliceOrigin = j;
        this.sliceFence = j2;
        this.index = j3;
        this.fence = j4;
    }

    public Spliterator trySplit() {
        long j = this.sliceOrigin;
        long j2 = this.fence;
        if (j >= j2 || this.index >= j2) {
            return null;
        }
        while (true) {
            Spliterator trySplit = this.s.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = this.index + trySplit.estimateSize();
            long min = Math.min(estimateSize, this.sliceFence);
            long j3 = this.sliceOrigin;
            if (j3 >= min) {
                this.index = min;
            } else {
                long j4 = this.sliceFence;
                if (min >= j4) {
                    this.s = trySplit;
                    this.fence = min;
                } else {
                    long j5 = this.index;
                    if (j5 >= j3 && estimateSize <= j4) {
                        this.index = min;
                        return trySplit;
                    }
                    this.index = min;
                    return makeSpliterator(trySplit, j3, j4, j5, min);
                }
            }
        }
    }

    public long estimateSize() {
        long j = this.sliceOrigin;
        long j2 = this.fence;
        if (j < j2) {
            return j2 - Math.max(j, this.index);
        }
        return 0L;
    }

    public int characteristics() {
        return this.s.characteristics();
    }

    /* loaded from: classes5.dex */
    final class OfRef extends StreamSpliterators$SliceSpliterator implements Spliterator {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void lambda$forEachRemaining$1(Object obj) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void lambda$tryAdvance$0(Object obj) {
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

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfRef(Spliterator spliterator, long j, long j2) {
            this(spliterator, j, j2, 0L, Math.min(spliterator.estimateSize(), j2));
        }

        private OfRef(Spliterator spliterator, long j, long j2, long j3, long j4) {
            super(spliterator, j, j2, j3, j4);
        }

        @Override // j$.util.stream.StreamSpliterators$SliceSpliterator
        protected Spliterator makeSpliterator(Spliterator spliterator, long j, long j2, long j3, long j4) {
            return new OfRef(spliterator, j, j2, j3, j4);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            long j;
            consumer.getClass();
            if (this.sliceOrigin >= this.fence) {
                return false;
            }
            while (true) {
                long j2 = this.sliceOrigin;
                j = this.index;
                if (j2 <= j) {
                    break;
                }
                this.s.tryAdvance(new Consumer() { // from class: j$.util.stream.StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        StreamSpliterators$SliceSpliterator.OfRef.lambda$tryAdvance$0(obj);
                    }

                    @Override // j$.util.function.Consumer
                    public /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer.CC.$default$andThen(this, consumer2);
                    }
                });
                this.index++;
            }
            if (j >= this.fence) {
                return false;
            }
            this.index = j + 1;
            return this.s.tryAdvance(consumer);
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            consumer.getClass();
            long j = this.sliceOrigin;
            long j2 = this.fence;
            if (j >= j2) {
                return;
            }
            long j3 = this.index;
            if (j3 >= j2) {
                return;
            }
            if (j3 >= j && j3 + this.s.estimateSize() <= this.sliceFence) {
                this.s.forEachRemaining(consumer);
                this.index = this.fence;
                return;
            }
            while (this.sliceOrigin > this.index) {
                this.s.tryAdvance(new Consumer() { // from class: j$.util.stream.StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        StreamSpliterators$SliceSpliterator.OfRef.lambda$forEachRemaining$1(obj);
                    }

                    @Override // j$.util.function.Consumer
                    public /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer.CC.$default$andThen(this, consumer2);
                    }
                });
                this.index++;
            }
            while (this.index < this.fence) {
                this.s.tryAdvance(consumer);
                this.index++;
            }
        }
    }

    /* loaded from: classes5.dex */
    abstract class OfPrimitive extends StreamSpliterators$SliceSpliterator implements Spliterator.OfPrimitive {
        protected abstract Object emptyConsumer();

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

        OfPrimitive(Spliterator.OfPrimitive ofPrimitive, long j, long j2) {
            this(ofPrimitive, j, j2, 0L, Math.min(ofPrimitive.estimateSize(), j2));
        }

        private OfPrimitive(Spliterator.OfPrimitive ofPrimitive, long j, long j2, long j3, long j4) {
            super(ofPrimitive, j, j2, j3, j4);
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public boolean tryAdvance(Object obj) {
            long j;
            obj.getClass();
            if (this.sliceOrigin >= this.fence) {
                return false;
            }
            while (true) {
                long j2 = this.sliceOrigin;
                j = this.index;
                if (j2 <= j) {
                    break;
                }
                ((Spliterator.OfPrimitive) this.s).tryAdvance(emptyConsumer());
                this.index++;
            }
            if (j >= this.fence) {
                return false;
            }
            this.index = j + 1;
            return ((Spliterator.OfPrimitive) this.s).tryAdvance(obj);
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public void forEachRemaining(Object obj) {
            obj.getClass();
            long j = this.sliceOrigin;
            long j2 = this.fence;
            if (j >= j2) {
                return;
            }
            long j3 = this.index;
            if (j3 >= j2) {
                return;
            }
            if (j3 >= j && j3 + ((Spliterator.OfPrimitive) this.s).estimateSize() <= this.sliceFence) {
                ((Spliterator.OfPrimitive) this.s).forEachRemaining(obj);
                this.index = this.fence;
                return;
            }
            while (this.sliceOrigin > this.index) {
                ((Spliterator.OfPrimitive) this.s).tryAdvance(emptyConsumer());
                this.index++;
            }
            while (this.index < this.fence) {
                ((Spliterator.OfPrimitive) this.s).tryAdvance(obj);
                this.index++;
            }
        }
    }

    /* loaded from: classes5.dex */
    final class OfInt extends OfPrimitive implements Spliterator.OfInt {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void lambda$emptyConsumer$0(int i) {
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.OfInt.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return Spliterator.OfInt.CC.$default$tryAdvance(this, consumer);
        }

        @Override // j$.util.Spliterator.OfInt
        public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
            super.forEachRemaining((Object) intConsumer);
        }

        @Override // j$.util.Spliterator.OfInt
        public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
            return super.tryAdvance((Object) intConsumer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfInt(Spliterator.OfInt ofInt, long j, long j2) {
            super(ofInt, j, j2);
        }

        OfInt(Spliterator.OfInt ofInt, long j, long j2, long j3, long j4) {
            super(ofInt, j, j2, j3, j4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.StreamSpliterators$SliceSpliterator
        public Spliterator.OfInt makeSpliterator(Spliterator.OfInt ofInt, long j, long j2, long j3, long j4) {
            return new OfInt(ofInt, j, j2, j3, j4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.StreamSpliterators$SliceSpliterator.OfPrimitive
        public IntConsumer emptyConsumer() {
            return new IntConsumer() { // from class: j$.util.stream.StreamSpliterators$SliceSpliterator$OfInt$$ExternalSyntheticLambda0
                @Override // j$.util.function.IntConsumer
                public final void accept(int i) {
                    StreamSpliterators$SliceSpliterator.OfInt.lambda$emptyConsumer$0(i);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return IntConsumer.CC.$default$andThen(this, intConsumer);
                }
            };
        }
    }

    /* loaded from: classes5.dex */
    final class OfLong extends OfPrimitive implements Spliterator.OfLong {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void lambda$emptyConsumer$0(long j) {
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.OfLong.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return Spliterator.OfLong.CC.$default$tryAdvance(this, consumer);
        }

        @Override // j$.util.Spliterator.OfLong
        public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
            super.forEachRemaining((Object) longConsumer);
        }

        @Override // j$.util.Spliterator.OfLong
        public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
            return super.tryAdvance((Object) longConsumer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfLong(Spliterator.OfLong ofLong, long j, long j2) {
            super(ofLong, j, j2);
        }

        OfLong(Spliterator.OfLong ofLong, long j, long j2, long j3, long j4) {
            super(ofLong, j, j2, j3, j4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.StreamSpliterators$SliceSpliterator
        public Spliterator.OfLong makeSpliterator(Spliterator.OfLong ofLong, long j, long j2, long j3, long j4) {
            return new OfLong(ofLong, j, j2, j3, j4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.StreamSpliterators$SliceSpliterator.OfPrimitive
        public LongConsumer emptyConsumer() {
            return new LongConsumer() { // from class: j$.util.stream.StreamSpliterators$SliceSpliterator$OfLong$$ExternalSyntheticLambda0
                @Override // j$.util.function.LongConsumer
                public final void accept(long j) {
                    StreamSpliterators$SliceSpliterator.OfLong.lambda$emptyConsumer$0(j);
                }

                @Override // j$.util.function.LongConsumer
                public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
                    return LongConsumer.CC.$default$andThen(this, longConsumer);
                }
            };
        }
    }

    /* loaded from: classes5.dex */
    final class OfDouble extends OfPrimitive implements Spliterator.OfDouble {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void lambda$emptyConsumer$0(double d) {
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.OfDouble.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return Spliterator.OfDouble.CC.$default$tryAdvance(this, consumer);
        }

        @Override // j$.util.Spliterator.OfDouble
        public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
            super.forEachRemaining((Object) doubleConsumer);
        }

        @Override // j$.util.Spliterator.OfDouble
        public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
            return super.tryAdvance((Object) doubleConsumer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfDouble(Spliterator.OfDouble ofDouble, long j, long j2) {
            super(ofDouble, j, j2);
        }

        OfDouble(Spliterator.OfDouble ofDouble, long j, long j2, long j3, long j4) {
            super(ofDouble, j, j2, j3, j4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.StreamSpliterators$SliceSpliterator
        public Spliterator.OfDouble makeSpliterator(Spliterator.OfDouble ofDouble, long j, long j2, long j3, long j4) {
            return new OfDouble(ofDouble, j, j2, j3, j4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.StreamSpliterators$SliceSpliterator.OfPrimitive
        public DoubleConsumer emptyConsumer() {
            return new DoubleConsumer() { // from class: j$.util.stream.StreamSpliterators$SliceSpliterator$OfDouble$$ExternalSyntheticLambda0
                @Override // j$.util.function.DoubleConsumer
                public final void accept(double d) {
                    StreamSpliterators$SliceSpliterator.OfDouble.lambda$emptyConsumer$0(d);
                }
            };
        }
    }
}
