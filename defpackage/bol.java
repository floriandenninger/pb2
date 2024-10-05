package defpackage;

import android.media.MediaRouter2;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bol extends MediaRouter2.ControllerCallback {
    final /* synthetic */ bos a;

    public bol(bos bosVar) {
        this.a = bosVar;
    }

    @Override // android.media.MediaRouter2.ControllerCallback
    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.f(routingController);
    }
}
