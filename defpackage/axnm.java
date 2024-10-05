package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axnm extends dgc {
    private String b;
    private String c;
    private String d;

    public axnm() {
        super("stpp");
        this.b = "";
        this.c = "";
        this.d = "";
    }

    @Override // defpackage.axkr, defpackage.deb
    public final long b() {
        long u = u() + this.b.length() + 8 + this.c.length() + this.d.length() + 3;
        return u + ((this.o || 8 + u >= 4294967296L) ? 16 : 8);
    }

    @Override // defpackage.axkr, defpackage.deb
    public final void e(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(s());
        ByteBuffer allocate = ByteBuffer.allocate(this.b.length() + 8 + this.c.length() + this.d.length() + 3);
        allocate.position(6);
        did.Y(allocate, this.a);
        did.ac(allocate, this.b);
        did.ac(allocate, this.c);
        did.ac(allocate, this.d);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        k(writableByteChannel);
    }

    @Override // defpackage.axkr, defpackage.deb
    public final void f(axkv axkvVar, ByteBuffer byteBuffer, long j, ddx ddxVar) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        axkvVar.a((ByteBuffer) allocate.rewind());
        allocate.position(6);
        this.a = did.ah(allocate);
        long b = axkvVar.b();
        ByteBuffer allocate2 = ByteBuffer.allocate(1024);
        axkvVar.a((ByteBuffer) allocate2.rewind());
        this.b = did.an((ByteBuffer) allocate2.rewind());
        axkvVar.f(r3.length() + b + 1);
        axkvVar.a((ByteBuffer) allocate2.rewind());
        this.c = did.an((ByteBuffer) allocate2.rewind());
        axkvVar.f(this.b.length() + b + this.c.length() + 2);
        axkvVar.a((ByteBuffer) allocate2.rewind());
        this.d = did.an((ByteBuffer) allocate2.rewind());
        axkvVar.f(b + this.b.length() + this.c.length() + this.d.length() + 3);
        t(axkvVar, j - ((((byteBuffer.remaining() + this.b.length()) + this.c.length()) + this.d.length()) + 3), ddxVar);
    }
}
