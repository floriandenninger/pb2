package defpackage;

import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class iuj implements Consumer {
    public final /* synthetic */ lij a;

    public /* synthetic */ iuj(lij lijVar) {
        this.a = lijVar;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.a.i = (String) obj;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
