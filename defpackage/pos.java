package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pos implements plg {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public asb g = asb.a;

    public final int a(int i) {
        return this.g.a(i).b;
    }

    public final int b(long j) {
        asb asbVar = this.g;
        long j2 = this.d;
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = asbVar.d;
        int i2 = asbVar.b;
        int i3 = asbVar.b;
        return -1;
    }

    public final int c(int i) {
        return this.g.a(i).a();
    }

    public final long d(int i, int i2) {
        asa a = this.g.a(i);
        if (a.b != -1) {
            return a.e[i2];
        }
        return -9223372036854775807L;
    }

    public final void e(Object obj, Object obj2, long j, long j2) {
        i(obj, obj2, j, j2, asb.a, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            pos posVar = (pos) obj;
            if (pts.R(this.a, posVar.a) && pts.R(this.b, posVar.b) && this.c == posVar.c && this.d == posVar.d && this.e == posVar.e && this.f == posVar.f && pts.R(this.g, posVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i) {
        long j = this.g.a(i).a;
    }

    public final void g() {
        long j = this.g.c;
    }

    public final void h(int i) {
        boolean z = this.g.a(i).g;
    }

    public final void i(Object obj, Object obj2, long j, long j2, asb asbVar, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = 0;
        this.d = j;
        this.e = j2;
        this.g = asbVar;
        this.f = z;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.b;
        int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
        int i = this.c;
        long j = this.d;
        long j2 = this.e;
        return ((((((((((hashCode + hashCode2) * 31) + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f ? 1 : 0)) * 31) + this.g.hashCode();
    }
}
