package com.google.android.apps.youtube.app.offline.controller;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import com.google.android.apps.youtube.app.offline.controller.OfflineSlimStatusBarConnectivityController;
import com.google.android.youtube.R;
import defpackage.aadw;
import defpackage.afsy;
import defpackage.afte;
import defpackage.aftf;
import defpackage.ahej;
import defpackage.ainy;
import defpackage.aioc;
import defpackage.amkq;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azqb;
import defpackage.evr;
import defpackage.fgp;
import defpackage.fgq;
import defpackage.fhg;
import defpackage.izw;
import defpackage.jmk;
import defpackage.kbv;
import defpackage.rxm;
import defpackage.ypa;
import defpackage.ypd;
import defpackage.ysy;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OfflineSlimStatusBarConnectivityController implements any, kbv, aftf, fgp, ypd {
    public final ysy a;
    public final jmk b;
    public ViewGroup c;
    public ViewGroup d;
    public SlimStatusBar e;
    public SlimStatusBar f;
    private final fgq g;
    private final ainy h;
    private final afte i;
    private final afsy j;
    private final ypa k;
    private final aioc l;
    private final LayoutInflater m;
    private boolean n;
    private boolean o;
    private ayqx p;
    private final aadw q;

    public OfflineSlimStatusBarConnectivityController(Context context, ysy ysyVar, rxm rxmVar, fgq fgqVar, ainy ainyVar, jmk jmkVar, afte afteVar, afsy afsyVar, ypa ypaVar, aioc aiocVar, aadw aadwVar, byte[] bArr) {
        this.a = ysyVar;
        this.g = fgqVar;
        this.h = ainyVar;
        this.b = jmkVar;
        this.i = afteVar;
        this.j = afsyVar;
        this.k = ypaVar;
        this.l = aiocVar;
        this.q = aadwVar;
        this.m = LayoutInflater.from(context);
        this.o = !rxmVar.a;
        afteVar.i(this);
    }

    private final ViewGroup p(boolean z) {
        if (z) {
            ViewGroup viewGroup = this.d;
            viewGroup.getClass();
            return viewGroup;
        }
        ViewGroup viewGroup2 = this.c;
        viewGroup2.getClass();
        return viewGroup2;
    }

    public final SlimStatusBar g(boolean z) {
        if (z) {
            if (this.f == null) {
                this.f = (SlimStatusBar) this.m.inflate(R.layout.slim_status_bar, this.d, false);
            }
            return this.f;
        }
        if (this.e == null) {
            this.e = (SlimStatusBar) this.m.inflate(R.layout.slim_status_bar, this.c, false);
        }
        return this.e;
    }

    public final void h(ahej ahejVar) {
        if (this.g.g().b() && !this.a.o() && ahejVar.a() == 8) {
            this.b.k(true);
            jmk jmkVar = this.b;
            if (jmkVar.h != 0) {
                jmkVar.q(true, false, false);
            } else {
                jmkVar.k(true);
                jmkVar.m(true, 500L);
            }
        }
    }

    @Override // defpackage.kbv
    public final void i() {
        this.i.j(this);
    }

    @Override // defpackage.aftf
    public final void j() {
        this.b.q(this.g.g().b(), this.a.o(), this.j.c().g());
    }

    @Override // defpackage.aftf
    public final void k() {
        this.b.q(this.g.g().b(), this.a.o(), this.j.c().g());
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahej.class};
        }
        if (i == 0) {
            h((ahej) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aftf
    public final void l() {
        this.b.q(this.g.g().b(), this.a.o(), this.j.c().g());
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

    @Override // defpackage.kbv
    public final void m(boolean z) {
        boolean o = this.a.o();
        boolean b = this.g.g().b();
        if (o == this.o) {
            if (z) {
                if (!o) {
                    final jmk jmkVar = this.b;
                    ViewGroup b2 = jmkVar.b(b);
                    final SlimStatusBar c = jmkVar.c(b);
                    if (!jmk.r(b2, c)) {
                        jmkVar.n(false, b);
                    }
                    jmkVar.h();
                    c.post(new Runnable() { // from class: jme
                        @Override // java.lang.Runnable
                        public final void run() {
                            jmk jmkVar2 = jmk.this;
                            SlimStatusBar slimStatusBar = c;
                            jmi jmiVar = jmkVar2.x;
                            jmiVar.getClass();
                            int i = jmkVar2.b;
                            int i2 = jmkVar2.c;
                            jmk jmkVar3 = jmiVar.a;
                            AnimatorSet animatorSet = new AnimatorSet();
                            Animator bR = evr.bR(slimStatusBar, i, i2, 400L);
                            Animator bR2 = evr.bR(slimStatusBar, i2, i, 400L);
                            bR2.setStartDelay(200L);
                            animatorSet.playSequentially(bR, bR2);
                            jmkVar2.i = animatorSet;
                            jmkVar2.i.start();
                        }
                    });
                    return;
                }
            } else if (!o) {
                return;
            }
            if (this.j.c().g()) {
                this.b.q(b, true, this.j.c().g());
                return;
            }
            return;
        }
        if (o || !this.g.g().b() || !this.h.d()) {
            this.b.q(b, o, !b && this.j.c().g());
        }
        this.o = o;
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        if (!evr.au(this.q)) {
            this.k.m(this);
            return;
        }
        Object obj = this.p;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
        }
        this.p = null;
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oQ(fhg fhgVar) {
    }

    @Override // defpackage.fgp
    public final void oR(fhg fhgVar, fhg fhgVar2) {
        if (!amkq.b(p(this.n), p(fhgVar2.b()))) {
            jmk jmkVar = this.b;
            boolean z = this.n;
            jmkVar.h = 0;
            if (z) {
                jmkVar.j();
                ViewGroup viewGroup = jmkVar.e;
                viewGroup.getClass();
                Runnable runnable = jmkVar.p;
                runnable.getClass();
                viewGroup.post(runnable);
            } else {
                jmkVar.i();
                ViewGroup viewGroup2 = jmkVar.d;
                viewGroup2.getClass();
                Runnable runnable2 = jmkVar.l;
                runnable2.getClass();
                viewGroup2.post(runnable2);
            }
        }
        this.n = fhgVar2.b();
        if (fhgVar.b() == fhgVar2.b() || fhgVar2.m()) {
            return;
        }
        if (!this.o) {
            jmk jmkVar2 = this.b;
            jmkVar2.h = 2;
            jmkVar2.q(this.n, false, this.j.c().g());
        } else if (this.j.c().g()) {
            this.b.q(this.n, this.a.o(), this.j.c().g());
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (evr.au(this.q)) {
            this.p = this.l.G().j.Y(new ayrs() { // from class: jma
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    OfflineSlimStatusBarConnectivityController.this.h((ahej) obj);
                }
            }, izw.h);
        } else {
            this.k.g(this);
        }
    }
}
