package defpackage;

import io.grpc.Status;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayll extends FilterInputStream {
    private final int a;
    private final ayoa b;
    private long c;
    private long d;
    private long e;

    public ayll(InputStream inputStream, int i, ayoa ayoaVar) {
        super(inputStream);
        this.e = -1L;
        this.a = i;
        this.b = ayoaVar;
    }

    private final void a() {
        long j = this.d;
        long j2 = this.c;
        if (j > j2) {
            this.b.f(j - j2);
            this.c = this.d;
        }
    }

    private final void b() {
        if (this.d > this.a) {
            throw Status.j.withDescription(String.format("Decompressed gRPC message exceeds maximum size %d", Integer.valueOf(this.a))).d();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.e = this.d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            this.d++;
        }
        b();
        a();
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.e == -1) {
            throw new IOException("Mark not set");
        }
        this.in.reset();
        this.d = this.e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = this.in.skip(j);
        this.d += skip;
        b();
        a();
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.d += read;
        }
        b();
        a();
        return read;
    }
}
