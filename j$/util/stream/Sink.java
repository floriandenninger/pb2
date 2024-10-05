package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.DoubleConsumer;
import j$.util.function.IntConsumer;
import j$.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public interface Sink extends Consumer {
    void accept(int i);

    void accept(long j);

    void begin(long j);

    boolean cancellationRequested();

    void end();

    /* renamed from: j$.util.stream.Sink$-CC, reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class CC {
        public static void $default$begin(Sink sink, long j) {
        }

        public static boolean $default$cancellationRequested(Sink sink) {
            return false;
        }

        public static void $default$end(Sink sink) {
        }

        public static void $default$accept(Sink sink, int i) {
            throw new IllegalStateException("called wrong accept method");
        }

        public static void $default$accept(Sink sink, long j) {
            throw new IllegalStateException("called wrong accept method");
        }
    }

    /* loaded from: classes5.dex */
    public interface OfInt extends Sink, IntConsumer {
        @Override // j$.util.stream.Sink
        void accept(int i);

        void accept(Integer num);

        /* renamed from: j$.util.stream.Sink$OfInt$-CC, reason: invalid class name */
        /* loaded from: classes5.dex */
        public abstract /* synthetic */ class CC {
            public static /* bridge */ /* synthetic */ void $default$accept(OfInt ofInt, Object obj) {
                ofInt.accept((Integer) obj);
            }

            public static void $default$accept(OfInt ofInt, Integer num) {
                if (Tripwire.ENABLED) {
                    Tripwire.trip(ofInt.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
                }
                ofInt.accept(num.intValue());
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface OfLong extends Sink, LongConsumer {
        @Override // j$.util.stream.Sink
        void accept(long j);

        void accept(Long l);

        /* renamed from: j$.util.stream.Sink$OfLong$-CC, reason: invalid class name */
        /* loaded from: classes5.dex */
        public abstract /* synthetic */ class CC {
            public static void $default$accept(OfLong ofLong, Long l) {
                if (Tripwire.ENABLED) {
                    Tripwire.trip(ofLong.getClass(), "{0} calling Sink.OfLong.accept(Long)");
                }
                ofLong.accept(l.longValue());
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface OfDouble extends Sink, DoubleConsumer {
        @Override // j$.util.function.DoubleConsumer
        void accept(double d);

        void accept(Double d);

        /* renamed from: j$.util.stream.Sink$OfDouble$-CC, reason: invalid class name */
        /* loaded from: classes5.dex */
        public abstract /* synthetic */ class CC {
            public static void $default$accept(OfDouble ofDouble, Double d) {
                if (Tripwire.ENABLED) {
                    Tripwire.trip(ofDouble.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
                }
                ofDouble.accept(d.doubleValue());
            }
        }
    }

    /* loaded from: classes5.dex */
    public abstract class ChainedReference implements Sink {
        protected final Sink downstream;

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(int i) {
            CC.$default$accept((Sink) this, i);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(long j) {
            CC.$default$accept(this, j);
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer.CC.$default$andThen(this, consumer);
        }

        public ChainedReference(Sink sink) {
            sink.getClass();
            this.downstream = sink;
        }

        @Override // j$.util.stream.Sink
        public void begin(long j) {
            this.downstream.begin(j);
        }

        @Override // j$.util.stream.Sink
        public void end() {
            this.downstream.end();
        }

        @Override // j$.util.stream.Sink
        public boolean cancellationRequested() {
            return this.downstream.cancellationRequested();
        }
    }

    /* loaded from: classes5.dex */
    public abstract class ChainedInt implements OfInt {
        protected final Sink downstream;

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(long j) {
            CC.$default$accept(this, j);
        }

        @Override // j$.util.stream.Sink.OfInt
        public /* synthetic */ void accept(Integer num) {
            OfInt.CC.$default$accept((OfInt) this, num);
        }

        @Override // j$.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            OfInt.CC.$default$accept(this, obj);
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer.CC.$default$andThen(this, consumer);
        }

        @Override // j$.util.function.IntConsumer
        public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
            return IntConsumer.CC.$default$andThen(this, intConsumer);
        }

        public ChainedInt(Sink sink) {
            sink.getClass();
            this.downstream = sink;
        }

        @Override // j$.util.stream.Sink
        public void end() {
            this.downstream.end();
        }

        @Override // j$.util.stream.Sink
        public boolean cancellationRequested() {
            return this.downstream.cancellationRequested();
        }
    }
}
