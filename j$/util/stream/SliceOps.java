package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import j$.util.stream.Node;
import j$.util.stream.ReferencePipeline;
import j$.util.stream.Sink;
import j$.util.stream.StreamSpliterators$SliceSpliterator;
import j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes5.dex */
abstract class SliceOps {
    /* JADX INFO: Access modifiers changed from: private */
    public static long calcSliceFence(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long calcSize(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.util.stream.SliceOps$5, reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$java$util$stream$StreamShape;

        static {
            int[] iArr = new int[StreamShape.values().length];
            $SwitchMap$java$util$stream$StreamShape = iArr;
            try {
                iArr[StreamShape.REFERENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$util$stream$StreamShape[StreamShape.INT_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$util$stream$StreamShape[StreamShape.LONG_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$util$stream$StreamShape[StreamShape.DOUBLE_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Spliterator sliceSpliterator(StreamShape streamShape, Spliterator spliterator, long j, long j2) {
        long calcSliceFence = calcSliceFence(j, j2);
        int i = AnonymousClass5.$SwitchMap$java$util$stream$StreamShape[streamShape.ordinal()];
        if (i == 1) {
            return new StreamSpliterators$SliceSpliterator.OfRef(spliterator, j, calcSliceFence);
        }
        if (i == 2) {
            return new StreamSpliterators$SliceSpliterator.OfInt((Spliterator.OfInt) spliterator, j, calcSliceFence);
        }
        if (i == 3) {
            return new StreamSpliterators$SliceSpliterator.OfLong((Spliterator.OfLong) spliterator, j, calcSliceFence);
        }
        if (i == 4) {
            return new StreamSpliterators$SliceSpliterator.OfDouble((Spliterator.OfDouble) spliterator, j, calcSliceFence);
        }
        String valueOf = String.valueOf(streamShape);
        StringBuilder sb = new StringBuilder(valueOf.length() + 14);
        sb.append("Unknown shape ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    public static Stream makeRef(AbstractPipeline abstractPipeline, final long j, final long j2) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("Skip must be non-negative: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        return new ReferencePipeline.StatefulOp(abstractPipeline, StreamShape.REFERENCE, flags(j2)) { // from class: j$.util.stream.SliceOps.1
            Spliterator unorderedSkipLimitSpliterator(Spliterator spliterator, long j3, long j4, long j5) {
                long j6;
                long j7;
                if (j3 <= j5) {
                    long j8 = j5 - j3;
                    j7 = j4 >= 0 ? Math.min(j4, j8) : j8;
                    j6 = 0;
                } else {
                    j6 = j3;
                    j7 = j4;
                }
                return new StreamSpliterators$UnorderedSliceSpliterator.OfRef(spliterator, j6, j7);
            }

            @Override // j$.util.stream.AbstractPipeline
            Spliterator opEvaluateParallelLazy(PipelineHelper pipelineHelper, Spliterator spliterator) {
                long exactOutputSizeIfKnown = pipelineHelper.exactOutputSizeIfKnown(spliterator);
                if (exactOutputSizeIfKnown > 0 && spliterator.hasCharacteristics(16384)) {
                    Spliterator wrapSpliterator = pipelineHelper.wrapSpliterator(spliterator);
                    long j3 = j;
                    return new StreamSpliterators$SliceSpliterator.OfRef(wrapSpliterator, j3, SliceOps.calcSliceFence(j3, j2));
                }
                if (!StreamOpFlag.ORDERED.isKnown(pipelineHelper.getStreamAndOpFlags())) {
                    return unorderedSkipLimitSpliterator(pipelineHelper.wrapSpliterator(spliterator), j, j2, exactOutputSizeIfKnown);
                }
                return ((Node) new SliceTask(this, pipelineHelper, spliterator, Nodes.castingArray(), j, j2).invoke()).spliterator();
            }

            @Override // j$.util.stream.AbstractPipeline
            Node opEvaluateParallel(PipelineHelper pipelineHelper, Spliterator spliterator, IntFunction intFunction) {
                long exactOutputSizeIfKnown = pipelineHelper.exactOutputSizeIfKnown(spliterator);
                if (exactOutputSizeIfKnown > 0 && spliterator.hasCharacteristics(16384)) {
                    return Nodes.collect(pipelineHelper, SliceOps.sliceSpliterator(pipelineHelper.getSourceShape(), spliterator, j, j2), true, intFunction);
                }
                if (!StreamOpFlag.ORDERED.isKnown(pipelineHelper.getStreamAndOpFlags())) {
                    return Nodes.collect(this, unorderedSkipLimitSpliterator(pipelineHelper.wrapSpliterator(spliterator), j, j2, exactOutputSizeIfKnown), true, intFunction);
                }
                return (Node) new SliceTask(this, pipelineHelper, spliterator, intFunction, j, j2).invoke();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.AbstractPipeline
            public Sink opWrapSink(int i, Sink sink) {
                return new Sink.ChainedReference(sink) { // from class: j$.util.stream.SliceOps.1.1
                    long m;
                    long n;

                    {
                        this.n = j;
                        long j3 = j2;
                        this.m = j3 < 0 ? Long.MAX_VALUE : j3;
                    }

                    @Override // j$.util.stream.Sink.ChainedReference, j$.util.stream.Sink
                    public void begin(long j3) {
                        this.downstream.begin(SliceOps.calcSize(j3, j, this.m));
                    }

                    @Override // j$.util.function.Consumer
                    public void accept(Object obj) {
                        long j3 = this.n;
                        if (j3 == 0) {
                            long j4 = this.m;
                            if (j4 > 0) {
                                this.m = j4 - 1;
                                this.downstream.accept(obj);
                                return;
                            }
                            return;
                        }
                        this.n = j3 - 1;
                    }

                    @Override // j$.util.stream.Sink.ChainedReference, j$.util.stream.Sink
                    public boolean cancellationRequested() {
                        return this.m == 0 || this.downstream.cancellationRequested();
                    }
                };
            }
        };
    }

    private static int flags(long j) {
        return (j != -1 ? StreamOpFlag.IS_SHORT_CIRCUIT : 0) | StreamOpFlag.NOT_SIZED;
    }

    /* loaded from: classes5.dex */
    final class SliceTask extends AbstractShortCircuitTask {
        private volatile boolean completed;
        private final IntFunction generator;
        private final AbstractPipeline op;
        private final long targetOffset;
        private final long targetSize;
        private long thisNodeSize;

        SliceTask(AbstractPipeline abstractPipeline, PipelineHelper pipelineHelper, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
            super(pipelineHelper, spliterator);
            this.op = abstractPipeline;
            this.generator = intFunction;
            this.targetOffset = j;
            this.targetSize = j2;
        }

        SliceTask(SliceTask sliceTask, Spliterator spliterator) {
            super(sliceTask, spliterator);
            this.op = sliceTask.op;
            this.generator = sliceTask.generator;
            this.targetOffset = sliceTask.targetOffset;
            this.targetSize = sliceTask.targetSize;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.AbstractTask
        public SliceTask makeChild(Spliterator spliterator) {
            return new SliceTask(this, spliterator);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.AbstractShortCircuitTask
        public final Node getEmptyResult() {
            return Nodes.emptyNode(this.op.getOutputShape());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.AbstractTask
        public final Node doLeaf() {
            if (isRoot()) {
                Node.Builder makeNodeBuilder = this.op.makeNodeBuilder(StreamOpFlag.SIZED.isPreserved(this.op.sourceOrOpFlags) ? this.op.exactOutputSizeIfKnown(this.spliterator) : -1L, this.generator);
                Sink opWrapSink = this.op.opWrapSink(this.helper.getStreamAndOpFlags(), makeNodeBuilder);
                PipelineHelper pipelineHelper = this.helper;
                pipelineHelper.copyIntoWithCancel(pipelineHelper.wrapSink(opWrapSink), this.spliterator);
                return makeNodeBuilder.build();
            }
            Node.Builder makeNodeBuilder2 = this.op.makeNodeBuilder(-1L, this.generator);
            if (this.targetOffset == 0) {
                Sink opWrapSink2 = this.op.opWrapSink(this.helper.getStreamAndOpFlags(), makeNodeBuilder2);
                PipelineHelper pipelineHelper2 = this.helper;
                pipelineHelper2.copyIntoWithCancel(pipelineHelper2.wrapSink(opWrapSink2), this.spliterator);
            } else {
                this.helper.wrapAndCopyInto(makeNodeBuilder2, this.spliterator);
            }
            Node build = makeNodeBuilder2.build();
            this.thisNodeSize = build.count();
            this.completed = true;
            this.spliterator = null;
            return build;
        }

        @Override // j$.util.stream.AbstractTask, java.util.concurrent.CountedCompleter
        public final void onCompletion(CountedCompleter countedCompleter) {
            Node conc;
            if (!isLeaf()) {
                this.thisNodeSize = ((SliceTask) this.leftChild).thisNodeSize + ((SliceTask) this.rightChild).thisNodeSize;
                if (this.canceled) {
                    this.thisNodeSize = 0L;
                    conc = getEmptyResult();
                } else if (this.thisNodeSize == 0) {
                    conc = getEmptyResult();
                } else if (((SliceTask) this.leftChild).thisNodeSize == 0) {
                    conc = (Node) ((SliceTask) this.rightChild).getLocalResult();
                } else {
                    conc = Nodes.conc(this.op.getOutputShape(), (Node) ((SliceTask) this.leftChild).getLocalResult(), (Node) ((SliceTask) this.rightChild).getLocalResult());
                }
                if (isRoot()) {
                    conc = doTruncate(conc);
                }
                setLocalResult(conc);
                this.completed = true;
            }
            if (this.targetSize >= 0 && !isRoot() && isLeftCompleted(this.targetOffset + this.targetSize)) {
                cancelLaterNodes();
            }
            super.onCompletion(countedCompleter);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.AbstractShortCircuitTask
        public void cancel() {
            super.cancel();
            if (this.completed) {
                setLocalResult(getEmptyResult());
            }
        }

        private Node doTruncate(Node node) {
            return node.truncate(this.targetOffset, this.targetSize >= 0 ? Math.min(node.count(), this.targetOffset + this.targetSize) : this.thisNodeSize, this.generator);
        }

        private boolean isLeftCompleted(long j) {
            SliceTask sliceTask;
            long completedSize = this.completed ? this.thisNodeSize : completedSize(j);
            if (completedSize >= j) {
                return true;
            }
            SliceTask sliceTask2 = this;
            for (SliceTask sliceTask3 = (SliceTask) getParent(); sliceTask3 != null; sliceTask3 = (SliceTask) sliceTask3.getParent()) {
                if (sliceTask2 == sliceTask3.rightChild && (sliceTask = (SliceTask) sliceTask3.leftChild) != null) {
                    completedSize += sliceTask.completedSize(j);
                    if (completedSize >= j) {
                        return true;
                    }
                }
                sliceTask2 = sliceTask3;
            }
            return completedSize >= j;
        }

        private long completedSize(long j) {
            if (this.completed) {
                return this.thisNodeSize;
            }
            SliceTask sliceTask = (SliceTask) this.leftChild;
            SliceTask sliceTask2 = (SliceTask) this.rightChild;
            if (sliceTask == null || sliceTask2 == null) {
                return this.thisNodeSize;
            }
            long completedSize = sliceTask.completedSize(j);
            return completedSize >= j ? completedSize : completedSize + sliceTask2.completedSize(j);
        }
    }
}
