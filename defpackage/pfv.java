package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pfv implements pgf {
    private final pgf a;
    private final pgf b = new pfx(null);
    private final pgf c;
    private final pgf d;
    private pgf e;

    public pfv(Context context, String str) {
        this.a = new pfu(str);
        this.c = new pfm(context);
        this.d = new pfp(context);
    }

    @Override // defpackage.pfq
    public final int a(byte[] bArr, int i, int i2) {
        return this.e.a(bArr, i, i2);
    }

    @Override // defpackage.pfq
    public final long b(pfs pfsVar) {
        opn.k(this.e == null);
        String scheme = pfsVar.a.getScheme();
        if (pgz.q(pfsVar.a)) {
            if (pfsVar.a.getPath().startsWith("/android_asset/")) {
                this.e = this.c;
            } else {
                this.e = this.b;
            }
        } else if ("asset".equals(scheme)) {
            this.e = this.c;
        } else {
            this.e = "content".equals(scheme) ? this.d : this.a;
        }
        return this.e.b(pfsVar);
    }

    @Override // defpackage.pfq
    public final void c() {
        pgf pgfVar = this.e;
        if (pgfVar != null) {
            try {
                pgfVar.c();
            } finally {
                this.e = null;
            }
        }
    }
}
