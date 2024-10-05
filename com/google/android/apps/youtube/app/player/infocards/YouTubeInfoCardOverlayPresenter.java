package com.google.android.apps.youtube.app.player.infocards;

import defpackage.aabi;
import defpackage.aabl;
import defpackage.aabn;
import defpackage.aabq;
import defpackage.ahsl;
import defpackage.any;
import defpackage.aok;
import defpackage.ksf;
import defpackage.xjl;
import defpackage.ypa;
import defpackage.zaz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class YouTubeInfoCardOverlayPresenter extends aabl implements ksf, any {
    public boolean a;
    private final ypa j;

    public YouTubeInfoCardOverlayPresenter(aabi aabiVar, zaz zazVar, aabq aabqVar, aabn aabnVar, xjl xjlVar, ahsl ahslVar, ypa ypaVar) {
        super(aabiVar, zazVar, aabqVar, aabnVar, xjlVar, ahslVar);
        ypaVar.getClass();
        this.j = ypaVar;
    }

    @Override // defpackage.ksf
    public final void g(int i, boolean z) {
        boolean z2 = i != 0;
        this.a = z2;
        if (z2) {
            h(false);
        }
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
        this.j.m(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.j.h(this, aabl.class);
    }
}
