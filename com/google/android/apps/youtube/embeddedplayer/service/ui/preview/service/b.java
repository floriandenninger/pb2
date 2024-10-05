package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

import defpackage.abdh;
import defpackage.afwu;
import defpackage.afwx;
import defpackage.asch;
import defpackage.asci;
import defpackage.asck;
import defpackage.ascl;
import defpackage.ascm;
import defpackage.avgg;
import defpackage.cnq;
import defpackage.zga;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class b extends a implements afwx {
    final /* synthetic */ e c;
    private final String d;
    private int e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, String str, int i) {
        super(eVar);
        this.c = eVar;
        this.f = -1;
        this.d = str;
        this.e = i;
    }

    private final void l(int i) {
        d();
        this.e = i;
        h();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final void e() {
        l(0);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final void f() {
        l(this.e + 1);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final void g() {
        l(this.e - 1);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final void h() {
        abdh n = this.c.e.n();
        n.b = this.d;
        n.c = this.e;
        this.a = new afwu(this);
        this.c.e.o(n, this.a);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final boolean j() {
        return this.e < this.f + (-1);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final boolean k() {
        return this.e > 0;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        zga.d("Error loading ApiThumbnailLoader", cnqVar);
        this.c.c();
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        ascm ascmVar;
        asck asckVar = (asck) obj;
        asch aschVar = asckVar.d;
        if (aschVar == null) {
            aschVar = asch.a;
        }
        ascl asclVar = aschVar.b;
        if (asclVar == null) {
            asclVar = ascl.a;
        }
        this.f = (int) asclVar.b;
        avgg a = e.a(asckVar);
        asci asciVar = asckVar.c;
        if (asciVar == null) {
            asciVar = asci.a;
        }
        if (asciVar.b == 87079103) {
            ascmVar = (ascm) asciVar.c;
        } else {
            ascmVar = ascm.a;
        }
        i(a, ascmVar.c);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
