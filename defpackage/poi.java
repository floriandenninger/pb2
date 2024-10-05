package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class poi {
    public static final poi a;
    public static final poi b;
    public static final poi c;
    public final long d;
    public final long e;

    static {
        poi poiVar = new poi(0L, 0L);
        a = poiVar;
        new poi(Long.MAX_VALUE, Long.MAX_VALUE);
        b = new poi(Long.MAX_VALUE, 0L);
        new poi(0L, Long.MAX_VALUE);
        c = poiVar;
    }

    public poi(long j, long j2) {
        pse.e(j >= 0);
        pse.e(j2 >= 0);
        this.d = j;
        this.e = j2;
    }

    public final long a(long j, long j2, long j3) {
        long j4 = this.d;
        if (j4 == 0 && this.e == 0) {
            return j;
        }
        long at = pts.at(j, j4);
        long ai = pts.ai(j, this.e);
        boolean z = at <= j2 && j2 <= ai;
        boolean z2 = at <= j3 && j3 <= ai;
        return (z && z2) ? Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3 : z ? j2 : z2 ? j3 : at;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            poi poiVar = (poi) obj;
            if (this.d == poiVar.d && this.e == poiVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.d) * 31) + ((int) this.e);
    }
}
