package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tev {
    private long a = 0;
    private long b;
    private long c;
    private long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized long a() {
        long j;
        j = this.d;
        this.d = 0L;
        return j;
    }

    public final synchronized long b(int i) {
        if (i == 1) {
            return this.a;
        }
        if (i != 2) {
            return this.c;
        }
        return this.b;
    }

    public final synchronized long c() {
        return this.d;
    }

    public final synchronized void d(long j) {
        this.a += j;
        this.d += j;
        long j2 = 0;
        if (j > 0) {
            j2 = this.b + j;
            this.b = j2;
        } else {
            this.b = 0L;
        }
        this.c = Math.max(this.c, j2);
    }

    public final synchronized void e() {
        this.b = 0L;
    }

    public final synchronized void f() {
        this.d = 0L;
    }
}
