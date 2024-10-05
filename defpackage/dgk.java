package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgk implements axkv {
    final /* synthetic */ long a;
    final /* synthetic */ axkv b;

    public dgk(long j, axkv axkvVar) {
        this.a = j;
        this.b = axkvVar;
    }

    @Override // defpackage.axkv
    public final int a(ByteBuffer byteBuffer) {
        if (this.a == this.b.b()) {
            return -1;
        }
        if (byteBuffer.remaining() > this.a - this.b.b()) {
            ByteBuffer allocate = ByteBuffer.allocate(awxt.g(this.a - this.b.b()));
            this.b.a(allocate);
            byteBuffer.put((ByteBuffer) allocate.rewind());
            return allocate.capacity();
        }
        return this.b.a(byteBuffer);
    }

    @Override // defpackage.axkv
    public final long b() {
        return this.b.b();
    }

    @Override // defpackage.axkv
    public final long c() {
        return this.a;
    }

    @Override // defpackage.axkv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.axkv
    public final long d(long j, long j2, WritableByteChannel writableByteChannel) {
        return this.b.d(j, j2, writableByteChannel);
    }

    @Override // defpackage.axkv
    public final ByteBuffer e(long j, long j2) {
        return this.b.e(j, j2);
    }

    @Override // defpackage.axkv
    public final void f(long j) {
        this.b.f(j);
    }
}
