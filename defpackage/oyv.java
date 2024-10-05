package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oyv implements oyw {
    private final long a;
    private final long b;

    public oyv(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.oyw
    public final long[] a(long[] jArr) {
        if (jArr == null) {
            jArr = new long[2];
        }
        jArr[0] = this.a;
        jArr[1] = this.b;
        return jArr;
    }

    @Override // defpackage.oyw
    public final long[] b() {
        long[] a = a(null);
        a[0] = a[0] / 1000;
        a[1] = a[1] / 1000;
        return a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oyv oyvVar = (oyv) obj;
            if (oyvVar.a == this.a && oyvVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((int) this.a) + 527) * 31) + ((int) this.b);
    }
}
