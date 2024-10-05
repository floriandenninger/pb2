package defpackage;

import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afyl implements Consumer {
    public final /* synthetic */ aahd a;
    private final /* synthetic */ int b;

    public /* synthetic */ afyl(aahd aahdVar, int i) {
        this.b = i;
        this.a = aahdVar;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b != 0) {
            this.a.a((apxf) obj);
        } else {
            this.a.a((apxf) obj);
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
    }
}
