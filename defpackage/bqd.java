package defpackage;

import android.media.MediaRouter;
import android.view.Display;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bqd extends bpz {
    public bqd(bqz bqzVar) {
        super(bqzVar);
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        bqz bqzVar = (bqz) this.a;
        int n = bqzVar.n(routeInfo);
        if (n >= 0) {
            bqw bqwVar = (bqw) bqzVar.p.get(n);
            Display g = jo.g(routeInfo);
            int displayId = g != null ? g.getDisplayId() : -1;
            if (displayId != bqwVar.c.e()) {
                bot botVar = new bot(bqwVar.c);
                botVar.j(displayId);
                bqwVar.c = botVar.a();
                bqzVar.x();
            }
        }
    }
}
