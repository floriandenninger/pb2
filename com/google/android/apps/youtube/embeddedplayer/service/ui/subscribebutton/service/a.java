package com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.service;

import defpackage.afsi;
import defpackage.afwx;
import defpackage.arwh;
import defpackage.asbp;
import defpackage.asbr;
import defpackage.auzh;
import defpackage.avaa;
import defpackage.cnq;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class a implements afwx {
    final /* synthetic */ b a;
    private final /* synthetic */ int b;

    public a(b bVar, int i) {
        this.b = i;
        this.a = bVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        avaa avaaVar;
        if (this.b == 0) {
            b bVar = this.a;
            bVar.c(bVar.a());
            b bVar2 = this.a;
            auzh auzhVar = bVar2.b.p;
            if (auzhVar == null) {
                auzhVar = auzh.a;
            }
            if (auzhVar.b == 136076983) {
                avaaVar = (avaa) auzhVar.c;
            } else {
                avaaVar = avaa.a;
            }
            bVar2.d(avaaVar);
            this.a.l = false;
            afsi.c(1, 4, "Unsubscribe error.", cnqVar);
            return;
        }
        b bVar3 = this.a;
        bVar3.c(bVar3.a());
        this.a.l = false;
        afsi.c(1, 4, "Subscribe error.", cnqVar);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }

    @Override // defpackage.cnl
    public final /* synthetic */ void kZ(Object obj) {
        avaa avaaVar;
        if (this.b == 0) {
            asbr asbrVar = (asbr) obj;
            b bVar = this.a;
            bVar.c = 2;
            bVar.l = false;
            if (asbrVar.e.size() != 0) {
                this.a.a.b(asbrVar.e);
                return;
            }
            return;
        }
        asbp asbpVar = (asbp) obj;
        b bVar2 = this.a;
        bVar2.c = 3;
        bVar2.l = false;
        b bVar3 = this.a;
        arwh arwhVar = asbpVar.g;
        if (arwhVar == null) {
            arwhVar = arwh.a;
        }
        if (arwhVar.b == 136076983) {
            avaaVar = (avaa) arwhVar.c;
        } else {
            avaaVar = avaa.a;
        }
        bVar3.d(avaaVar);
        if (asbpVar.e.size() != 0) {
            this.a.a.b(asbpVar.e);
        }
    }
}
