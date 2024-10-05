package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class balr extends bajp implements Serializable {
    public static final bajp a = new balr();
    private static final long serialVersionUID = 2656707858124633367L;

    private balr() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.bajp
    public final int a(long j, long j2) {
        return aynu.w(aynu.z(j, j2));
    }

    @Override // defpackage.bajp
    public final long b(long j, int i) {
        return aynu.x(j, i);
    }

    @Override // defpackage.bajp
    public final long c(long j, long j2) {
        return aynu.x(j, j2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long e = ((bajp) obj).e();
        if (e == 1) {
            return 0;
        }
        return e > 1 ? -1 : 1;
    }

    @Override // defpackage.bajp
    public final long d(long j, long j2) {
        return aynu.z(j, j2);
    }

    @Override // defpackage.bajp
    public final long e() {
        return 1L;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof balr)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.bajp
    public final bajr f() {
        return bajr.l;
    }

    @Override // defpackage.bajp
    public final boolean g() {
        return true;
    }

    @Override // defpackage.bajp
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "DurationField[millis]";
    }
}
