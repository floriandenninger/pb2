package com.google.android.libraries.youtube.common.concurrent;

import defpackage.amml;
import defpackage.anfm;
import defpackage.anfq;
import defpackage.anhy;
import defpackage.any;
import defpackage.aoe;
import defpackage.aof;
import defpackage.aok;
import defpackage.yjk;
import defpackage.ynm;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class YouTubeFutures$LifecycleAwareFutureWrapper extends anfm implements any, amml {
    private final aoe a;
    private boolean b;
    private aof c;
    private amml d;
    private anhy e;

    public YouTubeFutures$LifecycleAwareFutureWrapper(aoe aoeVar, aof aofVar, anhy anhyVar, amml ammlVar) {
        yjk.f();
        this.a = aoeVar;
        this.c = aofVar;
        this.d = ammlVar;
        this.e = anfq.h(anhyVar, this, ynm.a);
        aofVar.getClass();
        this.c = aofVar;
        aofVar.b(this);
        qK(this.e);
    }

    private final void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        cancel(false);
        this.c.c(this);
        this.c = null;
        this.d = null;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.b) {
            return null;
        }
        return this.d.apply(obj);
    }

    @Override // defpackage.aoa
    public final void lc(aok aokVar) {
        if (aokVar.getLifecycle().a().a(this.a)) {
            return;
        }
        g();
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        if (aokVar.getLifecycle().a().a(this.a)) {
            return;
        }
        g();
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        if (aokVar.getLifecycle().a().a(this.a)) {
            return;
        }
        g();
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
