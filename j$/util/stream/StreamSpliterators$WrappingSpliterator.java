package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.BooleanSupplier;
import j$.util.function.Consumer;
import j$.util.function.Supplier;
import j$.util.stream.Sink;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class StreamSpliterators$WrappingSpliterator extends StreamSpliterators$AbstractWrappingSpliterator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public StreamSpliterators$WrappingSpliterator(PipelineHelper pipelineHelper, Supplier supplier, boolean z) {
        super(pipelineHelper, supplier, z);
    }

    StreamSpliterators$WrappingSpliterator(PipelineHelper pipelineHelper, Spliterator spliterator, boolean z) {
        super(pipelineHelper, spliterator, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.StreamSpliterators$AbstractWrappingSpliterator
    public StreamSpliterators$WrappingSpliterator wrap(Spliterator spliterator) {
        return new StreamSpliterators$WrappingSpliterator(this.ph, spliterator, this.isParallel);
    }

    @Override // j$.util.stream.StreamSpliterators$AbstractWrappingSpliterator
    void initPartialTraversalState() {
        final SpinedBuffer spinedBuffer = new SpinedBuffer();
        this.buffer = spinedBuffer;
        this.bufferSink = this.ph.wrapSink(new Sink() { // from class: j$.util.stream.StreamSpliterators$WrappingSpliterator$$ExternalSyntheticLambda2
            @Override // j$.util.stream.Sink
            public /* synthetic */ void accept(int i) {
                Sink.CC.$default$accept((Sink) this, i);
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ void accept(long j) {
                Sink.CC.$default$accept(this, j);
            }

            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                SpinedBuffer.this.accept(obj);
            }

            @Override // j$.util.function.Consumer
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ void begin(long j) {
                Sink.CC.$default$begin(this, j);
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ boolean cancellationRequested() {
                return Sink.CC.$default$cancellationRequested(this);
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ void end() {
                Sink.CC.$default$end(this);
            }
        });
        this.pusher = new BooleanSupplier() { // from class: j$.util.stream.StreamSpliterators$WrappingSpliterator$$ExternalSyntheticLambda0
            @Override // j$.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return StreamSpliterators$WrappingSpliterator.this.m191xf58cc34f();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$initPartialTraversalState$0$java-util-stream-StreamSpliterators$WrappingSpliterator, reason: not valid java name */
    public /* synthetic */ boolean m191xf58cc34f() {
        return this.spliterator.tryAdvance(this.bufferSink);
    }

    @Override // j$.util.Spliterator
    public boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        boolean doAdvance = doAdvance();
        if (doAdvance) {
            consumer.accept(((SpinedBuffer) this.buffer).get(this.nextToConsume));
        }
        return doAdvance;
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(final Consumer consumer) {
        if (this.buffer == null && !this.finished) {
            consumer.getClass();
            init();
            this.ph.wrapAndCopyInto(new Sink() { // from class: j$.util.stream.StreamSpliterators$WrappingSpliterator$$ExternalSyntheticLambda1
                @Override // j$.util.stream.Sink
                public /* synthetic */ void accept(int i) {
                    Sink.CC.$default$accept((Sink) this, i);
                }

                @Override // j$.util.stream.Sink
                public /* synthetic */ void accept(long j) {
                    Sink.CC.$default$accept(this, j);
                }

                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    Consumer.this.accept(obj);
                }

                @Override // j$.util.function.Consumer
                public /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer.CC.$default$andThen(this, consumer2);
                }

                @Override // j$.util.stream.Sink
                public /* synthetic */ void begin(long j) {
                    Sink.CC.$default$begin(this, j);
                }

                @Override // j$.util.stream.Sink
                public /* synthetic */ boolean cancellationRequested() {
                    return Sink.CC.$default$cancellationRequested(this);
                }

                @Override // j$.util.stream.Sink
                public /* synthetic */ void end() {
                    Sink.CC.$default$end(this);
                }
            }, this.spliterator);
            this.finished = true;
            return;
        }
        do {
        } while (tryAdvance(consumer));
    }
}
