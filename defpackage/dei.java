package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dei extends axkr implements deb {
    private int a;
    private int b;

    public dei() {
        super("dref");
    }

    @Override // defpackage.axkr, defpackage.deb
    public final long b() {
        long u = u();
        long j = 8 + u;
        int i = 16;
        if (!this.o && u + 16 < 4294967296L) {
            i = 8;
        }
        return j + i;
    }

    @Override // defpackage.axkr, defpackage.deb
    public final void e(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(s());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        did.ab(allocate, this.a);
        did.Z(allocate, this.b);
        did.aa(allocate, i().size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        k(writableByteChannel);
    }

    @Override // defpackage.axkr, defpackage.deb
    public final void f(axkv axkvVar, ByteBuffer byteBuffer, long j, ddx ddxVar) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        axkvVar.a(allocate);
        allocate.rewind();
        this.a = did.aj(allocate);
        this.b = did.ai(allocate);
        t(axkvVar, j - 8, ddxVar);
    }
}
