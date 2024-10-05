package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ytr extends UploadDataProvider {
    private final ysi a;
    private InputStream b;
    private int c;

    public ytr(ysi ysiVar) {
        this.a = ysiVar;
    }

    private final void a() {
        try {
            InputStream inputStream = this.b;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        this.b = null;
    }

    private final void b() {
        a();
        this.b = this.a.a();
        this.c = 0;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.b;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ywa, java.io.InputStream] */
    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int i;
        if (this.b == null) {
            b();
        }
        int remaining = byteBuffer.remaining();
        long j = this.a.b;
        if (j != -1) {
            remaining = (int) Math.min(remaining, j - this.c);
        }
        ?? r1 = this.b;
        boolean z = false;
        if (r1 instanceof ywa) {
            i = r1.a(byteBuffer, remaining);
        } else if (byteBuffer.hasArray()) {
            int read = r1.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), remaining);
            if (read > 0) {
            }
            i = read;
        } else {
            byte[] bArr = new byte[Math.min(2048, remaining)];
            int read2 = r1.read(bArr);
            if (read2 > 0) {
                byteBuffer.put(bArr, 0, read2);
            }
            i = read2;
        }
        if (i != -1) {
            this.c += i;
        }
        if (this.a.f() && i == -1) {
            z = true;
        }
        uploadDataSink.onReadSucceeded(z);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        b();
        uploadDataSink.onRewindSucceeded();
    }
}
