package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgd implements deb {
    final /* synthetic */ long a;
    final /* synthetic */ ByteBuffer b;
    final /* synthetic */ dge c;

    public dgd(dge dgeVar, long j, ByteBuffer byteBuffer) {
        this.c = dgeVar;
        this.a = j;
        this.b = byteBuffer;
    }

    @Override // defpackage.deb
    public final long a() {
        return 0L;
    }

    @Override // defpackage.deb
    public final long b() {
        return this.a;
    }

    @Override // defpackage.deb
    public final deg c() {
        return this.c;
    }

    @Override // defpackage.deb
    public final String d() {
        return "----";
    }

    @Override // defpackage.deb
    public final void e(WritableByteChannel writableByteChannel) {
        this.b.rewind();
        writableByteChannel.write(this.b);
    }

    @Override // defpackage.deb
    public final void f(axkv axkvVar, ByteBuffer byteBuffer, long j, ddx ddxVar) {
        throw new RuntimeException("NotImplemented");
    }

    @Override // defpackage.deb
    public final void g(deg degVar) {
    }
}
