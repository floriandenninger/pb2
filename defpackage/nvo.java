package defpackage;

import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nvo implements Consumer {
    public final /* synthetic */ ajol a;
    private final /* synthetic */ int b;

    public /* synthetic */ nvo(ajol ajolVar, int i) {
        this.b = i;
        this.a = ajolVar;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b == 0) {
            ((nvk) obj).j(this.a);
        } else {
            ((nvg) obj).j(this.a);
        }
    }
}
