package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axkw implements axkv {
    final ByteBuffer a;

    public axkw(byte[] bArr) {
        this.a = ByteBuffer.wrap(bArr);
    }

    @Override // defpackage.axkv
    public final int a(ByteBuffer byteBuffer) {
        if (this.a.remaining() == 0 && byteBuffer.remaining() != 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.a.remaining());
        byte[] bArr = new byte[min];
        this.a.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    @Override // defpackage.axkv
    public final long b() {
        return this.a.position();
    }

    @Override // defpackage.axkv
    public final long c() {
        return this.a.capacity();
    }

    @Override // defpackage.axkv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.axkv
    public final long d(long j, long j2, WritableByteChannel writableByteChannel) {
        return writableByteChannel.write((ByteBuffer) ((ByteBuffer) this.a.position(awxt.g(j))).slice().limit(awxt.g(j2)));
    }

    @Override // defpackage.axkv
    public final ByteBuffer e(long j, long j2) {
        int position = this.a.position();
        this.a.position(awxt.g(j));
        ByteBuffer slice = this.a.slice();
        slice.limit(awxt.g(j2));
        this.a.position(position);
        return slice;
    }

    @Override // defpackage.axkv
    public final void f(long j) {
        this.a.position(awxt.g(j));
    }
}
