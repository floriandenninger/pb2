package com.google.android.apps.youtube.app.ui.inline;

import com.google.android.apps.youtube.app.ui.inline.DefaultInlinePlayerControls;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import defpackage.aadw;
import defpackage.ahdv;
import defpackage.ahef;
import defpackage.aifk;
import defpackage.aigk;
import defpackage.aign;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.aioc;
import defpackage.aiwk;
import defpackage.aixh;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqr;
import defpackage.ayqw;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.evr;
import defpackage.fcv;
import defpackage.fem;
import defpackage.fgq;
import defpackage.fhd;
import defpackage.fkw;
import defpackage.fla;
import defpackage.fln;
import defpackage.gfp;
import defpackage.gfq;
import defpackage.kch;
import defpackage.kcz;
import defpackage.ktf;
import defpackage.mgz;
import defpackage.mic;
import defpackage.ypa;
import defpackage.ypd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DefaultInlinePlayerControls extends gfp implements any, mic, aioa, ypd {
    public final mgz d;
    private final ainy e;
    private final fgq f;
    private final aifk g;
    private final ypa h;
    private final aioc i;
    private final ayqw j = new ayqw();
    private final fla k;
    private final fcv l;
    private final kch m;
    private final aadw n;

    public DefaultInlinePlayerControls(ainy ainyVar, kch kchVar, fgq fgqVar, ypa ypaVar, aioc aiocVar, aadw aadwVar, fla flaVar, fcv fcvVar, fln flnVar, aifk aifkVar) {
        this.e = ainyVar;
        this.m = kchVar;
        this.f = fgqVar;
        this.h = ypaVar;
        this.i = aiocVar;
        this.n = aadwVar;
        this.k = flaVar;
        this.l = fcvVar;
        this.g = aifkVar;
        this.d = new mgz(this, flnVar);
    }

    private final boolean v() {
        return this.k.b == fkw.WATCH_WHILE && this.e.S();
    }

    @Override // defpackage.mic
    public final aixh k() {
        return this.e.n();
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 0;
        final int i2 = 1;
        return new ayqx[]{aiocVar.G().b.Y(new ayrs(this) { // from class: mgy
            public final /* synthetic */ DefaultInlinePlayerControls a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i != 0) {
                    this.a.n((ahdv) obj);
                } else {
                    this.a.o((ahef) obj);
                }
            }
        }, ktf.m), aiocVar.ao().G().E(ayqr.a()).Y(new ayrs(this) { // from class: mgy
            public final /* synthetic */ DefaultInlinePlayerControls a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 != 0) {
                    this.a.n((ahdv) obj);
                } else {
                    this.a.o((ahef) obj);
                }
            }
        }, ktf.m)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahdv.class, ahef.class};
        }
        if (i == 0) {
            n((ahdv) obj);
            return null;
        }
        if (i == 1) {
            o((ahef) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.mic
    public final String l() {
        return this.e.q();
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.mic
    public final void m() {
        this.e.e();
    }

    public final void n(ahdv ahdvVar) {
        if (this.c != null && ahdvVar.c() == aigk.VIDEO_PLAYBACK_ERROR) {
            h();
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        if (evr.au(this.n)) {
            this.j.c();
        } else {
            this.h.m(this);
        }
    }

    public final void o(ahef ahefVar) {
        if (this.c == null) {
            return;
        }
        if ((this.a == 3 && ahefVar.c().c(aign.PLAYBACK_LOADED)) || (this.a == 0 && ahefVar.c().a(aign.NEW, aign.ENDED, aign.INTERSTITIAL_REQUESTED))) {
            h();
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (evr.au(this.n)) {
            this.j.g(kI(this.i));
        } else {
            this.h.g(this);
        }
    }

    @Override // defpackage.mic
    public final void p() {
        this.e.a();
    }

    @Override // defpackage.mic
    public final void q() {
        this.e.b();
    }

    @Override // defpackage.mic
    public final void r(PlaybackStartDescriptor playbackStartDescriptor) {
        kcz kczVar = (kcz) this.m.get();
        if (kczVar.ay.M(playbackStartDescriptor)) {
            kczVar.aI(false);
        }
    }

    @Override // defpackage.mic
    public final void s() {
        aiwk aiwkVar = this.e.p.a;
        if (aiwkVar == null) {
            return;
        }
        aiwkVar.ak();
    }

    @Override // defpackage.mic
    public final boolean t() {
        return this.e.d();
    }

    @Override // defpackage.mic
    public final void u(fhd fhdVar) {
        if (!this.g.f()) {
            this.h.f(new fem());
        }
        this.m.get().p(fhdVar, this.f.g(), false, this.l.c(2));
    }

    @Override // defpackage.gfp
    protected final boolean i(gfq gfqVar, int i) {
        return i == 0 ? (v() && this.d.a) ? false : true : i != 3 || v();
        return true;
    }
}
