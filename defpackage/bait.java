package defpackage;

import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bait extends bajc {
    public final int a;
    public ByteBuffer b;
    public boolean c;
    private final UploadDataProvider f;

    public bait() {
        this.f = new bais(this);
        this.a = -1;
        this.b = ByteBuffer.allocate(16384);
    }

    private final void f(int i) {
        if (this.a == -1 || this.b.position() + i <= this.a) {
            if (!this.c) {
                if (this.a == -1 && this.b.limit() - this.b.position() <= i) {
                    int capacity = this.b.capacity();
                    ByteBuffer allocate = ByteBuffer.allocate(Math.max(capacity + capacity, this.b.capacity() + i));
                    this.b.flip();
                    allocate.put(this.b);
                    this.b = allocate;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for writing after connect");
        }
        throw new ProtocolException("exceeded content-length limit of " + this.a + " bytes");
    }

    @Override // defpackage.bajc
    public final UploadDataProvider a() {
        return this.f;
    }

    @Override // defpackage.bajc
    public final void b() {
    }

    @Override // defpackage.bajc
    public final void c() {
        this.c = true;
        if (this.b.position() < this.a) {
            throw new ProtocolException("Content received is less than Content-Length");
        }
        this.b.flip();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        e();
        f(1);
        this.b.put((byte) i);
    }

    public bait(long j) {
        this.f = new bais(this);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        }
        if (j >= 0) {
            int i = (int) j;
            this.a = i;
            this.b = ByteBuffer.allocate(i);
            return;
        }
        throw new IllegalArgumentException("Content length < 0.");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        e();
        f(i2);
        this.b.put(bArr, i, i2);
    }
}
