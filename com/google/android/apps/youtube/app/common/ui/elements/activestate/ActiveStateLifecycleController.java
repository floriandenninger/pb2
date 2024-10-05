package com.google.android.apps.youtube.app.common.ui.elements.activestate;

import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateLifecycleController;
import defpackage.any;
import defpackage.aok;
import defpackage.ayph;
import defpackage.ayqx;
import defpackage.ayrm;
import defpackage.ayrz;
import defpackage.azrj;
import defpackage.ci;
import defpackage.evr;
import defpackage.gem;
import defpackage.gen;
import defpackage.geo;
import defpackage.ges;
import defpackage.get;
import defpackage.zga;
import defpackage.zik;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActiveStateLifecycleController implements any {
    public final Executor a;
    public final ArrayList b;
    public final List c;
    public final ci d;
    public ayqx e;
    private final zik f = zik.a(geo.a);
    private get g;
    private azrj h;

    public ActiveStateLifecycleController(Executor executor, ci ciVar) {
        executor.getClass();
        this.a = executor;
        this.d = ciVar;
        this.c = Collections.synchronizedList(new ArrayList());
        this.b = new ArrayList();
        this.g = get.INACTIVE;
    }

    public final ayph g(final get getVar) {
        String.valueOf(String.valueOf(getVar)).length();
        if (i()) {
            zga.c("Could not transition, request is blocked %s", this.b.toString());
        }
        for (gem gemVar : this.c) {
            this.b.add(gemVar);
            gen genVar = new gen(this, gemVar, getVar);
            if (getVar != get.ACTIVE || evr.ai(gemVar.b) <= 0) {
                gemVar.a();
            } else {
                gemVar.a();
                gemVar.a.sendEmptyMessageDelayed(153535, evr.ai(gemVar.b));
                gemVar.c = genVar;
                if (!getVar.equals(get.INACTIVE)) {
                    String.valueOf(String.valueOf(gemVar)).length();
                }
            }
            j(gemVar);
        }
        if (!i()) {
            this.a.execute(new Runnable() { // from class: ger
                @Override // java.lang.Runnable
                public final void run() {
                    ActiveStateLifecycleController.this.h(getVar);
                }
            });
        }
        this.h = azrj.W();
        if (getVar.equals(get.INACTIVE)) {
            return ayph.f();
        }
        return this.h.p(new ayrm() { // from class: geq
            @Override // defpackage.ayrm
            public final void a() {
                ActiveStateLifecycleController.this.b.clear();
            }
        });
    }

    public final void h(get getVar) {
        azrj azrjVar;
        get getVar2 = this.g;
        this.g = getVar;
        String valueOf = String.valueOf(getVar2);
        String valueOf2 = String.valueOf(this.g);
        String.valueOf(valueOf).length();
        String.valueOf(valueOf2).length();
        this.f.b(ges.a(getVar2, this.g));
        if (getVar != get.ACTIVE || (azrjVar = this.h) == null) {
            return;
        }
        azrjVar.sh();
    }

    public final boolean i() {
        return !this.b.isEmpty();
    }

    public final void j(gem gemVar) {
        this.b.remove(gemVar);
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

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        ayqx ayqxVar = this.e;
        if (ayqxVar == null || ayqxVar.e()) {
            return;
        }
        ayrz.c((AtomicReference) this.e);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
