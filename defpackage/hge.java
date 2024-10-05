package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsPlayerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hge implements pny {
    final /* synthetic */ ShortsPlayerView a;

    public hge(ShortsPlayerView shortsPlayerView) {
        this.a = shortsPlayerView;
    }

    @Override // defpackage.pny, defpackage.bhn
    public final void F(aso asoVar) {
        int i = asoVar.a;
        int i2 = asoVar.b;
        float f = 1.0f;
        if (i2 != 0 && i != 0) {
            f = (i * asoVar.d) / i2;
        }
        ShortsPlayerView shortsPlayerView = this.a;
        if (shortsPlayerView.g == 0.0f) {
            shortsPlayerView.g = f;
            shortsPlayerView.requestLayout();
        } else {
            zga.b("Changing the video aspect ratio after it's initialized is not allowed");
        }
    }

    @Override // defpackage.pny
    public final /* synthetic */ void W() {
    }

    @Override // defpackage.pny
    public final /* synthetic */ void X() {
    }

    @Override // defpackage.pny
    public final /* synthetic */ void Y() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void aa() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ac() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ad() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ae(int i) {
    }

    @Override // defpackage.pny
    public final /* synthetic */ void ag() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ah() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ai() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void aj() {
    }

    @Override // defpackage.pny
    public final /* synthetic */ void ak() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void al() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void am() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void an() {
    }

    @Override // defpackage.pny
    public final /* synthetic */ void ao() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void ap(asj asjVar) {
    }

    @Override // defpackage.pny
    public final /* synthetic */ void aq() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void n(boolean z) {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void o(boolean z) {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void p(pnu pnuVar) {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void q(int i) {
    }

    @Override // defpackage.pnw
    public final void r(pns pnsVar) {
        afsi.c(2, 6, "[ShortsCreation][Android][Edit]Player error in edit fragment", pnsVar);
        hfq a = this.a.l.a(acsb.c(107384));
        a.h(true);
        a.a();
        zga.d("SPlayerView: Player error ", pnsVar);
        this.a.d.post(new Runnable() { // from class: hgd
            @Override // java.lang.Runnable
            public final void run() {
                hge.this.a.b.setVisibility(0);
            }
        });
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void s(boolean z, int i) {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void t(pnz pnzVar, pnz pnzVar2, int i) {
    }

    @Override // defpackage.pny
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.pnw
    public final /* synthetic */ void w() {
    }

    @Override // defpackage.pny, defpackage.awb
    public final /* synthetic */ void x(boolean z) {
    }
}
