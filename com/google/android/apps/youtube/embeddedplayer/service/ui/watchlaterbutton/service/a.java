package com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service;

import defpackage.afsi;
import defpackage.afwx;
import defpackage.arzb;
import defpackage.cnq;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class a implements afwx {
    final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.a.i = false;
        afsi.c(1, 4, "Edit playlist error.", cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        arzb arzbVar = (arzb) obj;
        this.a.i = false;
        if (arzbVar.f.size() > 0) {
            this.a.a.b(arzbVar.f);
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
