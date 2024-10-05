package defpackage;

import android.media.MediaRouter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bqb extends MediaRouter.VolumeCallback {
    protected final bqa a;

    public bqb(bqa bqaVar) {
        this.a = bqaVar;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.k(routeInfo, i);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.l(routeInfo, i);
    }
}
