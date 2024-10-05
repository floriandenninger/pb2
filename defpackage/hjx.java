package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hjx implements hke {
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final Rect e = new Rect();
    public long f;
    public long g;
    private final hkg h;

    public hjx(hkg hkgVar, String str, long j, int i, int i2, long j2, long j3) {
        this.h = hkgVar;
        this.a = str;
        this.d = j;
        this.b = i;
        this.c = i2;
        this.f = j2;
        this.g = j3;
    }

    @Override // defpackage.hke
    public final long a() {
        return this.d;
    }

    public final void b(long j) {
        this.g = j;
        this.h.d.k(this.d, j);
    }

    public final void c(long j) {
        this.f = j;
        this.h.d.l(this.d, j);
    }
}
