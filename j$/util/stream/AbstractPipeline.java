package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import j$.util.function.Supplier;
import j$.util.stream.Node;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class AbstractPipeline extends PipelineHelper implements BaseStream {
    private int combinedFlags;
    private int depth;
    private boolean linkedOrConsumed;
    private AbstractPipeline nextStage;
    private boolean parallel;
    private final AbstractPipeline previousStage;
    private boolean sourceAnyStateful;
    private Runnable sourceCloseAction;
    protected final int sourceOrOpFlags;
    private Spliterator sourceSpliterator;
    private final AbstractPipeline sourceStage;
    private Supplier sourceSupplier;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Spliterator lambda$wrapSpliterator$1(Spliterator spliterator) {
        return spliterator;
    }

    abstract Node evaluateToNode(PipelineHelper pipelineHelper, Spliterator spliterator, boolean z, IntFunction intFunction);

    abstract boolean forEachWithCancel(Spliterator spliterator, Sink sink);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract StreamShape getOutputShape();

    abstract Spliterator lazySpliterator(Supplier supplier);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.PipelineHelper
    public abstract Node.Builder makeNodeBuilder(long j, IntFunction intFunction);

    abstract boolean opIsStateful();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Sink opWrapSink(int i, Sink sink);

    abstract Spliterator wrap(PipelineHelper pipelineHelper, Supplier supplier, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractPipeline(Spliterator spliterator, int i, boolean z) {
        this.previousStage = null;
        this.sourceSpliterator = spliterator;
        this.sourceStage = this;
        int i2 = StreamOpFlag.STREAM_MASK & i;
        this.sourceOrOpFlags = i2;
        this.combinedFlags = ((i2 << 1) ^ (-1)) & StreamOpFlag.INITIAL_OPS_VALUE;
        this.depth = 0;
        this.parallel = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractPipeline(AbstractPipeline abstractPipeline, int i) {
        if (abstractPipeline.linkedOrConsumed) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractPipeline.linkedOrConsumed = true;
        abstractPipeline.nextStage = this;
        this.previousStage = abstractPipeline;
        this.sourceOrOpFlags = StreamOpFlag.OP_MASK & i;
        this.combinedFlags = StreamOpFlag.combineOpFlags(i, abstractPipeline.combinedFlags);
        AbstractPipeline abstractPipeline2 = abstractPipeline.sourceStage;
        this.sourceStage = abstractPipeline2;
        if (opIsStateful()) {
            abstractPipeline2.sourceAnyStateful = true;
        }
        this.depth = abstractPipeline.depth + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object evaluate(TerminalOp terminalOp) {
        if (this.linkedOrConsumed) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.linkedOrConsumed = true;
        if (isParallel()) {
            return terminalOp.evaluateParallel(this, sourceSpliterator(terminalOp.getOpFlags()));
        }
        return terminalOp.evaluateSequential(this, sourceSpliterator(terminalOp.getOpFlags()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Node evaluateToArrayNode(IntFunction intFunction) {
        if (this.linkedOrConsumed) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.linkedOrConsumed = true;
        if (isParallel() && this.previousStage != null && opIsStateful()) {
            this.depth = 0;
            AbstractPipeline abstractPipeline = this.previousStage;
            return opEvaluateParallel(abstractPipeline, abstractPipeline.sourceSpliterator(0), intFunction);
        }
        return evaluate(sourceSpliterator(0), true, intFunction);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator sourceStageSpliterator() {
        AbstractPipeline abstractPipeline = this.sourceStage;
        if (this != abstractPipeline) {
            throw new IllegalStateException();
        }
        if (this.linkedOrConsumed) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.linkedOrConsumed = true;
        Spliterator spliterator = abstractPipeline.sourceSpliterator;
        if (spliterator != null) {
            abstractPipeline.sourceSpliterator = null;
            return spliterator;
        }
        Supplier supplier = abstractPipeline.sourceSupplier;
        if (supplier != null) {
            Spliterator spliterator2 = (Spliterator) supplier.get();
            this.sourceStage.sourceSupplier = null;
            return spliterator2;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream sequential() {
        this.sourceStage.parallel = false;
        return this;
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public void close() {
        this.linkedOrConsumed = true;
        this.sourceSupplier = null;
        this.sourceSpliterator = null;
        AbstractPipeline abstractPipeline = this.sourceStage;
        Runnable runnable = abstractPipeline.sourceCloseAction;
        if (runnable != null) {
            abstractPipeline.sourceCloseAction = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.BaseStream
    public BaseStream onClose(Runnable runnable) {
        if (this.linkedOrConsumed) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        runnable.getClass();
        AbstractPipeline abstractPipeline = this.sourceStage;
        Runnable runnable2 = abstractPipeline.sourceCloseAction;
        if (runnable2 != null) {
            runnable = Streams.composeWithExceptions(runnable2, runnable);
        }
        abstractPipeline.sourceCloseAction = runnable;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public Spliterator spliterator() {
        if (this.linkedOrConsumed) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.linkedOrConsumed = true;
        AbstractPipeline abstractPipeline = this.sourceStage;
        if (this == abstractPipeline) {
            Spliterator spliterator = abstractPipeline.sourceSpliterator;
            if (spliterator != null) {
                abstractPipeline.sourceSpliterator = null;
                return spliterator;
            }
            Supplier supplier = abstractPipeline.sourceSupplier;
            if (supplier != null) {
                abstractPipeline.sourceSupplier = null;
                return lazySpliterator(supplier);
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return wrap(this, new Supplier() { // from class: j$.util.stream.AbstractPipeline$$ExternalSyntheticLambda2
            @Override // j$.util.function.Supplier
            public final Object get() {
                return AbstractPipeline.this.m172lambda$spliterator$0$javautilstreamAbstractPipeline();
            }
        }, isParallel());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$spliterator$0$java-util-stream-AbstractPipeline, reason: not valid java name */
    public /* synthetic */ Spliterator m172lambda$spliterator$0$javautilstreamAbstractPipeline() {
        return sourceSpliterator(0);
    }

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.sourceStage.parallel;
    }

    private Spliterator sourceSpliterator(int i) {
        int i2;
        int i3;
        AbstractPipeline abstractPipeline = this.sourceStage;
        Spliterator spliterator = abstractPipeline.sourceSpliterator;
        if (spliterator != null) {
            abstractPipeline.sourceSpliterator = null;
        } else {
            Supplier supplier = abstractPipeline.sourceSupplier;
            if (supplier != null) {
                spliterator = (Spliterator) supplier.get();
                this.sourceStage.sourceSupplier = null;
            } else {
                throw new IllegalStateException("source already consumed or closed");
            }
        }
        if (isParallel()) {
            AbstractPipeline abstractPipeline2 = this.sourceStage;
            if (abstractPipeline2.sourceAnyStateful) {
                AbstractPipeline abstractPipeline3 = abstractPipeline2.nextStage;
                int i4 = 1;
                while (abstractPipeline2 != this) {
                    int i5 = abstractPipeline3.sourceOrOpFlags;
                    if (abstractPipeline3.opIsStateful()) {
                        i4 = 0;
                        if (StreamOpFlag.SHORT_CIRCUIT.isKnown(i5)) {
                            i5 &= StreamOpFlag.IS_SHORT_CIRCUIT ^ (-1);
                        }
                        spliterator = abstractPipeline3.opEvaluateParallelLazy(abstractPipeline2, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i2 = i5 & (StreamOpFlag.NOT_SIZED ^ (-1));
                            i3 = StreamOpFlag.IS_SIZED;
                        } else {
                            i2 = i5 & (StreamOpFlag.IS_SIZED ^ (-1));
                            i3 = StreamOpFlag.NOT_SIZED;
                        }
                        i5 = i2 | i3;
                    }
                    abstractPipeline3.depth = i4;
                    abstractPipeline3.combinedFlags = StreamOpFlag.combineOpFlags(i5, abstractPipeline2.combinedFlags);
                    i4++;
                    AbstractPipeline abstractPipeline4 = abstractPipeline3;
                    abstractPipeline3 = abstractPipeline3.nextStage;
                    abstractPipeline2 = abstractPipeline4;
                }
            }
        }
        if (i != 0) {
            this.combinedFlags = StreamOpFlag.combineOpFlags(i, this.combinedFlags);
        }
        return spliterator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.PipelineHelper
    public final StreamShape getSourceShape() {
        AbstractPipeline abstractPipeline = this;
        while (abstractPipeline.depth > 0) {
            abstractPipeline = abstractPipeline.previousStage;
        }
        return abstractPipeline.getOutputShape();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.PipelineHelper
    public final long exactOutputSizeIfKnown(Spliterator spliterator) {
        if (StreamOpFlag.SIZED.isKnown(getStreamAndOpFlags())) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.PipelineHelper
    public final Sink wrapAndCopyInto(Sink sink, Spliterator spliterator) {
        sink.getClass();
        copyInto(wrapSink(sink), spliterator);
        return sink;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.PipelineHelper
    public final void copyInto(Sink sink, Spliterator spliterator) {
        sink.getClass();
        if (!StreamOpFlag.SHORT_CIRCUIT.isKnown(getStreamAndOpFlags())) {
            sink.begin(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(sink);
            sink.end();
            return;
        }
        copyIntoWithCancel(sink, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.PipelineHelper
    public final boolean copyIntoWithCancel(Sink sink, Spliterator spliterator) {
        AbstractPipeline abstractPipeline = this;
        while (abstractPipeline.depth > 0) {
            abstractPipeline = abstractPipeline.previousStage;
        }
        sink.begin(spliterator.getExactSizeIfKnown());
        boolean forEachWithCancel = abstractPipeline.forEachWithCancel(spliterator, sink);
        sink.end();
        return forEachWithCancel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.PipelineHelper
    public final int getStreamAndOpFlags() {
        return this.combinedFlags;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean isOrdered() {
        return StreamOpFlag.ORDERED.isKnown(this.combinedFlags);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.PipelineHelper
    public final Sink wrapSink(Sink sink) {
        sink.getClass();
        for (AbstractPipeline abstractPipeline = this; abstractPipeline.depth > 0; abstractPipeline = abstractPipeline.previousStage) {
            sink = abstractPipeline.opWrapSink(abstractPipeline.previousStage.combinedFlags, sink);
        }
        return sink;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.PipelineHelper
    public final Spliterator wrapSpliterator(final Spliterator spliterator) {
        return this.depth == 0 ? spliterator : wrap(this, new Supplier() { // from class: j$.util.stream.AbstractPipeline$$ExternalSyntheticLambda1
            @Override // j$.util.function.Supplier
            public final Object get() {
                return AbstractPipeline.lambda$wrapSpliterator$1(Spliterator.this);
            }
        }, isParallel());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.PipelineHelper
    public final Node evaluate(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (isParallel()) {
            return evaluateToNode(this, spliterator, z, intFunction);
        }
        return ((Node.Builder) wrapAndCopyInto(makeNodeBuilder(exactOutputSizeIfKnown(spliterator), intFunction), spliterator)).build();
    }

    Node opEvaluateParallel(PipelineHelper pipelineHelper, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object[] lambda$opEvaluateParallelLazy$2(int i) {
        return new Object[i];
    }

    Spliterator opEvaluateParallelLazy(PipelineHelper pipelineHelper, Spliterator spliterator) {
        return opEvaluateParallel(pipelineHelper, spliterator, new IntFunction() { // from class: j$.util.stream.AbstractPipeline$$ExternalSyntheticLambda0
            @Override // j$.util.function.IntFunction
            public final Object apply(int i) {
                return AbstractPipeline.lambda$opEvaluateParallelLazy$2(i);
            }
        }).spliterator();
    }
}
