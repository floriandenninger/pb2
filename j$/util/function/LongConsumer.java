package j$.util.function;

import j$.util.function.LongConsumer;

/* loaded from: classes5.dex */
public interface LongConsumer {
    void accept(long j);

    LongConsumer andThen(LongConsumer longConsumer);

    /* renamed from: j$.util.function.LongConsumer$-CC, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        public static LongConsumer $default$andThen(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
            longConsumer2.getClass();
            return new LongConsumer() { // from class: j$.util.function.LongConsumer$$ExternalSyntheticLambda0
                @Override // j$.util.function.LongConsumer
                public final void accept(long j) {
                    LongConsumer.CC.lambda$andThen$0(LongConsumer.this, longConsumer2, j);
                }

                @Override // j$.util.function.LongConsumer
                public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                    return LongConsumer.CC.$default$andThen(this, longConsumer3);
                }
            };
        }

        public static /* synthetic */ void lambda$andThen$0(LongConsumer longConsumer, LongConsumer longConsumer2, long j) {
            longConsumer.accept(j);
            longConsumer2.accept(j);
        }
    }
}
