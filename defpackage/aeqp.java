package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeqp {
    public final long a;
    public final int b;

    public aeqp(int i, long j) {
        this.b = i;
        this.a = j;
    }

    public aeqp(int i, long j, byte[] bArr) {
        this.b = i;
        this.a = j;
    }

    public aeqp(int i, long j, char[] cArr) {
        this.b = i;
        this.a = j;
    }

    public aeqp(int i, long j, short[] sArr) {
        this.b = i;
        this.a = j;
    }

    public aeqp(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static aeqp a(long j, long j2, int i) {
        return new aeqp(Math.max(0L, j - j2), i);
    }

    public static aeqp d(pbw pbwVar, pgx pgxVar) {
        pbwVar.g(pgxVar.a, 0, 8);
        pgxVar.z(0);
        return new aeqp(pgxVar.c(), pgxVar.l(), (short[]) null);
    }

    public static aeqp e(bii biiVar, pth pthVar) {
        biiVar.j(pthVar.a, 0, 8);
        pthVar.G(0);
        return new aeqp(pthVar.d(), pthVar.n(), (short[]) null);
    }

    public final int b() {
        int i;
        long j = this.a;
        if (j <= 0 || (i = this.b) <= 0) {
            return 0;
        }
        double d = i;
        Double.isNaN(d);
        double d2 = j;
        Double.isNaN(d2);
        return (int) ((d * 8000000.0d) / d2);
    }

    public final boolean c() {
        int i = this.b;
        return i == 0 || i == 1;
    }
}
