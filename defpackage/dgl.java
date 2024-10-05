package defpackage;

import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgl extends dgc implements deg {
    public int b;
    public int c;
    public double d;
    public double e;
    public int f;
    public String g;
    public int h;
    private final long[] i;

    public dgl() {
        super("avc1");
        this.d = 72.0d;
        this.e = 72.0d;
        this.f = 1;
        this.g = "";
        this.h = 24;
        this.i = new long[3];
    }

    @Override // defpackage.axkr, defpackage.deb
    public final long b() {
        long u = u();
        long j = 78 + u;
        int i = 16;
        if (!this.o && u + 86 < 4294967296L) {
            i = 8;
        }
        return j + i;
    }

    @Override // defpackage.axkr, defpackage.deb
    public final void e(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(s());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        did.Y(allocate, this.a);
        did.Y(allocate, 0);
        did.Y(allocate, 0);
        did.aa(allocate, this.i[0]);
        did.aa(allocate, this.i[1]);
        did.aa(allocate, this.i[2]);
        did.Y(allocate, this.b);
        did.Y(allocate, this.c);
        did.W(allocate, this.d);
        did.W(allocate, this.e);
        did.aa(allocate, 0L);
        did.Y(allocate, this.f);
        did.ab(allocate, did.S(this.g));
        allocate.put(did.U(this.g));
        int S = did.S(this.g);
        while (S < 31) {
            S++;
            allocate.put((byte) 0);
        }
        did.Y(allocate, this.h);
        did.Y(allocate, 65535);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        k(writableByteChannel);
    }

    @Override // defpackage.axkr, defpackage.deb
    public final void f(axkv axkvVar, ByteBuffer byteBuffer, long j, ddx ddxVar) {
        long b = axkvVar.b() + j;
        ByteBuffer allocate = ByteBuffer.allocate(78);
        axkvVar.a(allocate);
        allocate.position(6);
        this.a = did.ah(allocate);
        did.ah(allocate);
        did.ah(allocate);
        this.i[0] = did.ak(allocate);
        this.i[1] = did.ak(allocate);
        this.i[2] = did.ak(allocate);
        this.b = did.ah(allocate);
        this.c = did.ah(allocate);
        this.d = did.ae(allocate);
        this.e = did.ae(allocate);
        did.ak(allocate);
        this.f = did.ah(allocate);
        int aj = did.aj(allocate);
        if (aj > 31) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder(53);
            sb.append("invalid compressor name displayable data: ");
            sb.append(aj);
            printStream.println(sb.toString());
            aj = 31;
        }
        byte[] bArr = new byte[aj];
        allocate.get(bArr);
        this.g = did.T(bArr);
        if (aj < 31) {
            allocate.get(new byte[31 - aj]);
        }
        this.h = did.ah(allocate);
        did.ah(allocate);
        t(new dgk(b, axkvVar), j - 78, ddxVar);
    }

    public dgl(String str) {
        super(str);
        this.d = 72.0d;
        this.e = 72.0d;
        this.f = 1;
        this.g = "";
        this.h = 24;
        this.i = new long[3];
    }
}
