package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

import defpackage.abdh;
import defpackage.afwu;
import defpackage.afwx;
import defpackage.alta;
import defpackage.asck;
import defpackage.cnq;
import defpackage.zga;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class d extends a implements afwx {
    final /* synthetic */ e c;
    private final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str) {
        super(eVar);
        this.c = eVar;
        this.d = str;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final void e() {
        alta.C("Ignoring call to first() on YouTubeThumbnailView due to no playlist being set.", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final void f() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final void g() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final void h() {
        abdh n = this.c.e.n();
        n.a = this.d;
        this.a = new afwu(this);
        this.c.e.o(n, this.a);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final boolean j() {
        return false;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a
    public final boolean k() {
        return false;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        zga.d("Error loading ApiThumbnailLoader", cnqVar);
        this.c.c();
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        i(e.a((asck) obj), this.d);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
