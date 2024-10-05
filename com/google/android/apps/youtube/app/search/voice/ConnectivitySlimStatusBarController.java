package com.google.android.apps.youtube.app.search.voice;

import android.animation.LayoutTransition;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import com.google.android.youtube.R;
import defpackage.afsy;
import defpackage.afte;
import defpackage.aftf;
import defpackage.any;
import defpackage.aok;
import defpackage.kbv;
import defpackage.lhk;
import defpackage.lhn;
import defpackage.lho;
import defpackage.ypa;
import defpackage.ysy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConnectivitySlimStatusBarController implements any, kbv, aftf {
    private final LayoutInflater a;
    private final afte b;
    private final afsy c;
    private final ysy d;
    private final ypa e;
    private final lho f;
    private ViewGroup g;
    private SlimStatusBar h;
    private boolean i;

    public ConnectivitySlimStatusBarController(ysy ysyVar, afte afteVar, afsy afsyVar, ypa ypaVar, Context context, lho lhoVar) {
        this.a = LayoutInflater.from(context);
        this.d = ysyVar;
        this.b = afteVar;
        this.c = afsyVar;
        this.e = ypaVar;
        this.f = lhoVar;
        this.i = ysyVar.o();
        afteVar.i(this);
    }

    public final void g(ViewGroup viewGroup) {
        if (this.g != null) {
            this.h = null;
        }
        viewGroup.getClass();
        this.g = viewGroup;
        if (this.h == null) {
            this.h = (SlimStatusBar) this.a.inflate(R.layout.slim_status_bar, viewGroup, false);
        }
        lho lhoVar = this.f;
        SlimStatusBar slimStatusBar = this.h;
        boolean o = this.d.o();
        lhoVar.l = viewGroup;
        lhoVar.m = slimStatusBar;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setStartDelay(1, 0L);
        layoutTransition.setDuration(lhoVar.d);
        layoutTransition.addTransitionListener(new lhn(0));
        lhoVar.n = layoutTransition;
        if (o) {
            lhoVar.o = 0;
        } else {
            lhoVar.o = 2;
        }
        lhoVar.e = lhoVar.a(true, false);
        lhoVar.f = lhoVar.a(false, false);
        lhoVar.h = lhoVar.a(true, true);
        lhoVar.g = new lhk(lhoVar, 0);
        lhoVar.i = new lhk(lhoVar, 1);
        lhoVar.j = new lhk(lhoVar, 2);
    }

    @Override // defpackage.kbv
    public final void i() {
        this.b.j(this);
    }

    @Override // defpackage.aftf
    public final void j() {
        this.f.f(this.d.o(), this.c.c().g());
    }

    @Override // defpackage.aftf
    public final void k() {
        this.f.f(this.d.o(), this.c.c().g());
    }

    @Override // defpackage.aftf
    public final void l() {
        this.f.f(this.d.o(), this.c.c().g());
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
        boolean o = this.d.o();
        boolean g = this.c.c().g();
        if (o != this.i) {
            this.f.f(o, g);
            this.i = o;
            return;
        }
        if (z) {
            if (!o) {
                lho lhoVar = this.f;
                if (!lho.g(lhoVar.l, lhoVar.m)) {
                    lhoVar.c();
                }
                lhoVar.b();
                lhoVar.m.post(new lhk(lhoVar, 3));
                return;
            }
        } else if (!o) {
            return;
        }
        if (g) {
            this.f.f(true, true);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.e.m(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.e.g(this);
    }
}
