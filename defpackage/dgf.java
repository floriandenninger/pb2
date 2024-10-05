package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgf extends dgc {
    public dgf() {
        super("mp4s");
    }

    @Override // defpackage.axkr, defpackage.deb
    public final long b() {
        long u = u() + 8;
        int i = 16;
        if (!this.o && u < 4294967296L) {
            i = 8;
        }
        return u + i;
    }

    @Override // defpackage.axkr, defpackage.deb
    public final void e(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(s());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.position(6);
        did.Y(allocate, this.a);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        k(writableByteChannel);
    }

    @Override // defpackage.axkr, defpackage.deb
    public final void f(axkv axkvVar, ByteBuffer byteBuffer, long j, ddx ddxVar) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        axkvVar.a(allocate);
        allocate.position(6);
        this.a = did.ah(allocate);
        t(axkvVar, j - 8, ddxVar);
    }

    @Override // defpackage.axku
    public final String toString() {
        String valueOf = String.valueOf(Arrays.asList(i()));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("MpegSampleEntry");
        sb.append(valueOf);
        return sb.toString();
    }

    public dgf(String str) {
        super(str);
    }
}
