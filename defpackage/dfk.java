package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfk {
    public long a;
    public final long b;

    public dfk(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(61);
        sb.append("Entry{count=");
        sb.append(j);
        sb.append(", delta=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
