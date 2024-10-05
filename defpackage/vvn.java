package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vvn {
    public final long a;
    public final String b;
    public final byte[] c;
    public final long d;
    public final long e;
    public final boolean f;

    public vvn(long j, String str, byte[] bArr, long j2, long j3, boolean z) {
        this.a = j;
        this.b = str;
        this.c = bArr;
        this.d = j2;
        this.e = j3;
        this.f = z;
    }

    public static vvn a(vvj vvjVar) {
        boolean z;
        long c = vvjVar.c();
        long j = vvjVar.c;
        long d = vvjVar.d();
        String g = vvjVar.g();
        if (d == 1) {
            d = vvjVar.e();
            z = true;
        } else {
            z = false;
        }
        return new vvn(d, g, g.equals("uuid") ? vvjVar.l(16) : null, c, vvjVar.c - j, z);
    }
}
