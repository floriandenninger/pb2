package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axlk implements axlb {
    final /* synthetic */ long a;
    final /* synthetic */ ByteBuffer b;
    final /* synthetic */ int c;

    public axlk(long j, ByteBuffer byteBuffer, int i) {
        this.a = j;
        this.b = byteBuffer;
        this.c = i;
    }

    @Override // defpackage.axlb
    public final long a() {
        return this.a;
    }

    @Override // defpackage.axlb
    public final void b(WritableByteChannel writableByteChannel) {
        writableByteChannel.write((ByteBuffer) ((ByteBuffer) this.b.position(this.c)).slice().limit(awxt.g(this.a)));
    }
}
