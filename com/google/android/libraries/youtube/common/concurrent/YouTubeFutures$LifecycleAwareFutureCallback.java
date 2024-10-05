package com.google.android.libraries.youtube.common.concurrent;

import defpackage.anhh;
import defpackage.any;
import defpackage.aoe;
import defpackage.aof;
import defpackage.aok;
import defpackage.zfi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YouTubeFutures$LifecycleAwareFutureCallback implements anhh, any {
    private final aoe a;
    private boolean b;
    private aof c;
    private zfi d;
    private zfi e;

    public YouTubeFutures$LifecycleAwareFutureCallback(aoe aoeVar, aof aofVar, zfi zfiVar, zfi zfiVar2) {
        aoeVar.getClass();
        this.a = aoeVar;
        aofVar.getClass();
        this.c = aofVar;
        this.d = zfiVar;
        this.e = zfiVar2;
        aofVar.b(this);
    }

    private final void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c.c(this);
        this.c = null;
        this.d = null;
        this.e = null;
    }

    @Override // defpackage.anhh
    public final void b(Object obj) {
        if (!this.b) {
            this.d.a(obj);
        }
        g();
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

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        if (!this.b) {
            this.e.a(th);
        }
        g();
    }
}
