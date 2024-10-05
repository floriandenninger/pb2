package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vtw implements axkv {
    private final Uri a;
    private final FileChannel b;

    public vtw(FileChannel fileChannel, Uri uri) {
        this.a = uri;
        this.b = fileChannel;
    }

    public static axkv g(Context context, Uri uri) {
        try {
            return new vtw(new AssetFileDescriptor.AutoCloseInputStream(context.getContentResolver().openAssetFileDescriptor(uri, "r")).getChannel(), uri);
        } catch (SecurityException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.axkv
    public final int a(ByteBuffer byteBuffer) {
        return this.b.read(byteBuffer);
    }

    @Override // defpackage.axkv
    public final long b() {
        return this.b.position();
    }

    @Override // defpackage.axkv
    public final long c() {
        return this.b.size();
    }

    @Override // defpackage.axkv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.axkv
    public final long d(long j, long j2, WritableByteChannel writableByteChannel) {
        return this.b.transferTo(j, j2, writableByteChannel);
    }

    @Override // defpackage.axkv
    public final void f(long j) {
        this.b.position(j);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.axkv
    public final ByteBuffer e(long j, long j2) {
        if (j2 > 2147483647L || j2 < 0) {
            StringBuilder sb = new StringBuilder(62);
            sb.append("ByteBuffer cannot perform mapping of size ");
            sb.append(j2);
            throw new IOException(sb.toString());
        }
        try {
            ByteBuffer allocate = ByteBuffer.allocate((int) j2);
            this.b.position(j);
            axmw.a(this.b, allocate);
            return allocate;
        } catch (IndexOutOfBoundsException | OutOfMemoryError e) {
            try {
                this.b.close();
            } catch (Exception unused) {
            }
            throw new IOException(e);
        }
    }
}
