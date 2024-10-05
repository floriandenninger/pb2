package defpackage;

import android.media.MediaRouter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bqv extends bpc {
    private final Object a;

    public bqv(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.bpc
    public final void b(int i) {
        ((MediaRouter.RouteInfo) this.a).requestSetVolume(i);
    }

    @Override // defpackage.bpc
    public final void c(int i) {
        ((MediaRouter.RouteInfo) this.a).requestUpdateVolume(i);
    }
}
