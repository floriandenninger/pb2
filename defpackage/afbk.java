package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afbk implements afkx {
    final /* synthetic */ afbs a;

    public afbk(afbs afbsVar) {
        this.a = afbsVar;
    }

    @Override // defpackage.afkx
    public final void a() {
        c();
    }

    @Override // defpackage.afkx
    public final void b() {
        this.a.W();
    }

    @Override // defpackage.afkx
    public final void c() {
        this.a.e.k(afqu.ANDROID_EXOPLAYER);
        yjk.f();
        this.a.R();
        afbs afbsVar = this.a;
        if (afbsVar.u != null) {
            afbsVar.j.post(new Runnable() { // from class: afbj
                @Override // java.lang.Runnable
                public final void run() {
                    afbk afbkVar = afbk.this;
                    afbs afbsVar2 = afbkVar.a;
                    afbm afbmVar = afbsVar2.u;
                    afbsVar2.u = null;
                    if (afbmVar != null) {
                        afbkVar.a.U(afbmVar.a, afbmVar.c, afbmVar.b, afbmVar.d, afbmVar.e);
                    }
                }
            });
        }
        if (!this.a.ab()) {
            this.a.P();
        } else {
            this.a.Q(true);
        }
        afbs afbsVar2 = this.a;
        afbsVar2.p.v(afbsVar2.v, afbsVar2.w);
    }

    @Override // defpackage.afkx
    public final void d() {
        PlayerConfigModel playerConfigModel;
        this.a.e.l(afqu.ANDROID_EXOPLAYER);
        zga.g("EXO surface destroyed");
        afbs afbsVar = this.a;
        if (afbsVar.u != null) {
            return;
        }
        if (afbsVar.t == null || (playerConfigModel = afbsVar.x) == null || !playerConfigModel.aS()) {
            this.a.X();
            return;
        }
        this.a.S();
        this.a.Y(r0.x.C(), "src.dest");
    }

    @Override // defpackage.afkx
    public final void e() {
        this.a.e.m(afqu.ANDROID_EXOPLAYER);
        afbs afbsVar = this.a;
        afbsVar.V(new afih("gl", afbsVar.g()));
    }
}
