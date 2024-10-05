package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dff {
    public long a;
    public int b;
    public int c;
    public long d;

    public final String toString() {
        long j = this.a;
        int i = this.b;
        int i2 = this.c;
        long j2 = this.d;
        StringBuilder sb = new StringBuilder(137);
        sb.append("SubsampleEntry{subsampleSize=");
        sb.append(j);
        sb.append(", subsamplePriority=");
        sb.append(i);
        sb.append(", discardable=");
        sb.append(i2);
        sb.append(", reserved=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
