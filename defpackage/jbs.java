package defpackage;

import androidx.mediarouter.app.MediaRouteButton;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jbs implements Consumer {
    public final /* synthetic */ jbu a;
    private final /* synthetic */ int b;

    public /* synthetic */ jbs(jbu jbuVar, int i) {
        this.b = i;
        this.a = jbuVar;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b == 0) {
            ((akbw) this.a.b.get()).n((akby) obj);
        } else {
            jbu jbuVar = this.a;
            ((MediaRouteButton) obj).performClick();
            jbuVar.c.a(jbuVar.d.h);
        }
    }
}
