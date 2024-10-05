package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.BooleanSupplier;
import j$.util.function.Supplier;
import java.util.Comparator;

/* loaded from: classes5.dex */
abstract class StreamSpliterators$AbstractWrappingSpliterator implements Spliterator {
    AbstractSpinedBuffer buffer;
    Sink bufferSink;
    boolean finished;
    final boolean isParallel;
    long nextToConsume;
    final PipelineHelper ph;
    BooleanSupplier pusher;
    Spliterator spliterator;
    private Supplier spliteratorSupplier;

    @Override // j$.util.Spliterator
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    abstract void initPartialTraversalState();

    abstract StreamSpliterators$AbstractWrappingSpliterator wrap(Spliterator spliterator);

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreamSpliterators$AbstractWrappingSpliterator(PipelineHelper pipelineHelper, Supplier supplier, boolean z) {
        this.ph = pipelineHelper;
        this.spliteratorSupplier = supplier;
        this.spliterator = null;
        this.isParallel = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreamSpliterators$AbstractWrappingSpliterator(PipelineHelper pipelineHelper, Spliterator spliterator, boolean z) {
        this.ph = pipelineHelper;
        this.spliteratorSupplier = null;
        this.spliterator = spliterator;
        this.isParallel = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void init() {
        if (this.spliterator == null) {
            this.spliterator = (Spliterator) this.spliteratorSupplier.get();
            this.spliteratorSupplier = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean doAdvance() {
        AbstractSpinedBuffer abstractSpinedBuffer = this.buffer;
        if (abstractSpinedBuffer == null) {
            if (this.finished) {
                return false;
            }
            init();
            initPartialTraversalState();
            this.nextToConsume = 0L;
            this.bufferSink.begin(this.spliterator.getExactSizeIfKnown());
            return fillBuffer();
        }
        long j = this.nextToConsume + 1;
        this.nextToConsume = j;
        boolean z = j < abstractSpinedBuffer.count();
        if (z) {
            return z;
        }
        this.nextToConsume = 0L;
        this.buffer.clear();
        return fillBuffer();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.isParallel || this.buffer != null || this.finished) {
            return null;
        }
        init();
        Spliterator trySplit = this.spliterator.trySplit();
        if (trySplit == null) {
            return null;
        }
        return wrap(trySplit);
    }

    private boolean fillBuffer() {
        while (this.buffer.count() == 0) {
            if (this.bufferSink.cancellationRequested() || !this.pusher.getAsBoolean()) {
                if (this.finished) {
                    return false;
                }
                this.bufferSink.end();
                this.finished = true;
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        init();
        return this.spliterator.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        init();
        if (StreamOpFlag.SIZED.isKnown(this.ph.getStreamAndOpFlags())) {
            return this.spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        init();
        int characteristics = StreamOpFlag.toCharacteristics(StreamOpFlag.toStreamFlags(this.ph.getStreamAndOpFlags()));
        return (characteristics & 64) != 0 ? (characteristics & (-16449)) | (this.spliterator.characteristics() & 16448) : characteristics;
    }

    @Override // j$.util.Spliterator
    public Comparator getComparator() {
        if (hasCharacteristics(4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.spliterator);
    }
}
