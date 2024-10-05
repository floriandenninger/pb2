package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qhq implements bpq {
    public final qhy a;
    public final Handler b;

    static {
        new qkw("MediaRouterOPTListener");
    }

    public qhq(qhy qhyVar) {
        qip.an(qhyVar);
        this.a = qhyVar;
        this.b = new amcc(Looper.getMainLooper(), (byte[]) null);
    }
}
