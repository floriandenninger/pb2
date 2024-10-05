package j$.util.function;

import j$.util.function.IntConsumer;

/* loaded from: classes5.dex */
public interface IntConsumer {
    void accept(int i);

    IntConsumer andThen(IntConsumer intConsumer);

    /* renamed from: j$.util.function.IntConsumer$-CC, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        public static IntConsumer $default$andThen(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
            intConsumer2.getClass();
            return new IntConsumer() { // from class: j$.util.function.IntConsumer$$ExternalSyntheticLambda0
                @Override // j$.util.function.IntConsumer
                public final void accept(int i) {
                    IntConsumer.CC.lambda$andThen$0(IntConsumer.this, intConsumer2, i);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                    return IntConsumer.CC.$default$andThen(this, intConsumer3);
                }
            };
        }

        public static /* synthetic */ void lambda$andThen$0(IntConsumer intConsumer, IntConsumer intConsumer2, int i) {
            intConsumer.accept(i);
            intConsumer2.accept(i);
        }
    }
}
