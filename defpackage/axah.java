package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axah implements awzu {
    private final awzu a;
    private final long b;
    private final long c;
    private long d;
    private long e;

    public axah(awzu awzuVar, int i) {
        amkq.F(i > 0, "Chunk granularity must be greater than 0.");
        long j = i;
        amkq.F(j < awzuVar.d(), "Chunk granularity must be smaller than the read ahead limit.");
        long e = awzuVar.e();
        long a = awzuVar.a();
        if (a < 0) {
            while (awzuVar.i() && awzuVar.e() - awzuVar.c() < awzuVar.d()) {
                awzuVar.f(awzuVar.d());
            }
            a = awzuVar.e();
            awzuVar.h();
            awzuVar.f(e - awzuVar.c());
        } else {
            long c = awzuVar.c() + awzuVar.d();
            if (c > 0 && c < a) {
                a = c;
            }
        }
        long j2 = ((a - e) / j) * j;
        if (awzuVar.d() < Long.MAX_VALUE) {
            amkq.E(j2 <= awzuVar.d() - (awzuVar.e() - awzuVar.c()));
        }
        this.a = awzuVar;
        this.b = awzuVar.e();
        this.c = j2;
    }

    @Override // defpackage.awzu
    public final synchronized long a() {
        return this.c;
    }

    @Override // defpackage.awzu
    public final synchronized int b(byte[] bArr, int i, int i2) {
        int b;
        amkq.F(bArr.length - i >= i2, "Cannot read into a buffer smaller than given length");
        int min = (int) Math.min(i2, this.c - this.d);
        if (this.b + this.d != this.a.e()) {
            this.a.h();
            long c = (this.b - this.a.c()) + this.d;
            while (c > 0) {
                c -= this.a.f(c);
            }
        }
        b = this.a.b(bArr, i, min);
        this.d += b;
        return b;
    }

    @Override // defpackage.awzu
    public final synchronized long c() {
        return this.e;
    }

    @Override // defpackage.awzu, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    @Override // defpackage.awzu
    public final synchronized long d() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.awzu
    public final synchronized long e() {
        return this.d;
    }

    @Override // defpackage.awzu
    public final synchronized long f(long j) {
        long f;
        long min = Math.min(j, this.c - this.d);
        if (this.b + this.d != this.a.e()) {
            this.a.h();
            long c = (this.b - this.a.c()) + this.d;
            while (c > 0) {
                c -= this.a.f(c);
            }
        }
        f = this.a.f(min);
        this.d += f;
        return f;
    }

    @Override // defpackage.awzu
    public final synchronized void g() {
        this.e = this.d;
    }

    @Override // defpackage.awzu
    public final synchronized void h() {
        this.d = this.e;
    }

    @Override // defpackage.awzu
    public final synchronized boolean i() {
        return this.d < this.c;
    }
}
