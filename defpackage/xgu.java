package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xgu {
    public final long a;
    public final long b;

    public xgu(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean a(long j) {
        return this.a <= j && this.b >= j;
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(44);
        sb.append("[");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
