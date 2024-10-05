package com.google.android.apps.youtube.app.extensions.reel.watch.overlay;

import defpackage.any;
import defpackage.aok;
import defpackage.ili;
import defpackage.ilm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReelPauseLifecycleObserver implements any {
    private final ili a;
    private final ilm b;
    private int c = 0;

    public ReelPauseLifecycleObserver(ili iliVar, ilm ilmVar) {
        this.a = iliVar;
        this.b = ilmVar;
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        this.c = this.a.b();
        if (this.b.aG() != null) {
            this.b.aG().d.a(false);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.a.c(this.c);
        this.c = 0;
        if (this.b.aG() != null) {
            this.b.aG().d.a(true);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
