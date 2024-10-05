package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgj extends dgc {
    private long b;
    private int c;
    private int d;
    private int[] e;
    private dgh f;
    private dgi g;

    public dgj() {
        super("tx3g");
        this.e = new int[4];
        this.f = new dgh();
        this.g = new dgi();
    }

    @Override // defpackage.axkr, defpackage.deb
    public final long b() {
        long u = u() + 38;
        int i = 16;
        if (!this.o && u < 4294967296L) {
            i = 8;
        }
        return u + i;
    }

    @Override // defpackage.axkr, defpackage.deb
    public final void e(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(s());
        ByteBuffer allocate = ByteBuffer.allocate(38);
        allocate.position(6);
        did.Y(allocate, this.a);
        did.aa(allocate, this.b);
        did.ab(allocate, this.c);
        did.ab(allocate, this.d);
        did.ab(allocate, this.e[0]);
        did.ab(allocate, this.e[1]);
        did.ab(allocate, this.e[2]);
        did.ab(allocate, this.e[3]);
        dgh dghVar = this.f;
        did.Y(allocate, dghVar.a);
        did.Y(allocate, dghVar.b);
        did.Y(allocate, dghVar.c);
        did.Y(allocate, dghVar.d);
        dgi dgiVar = this.g;
        did.Y(allocate, dgiVar.a);
        did.Y(allocate, dgiVar.b);
        did.Y(allocate, dgiVar.c);
        did.ab(allocate, dgiVar.d);
        did.ab(allocate, dgiVar.e);
        did.ab(allocate, dgiVar.f[0]);
        did.ab(allocate, dgiVar.f[1]);
        did.ab(allocate, dgiVar.f[2]);
        did.ab(allocate, dgiVar.f[3]);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        k(writableByteChannel);
    }

    @Override // defpackage.axkr, defpackage.deb
    public final void f(axkv axkvVar, ByteBuffer byteBuffer, long j, ddx ddxVar) {
        ByteBuffer allocate = ByteBuffer.allocate(38);
        axkvVar.a(allocate);
        allocate.position(6);
        this.a = did.ah(allocate);
        this.b = did.ak(allocate);
        this.c = did.aj(allocate);
        this.d = did.aj(allocate);
        int[] iArr = new int[4];
        this.e = iArr;
        iArr[0] = did.aj(allocate);
        this.e[1] = did.aj(allocate);
        this.e[2] = did.aj(allocate);
        this.e[3] = did.aj(allocate);
        dgh dghVar = new dgh();
        this.f = dghVar;
        dghVar.a = did.ah(allocate);
        dghVar.b = did.ah(allocate);
        dghVar.c = did.ah(allocate);
        dghVar.d = did.ah(allocate);
        dgi dgiVar = new dgi();
        this.g = dgiVar;
        dgiVar.a = did.ah(allocate);
        dgiVar.b = did.ah(allocate);
        dgiVar.c = did.ah(allocate);
        dgiVar.d = did.aj(allocate);
        dgiVar.e = did.aj(allocate);
        dgiVar.f = new int[4];
        dgiVar.f[0] = did.aj(allocate);
        dgiVar.f[1] = did.aj(allocate);
        dgiVar.f[2] = did.aj(allocate);
        dgiVar.f[3] = did.aj(allocate);
        t(axkvVar, j - 38, ddxVar);
    }

    @Override // defpackage.axku
    public final String toString() {
        return "TextSampleEntry";
    }

    public dgj(String str) {
        super(str);
        this.e = new int[4];
        this.f = new dgh();
        this.g = new dgi();
    }
}
