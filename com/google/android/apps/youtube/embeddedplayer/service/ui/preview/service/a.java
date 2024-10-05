package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

import android.net.Uri;
import defpackage.afwu;
import defpackage.ahbw;
import defpackage.avgg;
import defpackage.ykn;
import defpackage.ykt;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class a {
    protected afwu a;
    final /* synthetic */ e b;
    private ykn c;

    public a(e eVar) {
        this.b = eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        ykn yknVar = this.c;
        if (yknVar != null) {
            yknVar.d();
            this.c = null;
        }
        afwu afwuVar = this.a;
        if (afwuVar != null) {
            afwuVar.d();
            this.a = null;
        }
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(avgg avggVar, String str) {
        Uri B = ahbw.B(avggVar);
        if (B == null) {
            this.b.c();
            return;
        }
        this.c = ykn.c(new c(this.b, str));
        e eVar = this.b;
        eVar.b.l(B, ykt.c(eVar.a, this.c));
    }

    public abstract boolean j();

    public abstract boolean k();
}
