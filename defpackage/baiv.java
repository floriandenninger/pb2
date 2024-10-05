package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baiv extends bajc {
    public final baje a;
    public final ByteBuffer b;
    public boolean c;
    private final UploadDataProvider f = new baiu(this);

    public baiv(int i, baje bajeVar) {
        if (i <= 0) {
            throw new IllegalArgumentException("chunkLength should be greater than 0");
        }
        this.b = ByteBuffer.allocate(i);
        this.a = bajeVar;
    }

    private final void f() {
        if (this.b.hasRemaining()) {
            return;
        }
        e();
        this.b.flip();
        this.a.a();
        d();
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
    }

    @Override // defpackage.bajc, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.flip();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        f();
        this.b.put((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        e();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, this.b.remaining());
            this.b.put(bArr, (i + i2) - i3, min);
            i3 -= min;
            f();
        }
    }
}
