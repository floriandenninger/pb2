package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pnh {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final ash i;

    public pnh(ash ashVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        pse.e(!z4 || z2);
        pse.e(!z3 || z2);
        pse.e(true);
        this.i = ashVar;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = false;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public final pnh a(long j) {
        return j == this.b ? this : new pnh(this.i, this.a, j, this.c, this.d, false, this.f, this.g, this.h);
    }

    public final pnh b(long j) {
        return j == this.a ? this : new pnh(this.i, j, this.b, this.c, this.d, false, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            pnh pnhVar = (pnh) obj;
            if (this.a == pnhVar.a && this.b == pnhVar.b && this.c == pnhVar.c && this.d == pnhVar.d && this.f == pnhVar.f && this.g == pnhVar.g && this.h == pnhVar.h && pts.R(this.i, pnhVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.i.hashCode() + 527) * 31) + ((int) this.a)) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 961) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
