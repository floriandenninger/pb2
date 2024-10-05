package defpackage;

import androidx.mediarouter.app.MediaRouteButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bnk extends ji {
    final /* synthetic */ MediaRouteButton a;

    public bnk(MediaRouteButton mediaRouteButton) {
        this.a = mediaRouteButton;
    }

    @Override // defpackage.ji
    public final void g() {
        this.a.a();
    }

    @Override // defpackage.ji
    public final void h() {
        this.a.a();
    }

    @Override // defpackage.ji
    public final void i() {
        this.a.a();
    }

    @Override // defpackage.ji
    public final void j(bpv bpvVar) {
        this.a.a();
    }

    @Override // defpackage.ji
    public final void k(bpv bpvVar) {
        this.a.a();
    }

    @Override // defpackage.ji
    public final void l(bpv bpvVar) {
        this.a.a();
    }

    @Override // defpackage.ji
    public final void m() {
        this.a.a();
    }

    @Override // defpackage.ji
    public final void o(bqf bqfVar) {
        boolean z = bqfVar != null ? bqfVar.c.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
        MediaRouteButton mediaRouteButton = this.a;
        if (mediaRouteButton.b != z) {
            mediaRouteButton.b = z;
            mediaRouteButton.refreshDrawableState();
        }
    }

    @Override // defpackage.ji
    public final void q() {
        this.a.a();
    }
}
