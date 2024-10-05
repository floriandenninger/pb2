package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alel implements awzu {
    private final long a;
    private InputStream b;
    private boolean c;
    private long d;
    private long e;
    private final alei f;

    public alel(alei aleiVar, alad aladVar) {
        this.f = aleiVar;
        amkq.E(aladVar.a() != -1);
        this.b = k(aladVar);
        this.a = aladVar.a();
    }

    private final void j() {
        if (this.c) {
            close();
            this.c = false;
        }
        if (this.b == null) {
            InputStream k = k(this.f.a());
            this.b = k;
            anbt.b(k, this.e);
        }
    }

    private static final InputStream k(alad aladVar) {
        return new BufferedInputStream(aladVar, 131072);
    }

    @Override // defpackage.awzu
    public final long a() {
        return this.a;
    }

    @Override // defpackage.awzu
    public final int b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        j();
        int read = this.b.read(bArr, i, i2);
        if (read == -1) {
            if (this.d >= this.a) {
                return 0;
            }
            throw new IOException("The stream ended before all expected bytes were read");
        }
        long j = this.d + read;
        this.d = j;
        if (j <= this.a) {
            return read;
        }
        throw new IOException("Stream continues beyond expected size.");
    }

    @Override // defpackage.awzu
    public final long c() {
        return this.e;
    }

    @Override // defpackage.awzu, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            inputStream.close();
            this.b = null;
        }
    }

    @Override // defpackage.awzu
    public final long d() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.awzu
    public final long e() {
        return this.d;
    }

    @Override // defpackage.awzu
    public final long f(long j) {
        j();
        anbt.b(this.b, j);
        this.d += j;
        return j;
    }

    @Override // defpackage.awzu
    public final void g() {
        InputStream inputStream = this.b;
        if (inputStream == null) {
            return;
        }
        if (this.e != this.d) {
            inputStream.mark(131072);
        }
        this.e = this.d;
    }

    @Override // defpackage.awzu
    public final void h() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            try {
                inputStream.reset();
            } catch (IOException unused) {
                this.c = true;
            }
            this.d = this.e;
        }
    }

    @Override // defpackage.awzu
    public final boolean i() {
        return this.a - this.d > 0;
    }
}
