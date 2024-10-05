package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bcs {
    public final long a;
    public final long b;
    public boolean c;
    public bcs d;
    public pdp e;

    public bcs(long j, int i) {
        this.a = j;
        this.b = j + i;
    }

    public final int a(long j) {
        long j2 = this.a;
        int i = this.e.a;
        return (int) (j - j2);
    }

    public final bcs b() {
        this.e = null;
        bcs bcsVar = this.d;
        this.d = null;
        return bcsVar;
    }
}
