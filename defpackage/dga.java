package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dga implements deb {
    deg a;
    private axkv b;
    private long c;
    private long d;

    static {
        Logger.getLogger(dga.class.getName());
    }

    @Override // defpackage.deb
    public final long a() {
        return this.c;
    }

    @Override // defpackage.deb
    public final long b() {
        return this.d;
    }

    @Override // defpackage.deb
    public final deg c() {
        return this.a;
    }

    @Override // defpackage.deb
    public final String d() {
        return "mdat";
    }

    @Override // defpackage.deb
    public final void e(WritableByteChannel writableByteChannel) {
        axkv axkvVar = this.b;
        long j = this.c;
        long j2 = this.d;
        long j3 = 0;
        while (j3 < j2) {
            j3 += axkvVar.d(j + j3, Math.min(67076096L, j2 - j3), writableByteChannel);
        }
    }

    @Override // defpackage.deb
    public final void f(axkv axkvVar, ByteBuffer byteBuffer, long j, ddx ddxVar) {
        this.c = axkvVar.b() - byteBuffer.remaining();
        this.b = axkvVar;
        this.d = byteBuffer.remaining() + j;
        axkvVar.f(axkvVar.b() + j);
    }

    @Override // defpackage.deb
    public final void g(deg degVar) {
        this.a = degVar;
    }

    public final String toString() {
        long j = this.d;
        StringBuilder sb = new StringBuilder(39);
        sb.append("MediaDataBox{size=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
