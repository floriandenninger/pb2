package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service;

import defpackage.afwx;
import defpackage.arwh;
import defpackage.arwn;
import defpackage.avaa;
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
        b bVar = this.a;
        this.a.c.w(b.a(bVar.b(bVar.b.d)));
        this.a.g = false;
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        avaa avaaVar;
        arwn arwnVar = (arwn) obj;
        b bVar = this.a;
        arwh arwhVar = arwnVar.f;
        if (arwhVar == null) {
            arwhVar = arwh.a;
        }
        if (arwhVar.b == 136076983) {
            avaaVar = (avaa) arwhVar.c;
        } else {
            avaaVar = avaa.a;
        }
        bVar.d(avaaVar);
        if (!arwnVar.d.isEmpty()) {
            this.a.a.b(arwnVar.d);
        }
        this.a.g = false;
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
