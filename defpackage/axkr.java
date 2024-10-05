package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class axkr extends axku implements deb {
    private long a;
    public deg m;
    public String n;
    protected boolean o;

    public axkr() {
        this("dinf");
    }

    @Override // defpackage.deb
    public final long a() {
        return this.a;
    }

    @Override // defpackage.deb
    public long b() {
        long u = u();
        int i = 16;
        if (!this.o && 8 + u < 4294967296L) {
            i = 8;
        }
        return u + i;
    }

    @Override // defpackage.deb
    public final deg c() {
        return this.m;
    }

    @Override // defpackage.deb
    public final String d() {
        return this.n;
    }

    @Override // defpackage.deb
    public void e(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(s());
        k(writableByteChannel);
    }

    @Override // defpackage.deb
    public void f(axkv axkvVar, ByteBuffer byteBuffer, long j, ddx ddxVar) {
        this.a = axkvVar.b() - byteBuffer.remaining();
        this.o = byteBuffer.remaining() == 16;
        t(axkvVar, j, ddxVar);
    }

    @Override // defpackage.deb
    public final void g(deg degVar) {
        this.m = degVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer s() {
        ByteBuffer wrap;
        if (this.o || b() >= 4294967296L) {
            wrap = ByteBuffer.wrap(new byte[]{0, 0, 0, 1, this.n.getBytes()[0], this.n.getBytes()[1], this.n.getBytes()[2], this.n.getBytes()[3], 0, 0, 0, 0, 0, 0, 0, 0});
            wrap.position(8);
            wrap.putLong(b());
        } else {
            wrap = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, this.n.getBytes()[0], this.n.getBytes()[1], this.n.getBytes()[2], this.n.getBytes()[3]});
            did.aa(wrap, b());
        }
        wrap.rewind();
        return wrap;
    }

    @Override // defpackage.axku
    public final void t(axkv axkvVar, long j, ddx ddxVar) {
        this.r = axkvVar;
        long b = axkvVar.b();
        this.t = b;
        int i = 16;
        if (!this.o && 8 + j < 4294967296L) {
            i = 8;
        }
        this.u = b - i;
        axkvVar.f(axkvVar.b() + j);
        this.v = axkvVar.b();
        this.q = ddxVar;
    }

    public axkr(byte[] bArr) {
        this("edts");
    }

    public axkr(String str) {
        this.n = str;
    }
}
