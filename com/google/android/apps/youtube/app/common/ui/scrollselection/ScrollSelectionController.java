package com.google.android.apps.youtube.app.common.ui.scrollselection;

import android.util.Pair;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
import defpackage.ajom;
import defpackage.ajon;
import defpackage.any;
import defpackage.aok;
import defpackage.ayph;
import defpackage.aypn;
import defpackage.ayqx;
import defpackage.ayrm;
import defpackage.ayrs;
import defpackage.ayrz;
import defpackage.azqw;
import defpackage.azqy;
import defpackage.ghv;
import defpackage.gmb;
import defpackage.gmf;
import defpackage.gmg;
import defpackage.gmh;
import defpackage.mhj;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ScrollSelectionController implements ajon, any, gmb {
    public gmh b;
    protected View c;
    private boolean f;
    private WeakReference g;
    private WeakReference h;
    private ayqx i;
    private final azqw a = azqy.ap().av();
    private final WeakHashMap d = new WeakHashMap();
    private final WeakHashMap e = new WeakHashMap();

    private final View h() {
        WeakReference weakReference = this.h;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    private final gmf s() {
        WeakReference weakReference = this.g;
        if (weakReference == null) {
            return null;
        }
        return (gmf) weakReference.get();
    }

    private final void t() {
        n(null);
        this.g = null;
        this.h = null;
    }

    protected gmh g(gmg gmgVar) {
        return new gmh(this.c, gmgVar);
    }

    public void i(gmg gmgVar) {
        ayqx ayqxVar = this.i;
        if (ayqxVar != null && !ayqxVar.e()) {
            ayrz.c((AtomicReference) this.i);
        }
        gmf s = s();
        if (s != null) {
            this.i = s.oz(0).Q();
        }
        View h = h();
        gmh gmhVar = this.b;
        if (gmhVar != null && h != null) {
            gmhVar.e(h);
        }
        t();
        if (gmgVar == null) {
            this.b = null;
            return;
        }
        gmh gmhVar2 = (gmh) this.d.get(gmgVar);
        this.b = gmhVar2;
        if (gmhVar2 == null) {
            gmh g = g(gmgVar);
            this.b = g;
            this.d.put(gmgVar, g);
        }
        gmgVar.m(this);
        gmgVar.l().post(new mhj(this, 1));
    }

    @Override // defpackage.gmb
    public final aypn j() {
        return this.a.n().G();
    }

    public final void k(View view, gmf gmfVar) {
        this.e.put(view, new WeakReference(gmfVar));
        gmh gmhVar = this.b;
        if (gmhVar != null) {
            gmhVar.a.put(view, 0);
        }
    }

    public final void l() {
        gmh gmhVar = this.b;
        if (gmhVar == null) {
            return;
        }
        r(gmhVar.d(true), true, false);
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

    public final void m(View view) {
        if (this.f) {
            return;
        }
        this.f = true;
        this.c = view;
    }

    public final void n(Integer num) {
        this.a.c(Optional.ofNullable(num).filter(ghv.d));
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        ayqx ayqxVar = this.i;
        if (ayqxVar != null && !ayqxVar.e()) {
            ayrz.c((AtomicReference) this.i);
        }
        t();
    }

    @Override // defpackage.ajon
    public final void o(ajom ajomVar, Object obj) {
        if (ajomVar instanceof gmf) {
            k(ajomVar.a(), (gmf) ajomVar);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }

    public final void p(View view) {
        this.e.remove(view);
        gmh gmhVar = this.b;
        if (gmhVar != null) {
            gmhVar.a.remove(view);
        }
    }

    public final void q() {
        gmh gmhVar = this.b;
        if (gmhVar == null) {
            return;
        }
        r(gmhVar.d(false), false, false);
    }

    public final void r(final Pair pair, boolean z, boolean z2) {
        View view = (View) pair.first;
        WeakReference weakReference = (WeakReference) this.e.get(view);
        gmf gmfVar = weakReference == null ? null : (gmf) weakReference.get();
        gmf s = s();
        if (z || gmfVar == null || !gmfVar.oA(s)) {
            ayqx ayqxVar = this.i;
            if (ayqxVar != null && !ayqxVar.e()) {
                ayrz.c((AtomicReference) this.i);
            }
            ayph f = ayph.f();
            if (s != null && !s.oA(gmfVar)) {
                View h = h();
                gmh gmhVar = this.b;
                if (gmhVar != null && h != null) {
                    gmhVar.e(h);
                }
                n(null);
                f = f.c(s.oz(0));
            }
            if (gmfVar != null) {
                f = f.c(gmfVar.oz(true == z2 ? 2 : 1).o(new ayrm() { // from class: gmd
                    @Override // defpackage.ayrm
                    public final void a() {
                        ScrollSelectionController scrollSelectionController = ScrollSelectionController.this;
                        Pair pair2 = pair;
                        gmh gmhVar2 = scrollSelectionController.b;
                        if (gmhVar2 != null) {
                            View view2 = (View) pair2.first;
                            yjk.f();
                            if (gmhVar2.a.containsKey(view2)) {
                                String.valueOf(String.valueOf(view2)).length();
                                gmhVar2.a.put(view2, 2);
                            }
                        }
                        scrollSelectionController.n((Integer) pair2.second);
                    }
                }));
            }
            this.i = f.q(new ayrs() { // from class: gme
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    ScrollSelectionController.this.n(null);
                }
            }).p(new ayrm() { // from class: gmc
                @Override // defpackage.ayrm
                public final void a() {
                    ScrollSelectionController.this.n(null);
                }
            }).Q();
            this.g = new WeakReference(gmfVar);
            this.h = new WeakReference(view);
        }
    }
}
