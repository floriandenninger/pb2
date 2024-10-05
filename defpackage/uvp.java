package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uvp {
    final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    final boolean g;
    public final boolean h;
    final amml i;

    public uvp(Uri uri) {
        this(uri, "", "", false, false, false);
    }

    public uvp(Uri uri, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = null;
        this.b = uri;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = false;
        this.h = z3;
        this.i = null;
    }

    public final uvp a() {
        if (!this.c.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new uvp(this.b, this.c, this.d, true, this.f, this.h);
    }

    public final uvr b(String str, double d) {
        return new uvl(this, str, Double.valueOf(d));
    }

    public final uvr c(String str, long j) {
        return new uvj(this, str, Long.valueOf(j));
    }

    public final uvr d(String str, String str2) {
        return new uvm(this, str, str2);
    }

    public final uvr e(String str, boolean z) {
        return new uvk(this, str, Boolean.valueOf(z));
    }

    public final uvr f(String str, Object obj, uvo uvoVar) {
        return uvr.b(this, str, obj, uvoVar, true);
    }
}
