package j$.util;

import j$.util.function.Consumer;
import j$.util.function.IntConsumer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class PrimitiveIterator$OfInt$$ExternalSyntheticLambda0 implements IntConsumer {
    public final /* synthetic */ Consumer f$0;

    public /* synthetic */ PrimitiveIterator$OfInt$$ExternalSyntheticLambda0(Consumer consumer) {
        this.f$0 = consumer;
    }

    @Override // j$.util.function.IntConsumer
    public final void accept(int i) {
        this.f$0.accept(Integer.valueOf(i));
    }

    @Override // j$.util.function.IntConsumer
    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }
}
