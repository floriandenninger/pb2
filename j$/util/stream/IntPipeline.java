package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.Spliterator;
import j$.util.function.IntConsumer;
import j$.util.function.IntFunction;
import j$.util.function.IntPredicate;
import j$.util.function.Supplier;
import j$.util.stream.Node;
import j$.util.stream.Sink;
import j$.util.stream.StreamSpliterators$DelegatingSpliterator;

/* loaded from: classes5.dex */
abstract class IntPipeline extends AbstractPipeline implements IntStream {
    IntPipeline(Spliterator spliterator, int i, boolean z) {
        super(spliterator, i, z);
    }

    IntPipeline(AbstractPipeline abstractPipeline, int i) {
        super(abstractPipeline, i);
    }

    private static IntConsumer adapt(final Sink sink) {
        if (sink instanceof IntConsumer) {
            return (IntConsumer) sink;
        }
        if (Tripwire.ENABLED) {
            Tripwire.trip(AbstractPipeline.class, "using IntStream.adapt(Sink<Integer> s)");
        }
        sink.getClass();
        return new IntConsumer() { // from class: j$.util.stream.IntPipeline$$ExternalSyntheticLambda6
            @Override // j$.util.function.IntConsumer
            public final void accept(int i) {
                Sink.this.accept(i);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer.CC.$default$andThen(this, intConsumer);
            }
        };
    }

    private static Spliterator.OfInt adapt(Spliterator spliterator) {
        if (spliterator instanceof Spliterator.OfInt) {
            return (Spliterator.OfInt) spliterator;
        }
        if (Tripwire.ENABLED) {
            Tripwire.trip(AbstractPipeline.class, "using IntStream.adapt(Spliterator<Integer> s)");
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // j$.util.stream.AbstractPipeline
    final StreamShape getOutputShape() {
        return StreamShape.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractPipeline
    final Node evaluateToNode(PipelineHelper pipelineHelper, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return Nodes.collectInt(pipelineHelper, spliterator, z);
    }

    @Override // j$.util.stream.AbstractPipeline
    final Spliterator wrap(PipelineHelper pipelineHelper, Supplier supplier, boolean z) {
        return new StreamSpliterators$IntWrappingSpliterator(pipelineHelper, supplier, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractPipeline
    public final Spliterator.OfInt lazySpliterator(Supplier supplier) {
        return new StreamSpliterators$DelegatingSpliterator.OfInt(supplier);
    }

    @Override // j$.util.stream.AbstractPipeline
    final boolean forEachWithCancel(Spliterator spliterator, Sink sink) {
        boolean cancellationRequested;
        Spliterator.OfInt adapt = adapt(spliterator);
        IntConsumer adapt2 = adapt(sink);
        do {
            cancellationRequested = sink.cancellationRequested();
            if (cancellationRequested) {
                break;
            }
        } while (adapt.tryAdvance(adapt2));
        return cancellationRequested;
    }

    @Override // j$.util.stream.AbstractPipeline, j$.util.stream.PipelineHelper
    final Node.Builder makeNodeBuilder(long j, IntFunction intFunction) {
        return Nodes.intBuilder(j);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream filter(final IntPredicate intPredicate) {
        intPredicate.getClass();
        return new StatelessOp(this, this, StreamShape.INT_VALUE, StreamOpFlag.NOT_SIZED) { // from class: j$.util.stream.IntPipeline.9
            @Override // j$.util.stream.AbstractPipeline
            Sink opWrapSink(int i, Sink sink) {
                return new Sink.ChainedInt(sink) { // from class: j$.util.stream.IntPipeline.9.1
                    @Override // j$.util.stream.Sink
                    public void begin(long j) {
                        this.downstream.begin(-1L);
                    }

                    @Override // j$.util.stream.Sink.OfInt, j$.util.stream.Sink
                    public void accept(int i2) {
                        if (intPredicate.test(i2)) {
                            this.downstream.accept(i2);
                        }
                    }
                };
            }
        };
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt findFirst() {
        return (OptionalInt) evaluate(FindOps.makeInt(true));
    }

    /* loaded from: classes5.dex */
    class Head extends IntPipeline {
        /* JADX INFO: Access modifiers changed from: package-private */
        public Head(Spliterator spliterator, int i, boolean z) {
            super(spliterator, i, z);
        }

        @Override // j$.util.stream.AbstractPipeline
        final boolean opIsStateful() {
            throw new UnsupportedOperationException();
        }

        @Override // j$.util.stream.AbstractPipeline
        final Sink opWrapSink(int i, Sink sink) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes5.dex */
    abstract class StatelessOp extends IntPipeline {
        @Override // j$.util.stream.AbstractPipeline
        final boolean opIsStateful() {
            return false;
        }

        StatelessOp(AbstractPipeline abstractPipeline, StreamShape streamShape, int i) {
            super(abstractPipeline, i);
        }
    }
}
