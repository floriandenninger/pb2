package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntConsumer;
import j$.util.function.LongConsumer;
import j$.util.function.Supplier;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class StreamSpliterators$DelegatingSpliterator implements Spliterator {
    private Spliterator s;
    private final Supplier supplier;

    @Override // j$.util.Spliterator
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreamSpliterators$DelegatingSpliterator(Supplier supplier) {
        this.supplier = supplier;
    }

    Spliterator get() {
        if (this.s == null) {
            this.s = (Spliterator) this.supplier.get();
        }
        return this.s;
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        return get().trySplit();
    }

    @Override // j$.util.Spliterator
    public boolean tryAdvance(Consumer consumer) {
        return get().tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        get().forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public long estimateSize() {
        return get().estimateSize();
    }

    @Override // j$.util.Spliterator
    public int characteristics() {
        return get().characteristics();
    }

    @Override // j$.util.Spliterator
    public Comparator getComparator() {
        return get().getComparator();
    }

    @Override // j$.util.Spliterator
    public long getExactSizeIfKnown() {
        return get().getExactSizeIfKnown();
    }

    public String toString() {
        String name = getClass().getName();
        String valueOf = String.valueOf(get());
        StringBuilder sb = new StringBuilder(name.length() + 2 + valueOf.length());
        sb.append(name);
        sb.append("[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    /* loaded from: classes5.dex */
    abstract class OfPrimitive extends StreamSpliterators$DelegatingSpliterator implements Spliterator.OfPrimitive {
        OfPrimitive(Supplier supplier) {
            super(supplier);
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public boolean tryAdvance(Object obj) {
            return ((Spliterator.OfPrimitive) get()).tryAdvance(obj);
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public void forEachRemaining(Object obj) {
            ((Spliterator.OfPrimitive) get()).forEachRemaining(obj);
        }
    }

    /* loaded from: classes5.dex */
    final class OfInt extends OfPrimitive implements Spliterator.OfInt {
        @Override // j$.util.Spliterator.OfInt
        public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
            super.forEachRemaining((Object) intConsumer);
        }

        @Override // j$.util.Spliterator.OfInt
        public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
            return super.tryAdvance((Object) intConsumer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfInt(Supplier supplier) {
            super(supplier);
        }
    }

    /* loaded from: classes5.dex */
    final class OfLong extends OfPrimitive implements Spliterator.OfLong {
        @Override // j$.util.Spliterator.OfLong
        public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
            super.forEachRemaining((Object) longConsumer);
        }

        @Override // j$.util.Spliterator.OfLong
        public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
            return super.tryAdvance((Object) longConsumer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfLong(Supplier supplier) {
            super(supplier);
        }
    }
}
