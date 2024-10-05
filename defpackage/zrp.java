package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zrp {
    public long a;
    private long b;
    private long c;

    public final void a(long j) {
        this.b++;
        b(j);
    }

    public final void b(long j) {
        if (j - this.c > 1000) {
            this.c = j;
            this.b = 0L;
            this.a = 0L;
        }
    }
}
