package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class txc {
    public final long a;
    public final String b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public txc() {
    }

    public txc(long j, String str, long j2, int i, int i2, int i3, int i4, long j3) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.d = j3;
    }

    public static twt a() {
        twt twtVar = new twt();
        twtVar.b(0L);
        twtVar.g(1);
        twtVar.f(1);
        twtVar.e(1);
        twtVar.h(1);
        twtVar.a = 0L;
        twtVar.c(0L);
        return twtVar;
    }

    public static txc c(long j, String str, long j2, int i, int i2, int i3, int i4, long j3) {
        twt a = a();
        a.b(j);
        a.d(str);
        a.a = Long.valueOf(j2);
        a.g(i);
        a.f(i2);
        a.e(i3);
        a.h(i4);
        a.c(j3);
        return a.a();
    }

    public final twt b() {
        return new twt(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof txc) {
            txc txcVar = (txc) obj;
            if (this.a == txcVar.a && this.b.equals(txcVar.b) && this.c == txcVar.c) {
                int i = this.e;
                int i2 = txcVar.e;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.f;
                    int i4 = txcVar.f;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4) {
                        int i5 = this.g;
                        int i6 = txcVar.g;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i5 == i6) {
                            int i7 = this.h;
                            int i8 = txcVar.h;
                            if (i7 == 0) {
                                throw null;
                            }
                            if (i7 == i8 && this.d == txcVar.d) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = this.b.hashCode();
        long j2 = this.c;
        int i = this.e;
        aobq.v(i);
        int i2 = this.f;
        aobq.y(i2);
        int i3 = this.g;
        aobq.B(i3);
        int i4 = this.h;
        aobq.q(i4);
        long j3 = this.d;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String str = this.b;
        long j2 = this.c;
        int i = this.e;
        String u = i != 0 ? aobq.u(i) : "null";
        int i2 = this.f;
        String x = i2 != 0 ? aobq.x(i2) : "null";
        int i3 = this.g;
        String A = i3 != 0 ? aobq.A(i3) : "null";
        int i4 = this.h;
        String p = i4 != 0 ? aobq.p(i4) : "null";
        long j3 = this.d;
        int length = String.valueOf(str).length();
        int length2 = u.length();
        StringBuilder sb = new StringBuilder(length + 199 + length2 + x.length() + A.length() + p.length());
        sb.append("ChimeThreadState{id=");
        sb.append(j);
        sb.append(", threadId=");
        sb.append(str);
        sb.append(", lastUpdatedVersion=");
        sb.append(j2);
        sb.append(", readState=");
        sb.append(u);
        sb.append(", deletionStatus=");
        sb.append(x);
        sb.append(", countBehavior=");
        sb.append(A);
        sb.append(", systemTrayBehavior=");
        sb.append(p);
        sb.append(", modifiedTimestamp=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }
}
