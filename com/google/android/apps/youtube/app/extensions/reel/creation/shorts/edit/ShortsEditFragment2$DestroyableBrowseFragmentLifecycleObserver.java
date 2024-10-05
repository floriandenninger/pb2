package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit;

import defpackage.any;
import defpackage.aok;
import defpackage.hgo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver implements any {
    public hgo a;
    public boolean b;
    private int c = 0;

    public ShortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver(hgo hgoVar) {
        this.a = hgoVar;
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
        hgo hgoVar;
        int i = this.c - 1;
        this.c = i;
        if (i == 0 && (hgoVar = this.a) != null && this.b) {
            hgoVar.f();
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.c++;
        hgo hgoVar = this.a;
        if (hgoVar == null || !this.b) {
            return;
        }
        hgoVar.e();
    }
}
