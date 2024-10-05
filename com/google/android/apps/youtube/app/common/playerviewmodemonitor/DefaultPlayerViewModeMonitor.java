package com.google.android.apps.youtube.app.common.playerviewmodemonitor;

import com.google.android.apps.youtube.app.common.playerviewmodemonitor.DefaultPlayerViewModeMonitor;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import defpackage.ahor;
import defpackage.ahos;
import defpackage.any;
import defpackage.aok;
import defpackage.aypn;
import defpackage.aypy;
import defpackage.ayqb;
import defpackage.ayqw;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.aysh;
import defpackage.aysw;
import defpackage.azrh;
import defpackage.azrs;
import defpackage.evy;
import defpackage.fgp;
import defpackage.fgq;
import defpackage.fhg;
import defpackage.fkw;
import defpackage.fkz;
import defpackage.fla;
import defpackage.gfq;
import defpackage.gge;
import defpackage.obq;
import defpackage.obr;
import defpackage.oeu;
import j$.util.Optional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DefaultPlayerViewModeMonitor implements any, fgq, obq, ahor, gge, fkz {
    public volatile fhg a;
    private final obr b;
    private final fla c;
    private final azrs d;
    private final azrs e;
    private final azrs f;
    private final azrs g;
    private final aypy h;
    private final ayqw i;
    private final Map j;
    private final aypy k;
    private final aypy l;
    private final InlinePlaybackLifecycleController m;
    private final ahos n;

    public DefaultPlayerViewModeMonitor(aypy aypyVar, obr obrVar, oeu oeuVar, fla flaVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, ahos ahosVar, Optional optional) {
        this.b = obrVar;
        this.c = flaVar;
        this.m = inlinePlaybackLifecycleController;
        this.n = ahosVar;
        azrs aT = azrh.aN(false).aT();
        this.e = aT;
        azrs aT2 = azrh.aN(Integer.valueOf(obrVar.b)).aT();
        this.d = aT2;
        azrs aT3 = azrh.aN(false).aT();
        this.f = aT3;
        azrs aT4 = azrh.aN(flaVar.b).aT();
        this.g = aT4;
        aypy aypyVar2 = (aypy) optional.map(evy.f).orElse(aypy.W(false));
        this.h = aypyVar2;
        azrs azrsVar = oeuVar.a;
        aysw.b(aypyVar, "source1 is null");
        aysw.b(aypyVar2, "source7 is null");
        aypy e = aypy.n(new ayqb[]{aypyVar, aT2, aT, aT3, aT4, azrsVar, aypyVar2}, new aysh(0), aypn.a).B().G(new ayrs() { // from class: foh
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                DefaultPlayerViewModeMonitor.this.a = (fhg) obj;
            }
        }).ae().aJ().e(0);
        this.k = e;
        this.i = new ayqw();
        this.j = new HashMap();
        this.a = fhg.NONE;
        this.l = e.aF();
    }

    @Override // defpackage.fgq
    public final fhg g() {
        return this.a;
    }

    @Override // defpackage.fgq
    public final aypy h() {
        return this.k;
    }

    @Override // defpackage.fgq
    public final void i(final fgp fgpVar) {
        if (this.j.containsKey(fgpVar)) {
            return;
        }
        this.j.put(fgpVar, this.l.ax(new ayrs() { // from class: fog
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                List list = (List) obj;
                fgp.this.oR((fhg) list.get(0), (fhg) list.get(1));
            }
        }));
    }

    @Override // defpackage.fgq
    public final void j(fgp fgpVar) {
        ayqx ayqxVar = (ayqx) this.j.remove(fgpVar);
        if (ayqxVar != null) {
            ayqxVar.qc();
        }
    }

    @Override // defpackage.fkz
    public final void k(fkw fkwVar) {
        this.g.c(fkwVar);
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        this.b.a(this);
        this.c.d(this);
        this.m.l(this);
        this.n.b(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.b.b(this);
        this.c.a.remove(this);
        this.m.o(this);
        this.n.h(this);
        this.i.c();
    }

    @Override // defpackage.gge
    public final void m(gfq gfqVar, int i, int i2) {
        this.e.c(Boolean.valueOf(i2 != 0));
    }

    @Override // defpackage.ahor
    public final void n(boolean z) {
        this.f.c(Boolean.valueOf(z));
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.obq
    public final void o(int i) {
        this.d.c(Integer.valueOf(i));
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }

    public static fhg l(int i, fhg fhgVar) {
        Optional of;
        if (i == 1) {
            of = Optional.of(fhg.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED);
        } else if (i == 2) {
            of = Optional.of(fhg.WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED);
        } else if (i == 3) {
            of = Optional.of(fhg.WATCH_WHILE_SLIDING_MAXIMIZED_FULLSCREEN);
        } else if (i == 4) {
            of = Optional.of(fhg.WATCH_WHILE_SLIDING_FULLSCREEN_DISMISSED);
        } else {
            of = Optional.empty();
        }
        return of.isPresent() ? (fhg) of.get() : fhgVar;
    }
}
