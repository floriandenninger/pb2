package defpackage;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface aymb extends Closeable {
    void b();

    void c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    boolean d();

    int e();

    int f();

    aymb g(int i);

    void i(ByteBuffer byteBuffer);

    void j(OutputStream outputStream, int i);

    void k(byte[] bArr, int i, int i2);

    void l(int i);
}
