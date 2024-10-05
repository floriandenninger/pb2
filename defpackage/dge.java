package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dge extends dgc {
    public int b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;
    public long h;
    public long i;
    public long j;
    public long k;
    public byte[] l;
    private int x;
    private long y;

    public dge(String str) {
        super(str);
    }

    @Override // defpackage.axkr, defpackage.deb
    public final long b() {
        int i = this.e;
        int i2 = 16;
        long u = (i == 1 ? 16 : 0) + 28 + (i == 2 ? 36 : 0) + u();
        if (!this.o && 8 + u < 4294967296L) {
            i2 = 8;
        }
        return u + i2;
    }

    @Override // defpackage.axkr, defpackage.deb
    public final void e(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(s());
        int i = this.e;
        ByteBuffer allocate = ByteBuffer.allocate((i == 1 ? 16 : 0) + 28 + (i == 2 ? 36 : 0));
        allocate.position(6);
        did.Y(allocate, this.a);
        did.Y(allocate, this.e);
        did.Y(allocate, this.x);
        did.aa(allocate, this.y);
        did.Y(allocate, this.b);
        did.Y(allocate, this.c);
        did.Y(allocate, this.f);
        did.Y(allocate, this.g);
        if (!this.n.equals("mlpa")) {
            did.aa(allocate, this.d << 16);
        } else {
            did.aa(allocate, this.d);
        }
        if (this.e == 1) {
            did.aa(allocate, this.h);
            did.aa(allocate, this.i);
            did.aa(allocate, this.j);
            did.aa(allocate, this.k);
        }
        if (this.e == 2) {
            did.aa(allocate, this.h);
            did.aa(allocate, this.i);
            did.aa(allocate, this.j);
            did.aa(allocate, this.k);
            allocate.put(this.l);
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        k(writableByteChannel);
    }

    @Override // defpackage.axkr, defpackage.deb
    public final void f(axkv axkvVar, ByteBuffer byteBuffer, long j, ddx ddxVar) {
        ByteBuffer allocate = ByteBuffer.allocate(28);
        axkvVar.a(allocate);
        allocate.position(6);
        this.a = did.ah(allocate);
        this.e = did.ah(allocate);
        this.x = did.ah(allocate);
        this.y = did.ak(allocate);
        this.b = did.ah(allocate);
        this.c = did.ah(allocate);
        this.f = did.ah(allocate);
        this.g = did.ah(allocate);
        this.d = did.ak(allocate);
        if (!this.n.equals("mlpa")) {
            this.d >>>= 16;
        }
        if (this.e == 1) {
            ByteBuffer allocate2 = ByteBuffer.allocate(16);
            axkvVar.a(allocate2);
            allocate2.rewind();
            this.h = did.ak(allocate2);
            this.i = did.ak(allocate2);
            this.j = did.ak(allocate2);
            this.k = did.ak(allocate2);
        }
        if (this.e == 2) {
            ByteBuffer allocate3 = ByteBuffer.allocate(36);
            axkvVar.a(allocate3);
            allocate3.rewind();
            this.h = did.ak(allocate3);
            this.i = did.ak(allocate3);
            this.j = did.ak(allocate3);
            this.k = did.ak(allocate3);
            byte[] bArr = new byte[20];
            this.l = bArr;
            allocate3.get(bArr);
        }
        if ("owma".equals(this.n)) {
            System.err.println("owma");
            long j2 = j - 28;
            int i = this.e;
            long j3 = (j2 - (i != 1 ? 0 : 16)) - (i != 2 ? 0 : 36);
            ByteBuffer allocate4 = ByteBuffer.allocate(awxt.g(j3));
            axkvVar.a(allocate4);
            w(new dgd(this, j3, allocate4));
            return;
        }
        long j4 = j - 28;
        int i2 = this.e;
        t(axkvVar, (j4 - (i2 != 1 ? 0 : 16)) - (i2 != 2 ? 0 : 36), ddxVar);
    }

    @Override // defpackage.axku
    public final String toString() {
        long j = this.k;
        long j2 = this.j;
        long j3 = this.i;
        long j4 = this.h;
        int i = this.g;
        int i2 = this.f;
        int i3 = this.e;
        long j5 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        String valueOf = String.valueOf(i());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 333);
        sb.append("AudioSampleEntry{bytesPerSample=");
        sb.append(j);
        sb.append(", bytesPerFrame=");
        sb.append(j2);
        sb.append(", bytesPerPacket=");
        sb.append(j3);
        sb.append(", samplesPerPacket=");
        sb.append(j4);
        sb.append(", packetSize=");
        sb.append(i);
        sb.append(", compressionId=");
        sb.append(i2);
        sb.append(", soundVersion=");
        sb.append(i3);
        sb.append(", sampleRate=");
        sb.append(j5);
        sb.append(", sampleSize=");
        sb.append(i4);
        sb.append(", channelCount=");
        sb.append(i5);
        sb.append(", boxes=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
