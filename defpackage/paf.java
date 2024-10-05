package defpackage;

import com.google.android.exoplayer.MediaFormat;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class paf {
    public final boolean a;
    public final ozm b;
    public pav c;
    public pah d;
    public MediaFormat e;
    public final long f;
    public long g;
    public int h;

    public paf(pag pagVar, long j, long j2, pav pavVar) {
        this.f = j;
        this.g = j2;
        this.c = pavVar;
        String str = pavVar.e.b;
        boolean m = pag.m(str);
        this.a = m;
        this.b = m ? null : new ozm(pagVar.l(str));
        this.d = pavVar.h();
    }

    public final int a() {
        return this.d.b(this.g);
    }

    public final long b(int i) {
        return c(i) + this.d.d(i - this.h, this.g);
    }

    public final long c(int i) {
        return this.d.e(i - this.h) + this.f;
    }

    public final pas d(int i) {
        return this.d.f(i - this.h);
    }

    public final boolean e(int i) {
        int a = a();
        return a != -1 && i > a + this.h;
    }
}
