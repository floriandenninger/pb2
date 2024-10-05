package j$.util;

import j$.util.function.Consumer;
import j$.util.function.DoubleConsumer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class PrimitiveIterator$OfDouble$$ExternalSyntheticLambda0 implements DoubleConsumer {
    public final /* synthetic */ Consumer f$0;

    public /* synthetic */ PrimitiveIterator$OfDouble$$ExternalSyntheticLambda0(Consumer consumer) {
        this.f$0 = consumer;
    }

    @Override // j$.util.function.DoubleConsumer
    public final void accept(double d) {
        this.f$0.accept(Double.valueOf(d));
    }
}
