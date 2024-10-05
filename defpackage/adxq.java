package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxq implements Comparable {
    public final long a;
    public long b;

    public adxq(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean a(adxq adxqVar) {
        return adxqVar != null && this.b >= adxqVar.a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        adxq adxqVar = (adxq) obj;
        int compareTo = Long.valueOf(this.a).compareTo(Long.valueOf(adxqVar.a));
        return compareTo == 0 ? Long.valueOf(this.b).compareTo(Long.valueOf(adxqVar.b)) : compareTo;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adxq)) {
            return false;
        }
        adxq adxqVar = (adxq) obj;
        return this.a == adxqVar.a && this.b == adxqVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
    }
}
