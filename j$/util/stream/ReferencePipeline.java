package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BinaryOperator;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.function.Supplier;
import j$.util.function.ToLongFunction;
import j$.util.stream.Collector;
import j$.util.stream.LongPipeline;
import j$.util.stream.MatchOps;
import j$.util.stream.Node;
import j$.util.stream.Sink;
import java.util.Comparator;

/* loaded from: classes5.dex */
abstract class ReferencePipeline extends AbstractPipeline implements Stream {
    ReferencePipeline(Spliterator spliterator, int i, boolean z) {
        super(spliterator, i, z);
    }

    ReferencePipeline(AbstractPipeline abstractPipeline, int i) {
        super(abstractPipeline, i);
    }

    @Override // j$.util.stream.AbstractPipeline
    final StreamShape getOutputShape() {
        return StreamShape.REFERENCE;
    }

    @Override // j$.util.stream.AbstractPipeline
    final Node evaluateToNode(PipelineHelper pipelineHelper, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return Nodes.collect(pipelineHelper, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.AbstractPipeline
    final Spliterator wrap(PipelineHelper pipelineHelper, Supplier supplier, boolean z) {
        return new StreamSpliterators$WrappingSpliterator(pipelineHelper, supplier, z);
    }

    @Override // j$.util.stream.AbstractPipeline
    final Spliterator lazySpliterator(Supplier supplier) {
        return new StreamSpliterators$DelegatingSpliterator(supplier);
    }

    @Override // j$.util.stream.AbstractPipeline
    final boolean forEachWithCancel(Spliterator spliterator, Sink sink) {
        boolean cancellationRequested;
        do {
            cancellationRequested = sink.cancellationRequested();
            if (cancellationRequested) {
                break;
            }
        } while (spliterator.tryAdvance(sink));
        return cancellationRequested;
    }

    @Override // j$.util.stream.AbstractPipeline, j$.util.stream.PipelineHelper
    final Node.Builder makeNodeBuilder(long j, IntFunction intFunction) {
        return Nodes.builder(j, intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(final Predicate predicate) {
        predicate.getClass();
        return new StatelessOp(this, this, StreamShape.REFERENCE, StreamOpFlag.NOT_SIZED) { // from class: j$.util.stream.ReferencePipeline.2
            @Override // j$.util.stream.AbstractPipeline
            Sink opWrapSink(int i, Sink sink) {
                return new Sink.ChainedReference(sink) { // from class: j$.util.stream.ReferencePipeline.2.1
                    @Override // j$.util.stream.Sink.ChainedReference, j$.util.stream.Sink
                    public void begin(long j) {
                        this.downstream.begin(-1L);
                    }

                    @Override // j$.util.function.Consumer
                    public void accept(Object obj) {
                        if (predicate.test(obj)) {
                            this.downstream.accept(obj);
                        }
                    }
                };
            }
        };
    }

    @Override // j$.util.stream.Stream
    public final Stream map(final Function function) {
        function.getClass();
        return new StatelessOp(this, this, StreamShape.REFERENCE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) { // from class: j$.util.stream.ReferencePipeline.3
            @Override // j$.util.stream.AbstractPipeline
            Sink opWrapSink(int i, Sink sink) {
                return new Sink.ChainedReference(sink) { // from class: j$.util.stream.ReferencePipeline.3.1
                    @Override // j$.util.function.Consumer
                    public void accept(Object obj) {
                        this.downstream.accept(function.apply(obj));
                    }
                };
            }
        };
    }

    @Override // j$.util.stream.Stream
    public final LongStream mapToLong(final ToLongFunction toLongFunction) {
        toLongFunction.getClass();
        return new LongPipeline.StatelessOp(this, this, StreamShape.REFERENCE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) { // from class: j$.util.stream.ReferencePipeline.5
            @Override // j$.util.stream.AbstractPipeline
            Sink opWrapSink(int i, Sink sink) {
                return new Sink.ChainedReference(sink) { // from class: j$.util.stream.ReferencePipeline.5.1
                    @Override // j$.util.function.Consumer
                    public void accept(Object obj) {
                        this.downstream.accept(toLongFunction.applyAsLong(obj));
                    }
                };
            }
        };
    }

    @Override // j$.util.stream.Stream
    public final Stream flatMap(final Function function) {
        function.getClass();
        return new StatelessOp(this, this, StreamShape.REFERENCE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT | StreamOpFlag.NOT_SIZED) { // from class: j$.util.stream.ReferencePipeline.7
            @Override // j$.util.stream.AbstractPipeline
            Sink opWrapSink(int i, Sink sink) {
                return new Sink.ChainedReference(sink) { // from class: j$.util.stream.ReferencePipeline.7.1
                    boolean cancellationRequestedCalled;

                    @Override // j$.util.stream.Sink.ChainedReference, j$.util.stream.Sink
                    public void begin(long j) {
                        this.downstream.begin(-1L);
                    }

                    @Override // j$.util.function.Consumer
                    public void accept(Object obj) {
                        Stream stream = (Stream) function.apply(obj);
                        if (stream != null) {
                            try {
                                if (!this.cancellationRequestedCalled) {
                                    ((Stream) stream.sequential()).forEach(this.downstream);
                                } else {
                                    Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                                    while (!this.downstream.cancellationRequested() && spliterator.tryAdvance(this.downstream)) {
                                    }
                                }
                            } finally {
                                try {
                                    stream.close();
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        if (stream != null) {
                        }
                    }

                    @Override // j$.util.stream.Sink.ChainedReference, j$.util.stream.Sink
                    public boolean cancellationRequested() {
                        this.cancellationRequestedCalled = true;
                        return this.downstream.cancellationRequested();
                    }
                };
            }
        };
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return SortedOps.makeRef(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return SliceOps.makeRef(this, 0L, j);
    }

    @Override // j$.util.stream.Stream
    public void forEach(Consumer consumer) {
        evaluate(ForEachOps.makeRef(consumer, false));
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return Nodes.flatten(evaluateToArrayNode(intFunction), intFunction).asArray(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) evaluate(MatchOps.makeRef(predicate, MatchOps.MatchKind.ANY))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) evaluate(MatchOps.makeRef(predicate, MatchOps.MatchKind.ALL))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) evaluate(MatchOps.makeRef(predicate, MatchOps.MatchKind.NONE))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) evaluate(FindOps.makeRef(true));
    }

    public final Optional reduce(BinaryOperator binaryOperator) {
        return (Optional) evaluate(ReduceOps.makeRef(binaryOperator));
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        final Object evaluate;
        if (isParallel() && collector.characteristics().contains(Collector.Characteristics.CONCURRENT) && (!isOrdered() || collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            evaluate = collector.supplier().get();
            final BiConsumer accumulator = collector.accumulator();
            forEach(new Consumer() { // from class: j$.util.stream.ReferencePipeline$$ExternalSyntheticLambda0
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    BiConsumer.this.accept(evaluate, obj);
                }

                @Override // j$.util.function.Consumer
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            });
        } else {
            evaluate = evaluate(ReduceOps.makeRef(collector));
        }
        return collector.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? evaluate : collector.finisher().apply(evaluate);
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        return reduce(BinaryOperator.CC.maxBy(comparator));
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) evaluate(ReduceOps.makeRefCounting())).longValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class Head extends ReferencePipeline {
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

        @Override // j$.util.stream.ReferencePipeline, j$.util.stream.Stream
        public void forEach(Consumer consumer) {
            if (!isParallel()) {
                sourceStageSpliterator().forEachRemaining(consumer);
            } else {
                super.forEach(consumer);
            }
        }
    }

    /* loaded from: classes5.dex */
    abstract class StatelessOp extends ReferencePipeline {
        @Override // j$.util.stream.AbstractPipeline
        final boolean opIsStateful() {
            return false;
        }

        StatelessOp(AbstractPipeline abstractPipeline, StreamShape streamShape, int i) {
            super(abstractPipeline, i);
        }
    }

    /* loaded from: classes5.dex */
    abstract class StatefulOp extends ReferencePipeline {
        @Override // j$.util.stream.AbstractPipeline
        final boolean opIsStateful() {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public StatefulOp(AbstractPipeline abstractPipeline, StreamShape streamShape, int i) {
            super(abstractPipeline, i);
        }
    }
}
