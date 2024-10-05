package com.google.android.apps.youtube.app.settings;

import android.app.Activity;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
import defpackage.aaci;
import defpackage.aadw;
import defpackage.abci;
import defpackage.abcp;
import defpackage.acra;
import defpackage.aftm;
import defpackage.afto;
import defpackage.ajcq;
import defpackage.akgl;
import defpackage.ammv;
import defpackage.amru;
import defpackage.any;
import defpackage.aobq;
import defpackage.aok;
import defpackage.aqyg;
import defpackage.asay;
import defpackage.atnc;
import defpackage.atnz;
import defpackage.aupv;
import defpackage.ayqr;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azqv;
import defpackage.fap;
import defpackage.fuu;
import defpackage.jun;
import defpackage.kfq;
import defpackage.whu;
import defpackage.ynl;
import defpackage.ynm;
import defpackage.ypa;
import defpackage.ypd;
import defpackage.ysy;
import defpackage.zga;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SettingsDataAccess implements any, ypd {
    public final Activity a;
    public final fap b;
    public final fuu c;
    public final acra d;
    public abci e;
    public final aadw f;
    private final ypa g;
    private final abcp h;
    private final akgl i;
    private final Executor j;
    private final azqv k = azqv.ap();
    private final ysy l;
    private final boolean m;

    public SettingsDataAccess(Activity activity, ypa ypaVar, abcp abcpVar, fap fapVar, aadw aadwVar, fuu fuuVar, akgl akglVar, Executor executor, ysy ysyVar, acra acraVar) {
        this.a = activity;
        this.g = ypaVar;
        this.h = abcpVar;
        this.b = fapVar;
        this.f = aadwVar;
        this.c = fuuVar;
        this.i = akglVar;
        this.j = executor;
        this.l = ysyVar;
        this.d = acraVar;
        this.m = activity.getIntent().getBooleanExtra("show_offline_items", false);
    }

    public static /* synthetic */ void k(Throwable th) {
        String valueOf = String.valueOf(th.getLocalizedMessage());
        if (valueOf.length() != 0) {
            "Failed to store renderer: ".concat(valueOf);
        }
    }

    private final boolean p() {
        return this.m || !this.l.o();
    }

    public final ayqx g(final Runnable runnable) {
        if (this.e == null) {
            try {
                abci abciVar = (abci) this.b.e().c();
                this.e = abciVar;
                if (abciVar != null) {
                    l(abciVar);
                } else {
                    l(new abci(asay.a));
                }
            } catch (IOException e) {
                zga.n("Failed to load settings response", e);
            }
        }
        return this.k.av().n().G().E(ayqr.a()).X(new ayrs() { // from class: lml
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                runnable.run();
            }
        });
    }

    @Deprecated
    public final List h() {
        return !n() ? amru.q() : this.e.a();
    }

    public final List i() {
        if (!p()) {
            return h();
        }
        if (!n()) {
            return amru.q();
        }
        return this.e.b();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aaci.class, aftm.class, afto.class};
        }
        if (i != 0) {
            if (i == 1) {
                m();
                return null;
            }
            if (i == 2) {
                m();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        aaci aaciVar = (aaci) obj;
        ammv f = aaciVar.f();
        ammv e = aaciVar.e();
        if (((Boolean) f.b(kfq.s).e(false)).booleanValue()) {
            Activity activity = this.a;
            aqyg aqygVar = ((atnz) f.c()).c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            whu.L(activity, ajcq.b(aqygVar), 0);
            return null;
        }
        if (!((Boolean) e.b(kfq.r).b(kfq.q).b(kfq.p).e(false)).booleanValue()) {
            return null;
        }
        Activity activity2 = this.a;
        aqyg aqygVar2 = ((atnc) e.c()).c;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.L(activity2, ajcq.b(aqygVar2), 0);
        return null;
    }

    public final void l(abci abciVar) {
        akgl akglVar = this.i;
        akglVar.a.clear();
        akglVar.b.clear();
        this.k.c(abciVar);
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.k.sh();
    }

    final void m() {
        if (p()) {
            return;
        }
        abcp abcpVar = this.h;
        ynm.k(abcpVar.d(abcpVar.a(null)), this.j, jun.u, new ynl() { // from class: lmk
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                SettingsDataAccess settingsDataAccess = SettingsDataAccess.this;
                abci abciVar = (abci) obj;
                settingsDataAccess.b.j(abciVar);
                if (evr.ay(settingsDataAccess.f)) {
                    ynm.j(settingsDataAccess.c.a(abciVar), angq.a, lra.b);
                }
                if (abciVar.equals(settingsDataAccess.e)) {
                    return;
                }
                settingsDataAccess.e = abciVar;
                settingsDataAccess.d.D(new acqx(abciVar.a.f.I()));
                settingsDataAccess.l(abciVar);
            }
        });
    }

    public final boolean n() {
        return this.e != null;
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.g.m(this);
    }

    public final aupv o(int i) {
        for (Object obj : i()) {
            if (obj instanceof aupv) {
                aupv aupvVar = (aupv) obj;
                int bz = aobq.bz(aupvVar.e);
                if (bz == 0) {
                    bz = 1;
                }
                if (bz == i) {
                    return aupvVar;
                }
            }
        }
        return null;
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.g.g(this);
        m();
    }
}
