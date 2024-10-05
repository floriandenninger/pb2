package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zsd {
    public long a;
    public long b;

    public zsd() {
    }

    public zsd(long j, long j2) {
        amkq.E(j <= j2);
        this.a = j;
        this.b = j2;
    }

    public zsd(byte[] bArr) {
        this.b = -1L;
        this.a = -1L;
    }

    public final long a() {
        qip.ao(this.a != -1);
        return TimeUnit.NANOSECONDS.toMillis(b() - this.a);
    }

    public final long b() {
        long j = this.b;
        if (j == -1) {
            return System.nanoTime();
        }
        this.b = -1L;
        return j;
    }

    public final void c() {
        this.a = b();
    }
}
