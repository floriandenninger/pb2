package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anbz extends FilterOutputStream {
    public long a;

    public anbz(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        this.out.write(i);
        this.a++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.a += i2;
    }
}
