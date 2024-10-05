package defpackage;

import androidx.mediarouter.app.MediaRouteButton;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jcl implements Consumer {
    public final /* synthetic */ jcm a;
    private final /* synthetic */ int b;

    public /* synthetic */ jcl(jcm jcmVar, int i) {
        this.b = i;
        this.a = jcmVar;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b == 0) {
            jcm jcmVar = this.a;
            MediaRouteButton mediaRouteButton = (MediaRouteButton) obj;
            if (jcmVar.a) {
                mediaRouteButton.c(true);
            }
            atcb atcbVar = jcmVar.b.a().l;
            if (atcbVar == null) {
                atcbVar = atcb.a;
            }
            jcmVar.e(atcbVar.g);
            return;
        }
        jcm jcmVar2 = this.a;
        jcmVar2.f = jcmVar2.d.a((MediaRouteButton) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
    }
}
