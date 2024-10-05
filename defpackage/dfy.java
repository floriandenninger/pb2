package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfy {
    public long a;
    public long b;
    public dft c;
    public long d;

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        String valueOf = String.valueOf(this.c);
        long j3 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 108);
        sb.append("Entry{duration=");
        sb.append(j);
        sb.append(", size=");
        sb.append(j2);
        sb.append(", dlags=");
        sb.append(valueOf);
        sb.append(", compTimeOffset=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }
}
