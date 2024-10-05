package defpackage;

import android.view.MenuItem;
import j$.util.Optional;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jcp implements Consumer {
    public final /* synthetic */ jcr a;
    private final /* synthetic */ int b;

    public /* synthetic */ jcp(jcr jcrVar, int i) {
        this.b = i;
        this.a = jcrVar;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b == 0) {
            jcr jcrVar = this.a;
            jcrVar.a.g(jcr.a((MenuItem) obj));
            jcrVar.a.deleteObserver(jcrVar.c);
            jcrVar.d = Optional.empty();
            return;
        }
        this.a.c();
    }
}
