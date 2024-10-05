package defpackage;

import androidx.mediarouter.app.MediaRouteButton;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kcw implements Consumer {
    public final /* synthetic */ kcz a;
    private final /* synthetic */ int b;

    public /* synthetic */ kcw(kcz kczVar, int i) {
        this.b = i;
        this.a = kczVar;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b == 0) {
            this.a.aq.g((MediaRouteButton) obj);
        } else {
            this.a.aq.b((MediaRouteButton) obj);
        }
    }
}
