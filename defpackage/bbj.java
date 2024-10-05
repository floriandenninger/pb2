package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bbj implements bbp, bbo {
    public final long a;
    public bbr b;
    public bbp c;
    public long d = -9223372036854775807L;
    public final ash e;
    private bbo f;
    private final bfg g;

    public bbj(ash ashVar, bfg bfgVar, long j) {
        this.e = ashVar;
        this.g = bfgVar;
        this.a = j;
    }

    private final long q(long j) {
        long j2 = this.d;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // defpackage.bbp
    public final long a(long j, poi poiVar) {
        bbp bbpVar = this.c;
        int i = pts.a;
        return bbpVar.a(j, poiVar);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final long c() {
        bbp bbpVar = this.c;
        int i = pts.a;
        return bbpVar.c();
    }

    @Override // defpackage.bbp
    public final long d() {
        bbp bbpVar = this.c;
        int i = pts.a;
        return bbpVar.d();
    }

    @Override // defpackage.bbp
    public final long e(long j) {
        bbp bbpVar = this.c;
        int i = pts.a;
        return bbpVar.e(j);
    }

    @Override // defpackage.bbp
    public final long f(bel[] belVarArr, boolean[] zArr, bcy[] bcyVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.d;
        if (j3 == -9223372036854775807L || j != this.a) {
            j2 = j;
        } else {
            this.d = -9223372036854775807L;
            j2 = j3;
        }
        bbp bbpVar = this.c;
        int i = pts.a;
        return bbpVar.f(belVarArr, zArr, bcyVarArr, zArr2, j2);
    }

    @Override // defpackage.bbp
    public final asj g() {
        bbp bbpVar = this.c;
        int i = pts.a;
        return bbpVar.g();
    }

    @Override // defpackage.bbp
    public final void h(long j, boolean z) {
        bbp bbpVar = this.c;
        int i = pts.a;
        bbpVar.h(j, z);
    }

    @Override // defpackage.bbp
    public final void i() {
        try {
            bbp bbpVar = this.c;
            if (bbpVar != null) {
                bbpVar.i();
                return;
            }
            bbr bbrVar = this.b;
            if (bbrVar != null) {
                bbrVar.s();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // defpackage.bcz
    public final /* bridge */ /* synthetic */ void j(bda bdaVar) {
        bbo bboVar = this.f;
        int i = pts.a;
        bboVar.j(this);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final long jJ() {
        bbp bbpVar = this.c;
        int i = pts.a;
        return bbpVar.jJ();
    }

    @Override // defpackage.bbo
    public final void k(bbp bbpVar) {
        bbo bboVar = this.f;
        int i = pts.a;
        bboVar.k(this);
    }

    @Override // defpackage.bbp
    public final void l(bbo bboVar, long j) {
        this.f = bboVar;
        bbp bbpVar = this.c;
        if (bbpVar != null) {
            bbpVar.l(this, q(this.a));
        }
    }

    @Override // defpackage.bbp, defpackage.bda
    public final void m(long j) {
        bbp bbpVar = this.c;
        int i = pts.a;
        bbpVar.m(j);
    }

    public final void n(ash ashVar) {
        long q = q(this.a);
        bbr bbrVar = this.b;
        pse.c(bbrVar);
        bbp v = bbrVar.v(ashVar, this.g, q);
        this.c = v;
        if (this.f != null) {
            v.l(this, q);
        }
    }

    @Override // defpackage.bbp, defpackage.bda
    public final boolean o(long j) {
        bbp bbpVar = this.c;
        return bbpVar != null && bbpVar.o(j);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final boolean p() {
        bbp bbpVar = this.c;
        return bbpVar != null && bbpVar.p();
    }
}
