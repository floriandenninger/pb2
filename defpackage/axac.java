package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class axac implements awzu {
    private final InputStream a;
    private long b;
    private long c;
    private boolean d;
    private long e;

    public axac(InputStream inputStream) {
        this(inputStream, -1L);
    }

    @Override // defpackage.awzu
    public synchronized long a() {
        return this.e;
    }

    @Override // defpackage.awzu
    public final synchronized int b(byte[] bArr, int i, int i2) {
        amkq.F(bArr.length - i >= i2, "Cannot read into a buffer smaller than given length");
        if (i2 == 0) {
            return 0;
        }
        if (this.d) {
            this.a.reset();
            this.d = false;
        }
        int read = this.a.read(bArr, i, (int) Math.min(i2, 1048576 - (this.c - this.b)));
        if (read == -1) {
            long j = this.e;
            if (j == -1) {
                this.e = this.c;
            } else if (this.c < j) {
                throw new IOException("The stream ended before all expected bytes were read");
            }
            return 0;
        }
        long j2 = this.c + read;
        this.c = j2;
        long j3 = this.e;
        if (j3 != -1 && j2 > j3) {
            throw new IOException("The stream continues beyond expected size");
        }
        return read;
    }

    @Override // defpackage.awzu
    public final synchronized long c() {
        return this.b;
    }

    @Override // defpackage.awzu, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    @Override // defpackage.awzu
    public final synchronized long d() {
        return 1048576L;
    }

    @Override // defpackage.awzu
    public final synchronized long e() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (i() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        r2 = r6.a.skip(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r2 == 0) goto L29;
     */
    @Override // defpackage.awzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized long f(long r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r2 = r6.c     // Catch: java.lang.Throwable -> L43
            long r4 = r6.b     // Catch: java.lang.Throwable -> L43
            long r2 = r2 - r4
            long r0 = r0 - r2
            long r7 = java.lang.Math.min(r7, r0)     // Catch: java.lang.Throwable -> L43
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto L16
            monitor-exit(r6)
            return r0
        L16:
            boolean r2 = r6.d     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L22
            java.io.InputStream r2 = r6.a     // Catch: java.lang.Throwable -> L43
            r2.reset()     // Catch: java.lang.Throwable -> L43
            r2 = 0
            r6.d = r2     // Catch: java.lang.Throwable -> L43
        L22:
            java.io.InputStream r2 = r6.a     // Catch: java.lang.Throwable -> L43
            long r2 = r2.skip(r7)     // Catch: java.lang.Throwable -> L43
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L3c
            boolean r4 = r6.i()     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L3c
        L32:
            java.io.InputStream r2 = r6.a     // Catch: java.lang.Throwable -> L43
            long r2 = r2.skip(r7)     // Catch: java.lang.Throwable -> L43
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L32
        L3c:
            long r7 = r6.c     // Catch: java.lang.Throwable -> L43
            long r7 = r7 + r2
            r6.c = r7     // Catch: java.lang.Throwable -> L43
            monitor-exit(r6)
            return r2
        L43:
            r7 = move-exception
            monitor-exit(r6)
            goto L47
        L46:
            throw r7
        L47:
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axac.f(long):long");
    }

    @Override // defpackage.awzu
    public final synchronized void g() {
        if (this.b != this.c) {
            this.a.mark(1048577);
        }
        this.b = this.c;
    }

    @Override // defpackage.awzu
    public final synchronized void h() {
        this.c = this.b;
        this.d = true;
    }

    @Override // defpackage.awzu
    public final synchronized boolean i() {
        if (this.d) {
            this.a.reset();
            this.d = false;
        }
        if (this.a.available() > 0) {
            return true;
        }
        if (this.a.read() == -1) {
            this.e = this.c;
            return false;
        }
        this.a.reset();
        long j = this.c;
        long j2 = this.b;
        while (true) {
            j -= j2;
            if (j <= 0) {
                return true;
            }
            j2 = this.a.skip(j);
        }
    }

    public axac(InputStream inputStream, long j) {
        if (!inputStream.markSupported()) {
            this.a = new BufferedInputStream(inputStream);
        } else {
            this.a = inputStream;
        }
        this.e = j;
        this.a.mark(1048577);
    }
}
