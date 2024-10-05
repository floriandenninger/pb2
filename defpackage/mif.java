package defpackage;

import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mif extends gfp implements ggf, fgp {
    private final fgq d;
    private final InlinePlaybackLifecycleController e;

    public mif(fgq fgqVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController) {
        this.d = fgqVar;
        this.e = inlinePlaybackLifecycleController;
    }

    @Override // defpackage.gfp
    public final boolean i(gfq gfqVar, int i) {
        return i != 1 || this.d.g().c();
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oQ(fhg fhgVar) {
    }

    @Override // defpackage.fgp
    public final void oR(fhg fhgVar, fhg fhgVar2) {
        if (!fhgVar.d() || fhgVar2.c()) {
            if (fhgVar.c() || !fhgVar2.c()) {
                return;
            }
            h();
            return;
        }
        this.e.p();
    }
}
