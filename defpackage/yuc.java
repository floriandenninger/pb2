package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yuc extends InputStream {
    public volatile ByteBuffer a;
    private final UrlRequest b;
    private final ytq c;

    public yuc(UrlRequest urlRequest, ytq ytqVar) {
        this.b = urlRequest;
        this.c = ytqVar;
    }

    private final void a() {
        ytq ytqVar = this.c;
        if (ytqVar.d) {
            ytqVar.a();
            return;
        }
        if (this.a == null) {
            this.a = ByteBuffer.allocateDirect(32768);
        }
        if (this.a.hasRemaining()) {
            return;
        }
        ytq ytqVar2 = this.c;
        UrlRequest urlRequest = this.b;
        urlRequest.read(this.a);
        ytqVar2.a.b(urlRequest);
        ytqVar2.a();
        if (this.a != null) {
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.a != null) {
            return this.a.remaining();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ytq ytqVar = this.c;
        if (ytqVar.d) {
            ytqVar.a();
            return;
        }
        UrlRequest urlRequest = this.b;
        ytqVar.e = true;
        urlRequest.cancel();
        ytqVar.a.b(urlRequest);
        ytqVar.a();
    }

    @Override // java.io.InputStream
    public final int read() {
        a();
        if (this.a == null || !this.a.hasRemaining()) {
            return -1;
        }
        return this.a.get() & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            int length = bArr.length;
            StringBuilder sb = new StringBuilder(91);
            sb.append("Tried to read ");
            sb.append(i2);
            sb.append(" bytes starting at ");
            sb.append(i);
            sb.append(" from a buffer of length ");
            sb.append(length);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        a();
        if (this.a == null || !this.a.hasRemaining()) {
            return -1;
        }
        int min = Math.min(this.a.remaining(), i2);
        this.a.get(bArr, i, min);
        return min;
    }
}
