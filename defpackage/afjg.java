package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afjg implements pgf {
    public final ate a;

    public afjg(ate ateVar) {
        this.a = ateVar;
    }

    @Override // defpackage.pfq
    public final int a(byte[] bArr, int i, int i2) {
        return this.a.g(bArr, i, i2);
    }

    @Override // defpackage.pfq
    public final long b(pfs pfsVar) {
        ate ateVar = this.a;
        Uri uri = pfsVar.a;
        byte[] bArr = pfsVar.b;
        return ateVar.h(new ath(uri, pfsVar.c, pfsVar.d, pfsVar.e, pfsVar.f, pfsVar.g, null));
    }

    @Override // defpackage.pfq
    public final void c() {
        this.a.j();
    }
}
