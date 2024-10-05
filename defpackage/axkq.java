package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class axkq implements deb {
    private static final axna a = axna.d(axkq.class);
    private ByteBuffer b;
    private ByteBuffer c;
    protected final String h;
    public byte[] i;
    public deg j;
    boolean k;
    boolean l;
    long m;
    long n;
    long o;
    axkv p;

    /* JADX INFO: Access modifiers changed from: protected */
    public axkq(String str) {
        this.o = -1L;
        this.c = null;
        this.h = str;
        this.l = true;
        this.k = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public axkq(byte[] bArr) {
        this.o = -1L;
        this.c = null;
        this.h = "uuid";
        this.i = bArr;
        this.l = true;
        this.k = true;
    }

    private final void k(ByteBuffer byteBuffer) {
        if (m()) {
            did.aa(byteBuffer, b());
            byteBuffer.put(ddz.b(this.h));
        } else {
            did.aa(byteBuffer, 1L);
            byteBuffer.put(ddz.b(this.h));
            byteBuffer.putLong(b());
        }
        if ("uuid".equals(this.h)) {
            byteBuffer.put(this.i);
        }
    }

    private final synchronized void l() {
        if (this.l) {
            return;
        }
        try {
            axna axnaVar = a;
            String str = this.h;
            axnaVar.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.b = this.p.e(this.m, this.o);
            this.l = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private final boolean m() {
        int i = true != "uuid".equals(this.h) ? 8 : 24;
        if (!this.l) {
            return this.o + ((long) i) < 4294967296L;
        }
        if (this.k) {
            long h = h();
            ByteBuffer byteBuffer = this.c;
            return (h + ((long) (byteBuffer != null ? byteBuffer.limit() : 0))) + ((long) i) < 4294967296L;
        }
        this.b.limit();
        return true;
    }

    @Override // defpackage.deb
    public final long a() {
        return this.n;
    }

    @Override // defpackage.deb
    public final long b() {
        long j;
        if (!this.l) {
            j = this.o;
        } else if (this.k) {
            j = h();
        } else {
            ByteBuffer byteBuffer = this.b;
            j = byteBuffer != null ? byteBuffer.limit() : 0;
        }
        return j + (j >= 4294967288L ? 8 : 0) + 8 + (true != "uuid".equals(this.h) ? 0 : 16) + (this.c != null ? r0.limit() : 0);
    }

    @Override // defpackage.deb
    public final deg c() {
        return this.j;
    }

    @Override // defpackage.deb
    public final String d() {
        return this.h;
    }

    @Override // defpackage.deb
    public final void e(WritableByteChannel writableByteChannel) {
        if (!this.l) {
            ByteBuffer allocate = ByteBuffer.allocate((true != m() ? 16 : 8) + (true == "uuid".equals(this.h) ? 16 : 0));
            k(allocate);
            writableByteChannel.write((ByteBuffer) allocate.rewind());
            this.p.d(this.m, this.o, writableByteChannel);
            return;
        }
        if (this.k) {
            ByteBuffer allocate2 = ByteBuffer.allocate(awxt.g(b()));
            k(allocate2);
            j(allocate2);
            ByteBuffer byteBuffer = this.c;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                while (this.c.remaining() > 0) {
                    allocate2.put(this.c);
                }
            }
            writableByteChannel.write((ByteBuffer) allocate2.rewind());
            return;
        }
        ByteBuffer allocate3 = ByteBuffer.allocate((true != m() ? 16 : 8) + (true != "uuid".equals(this.h) ? 0 : 16));
        k(allocate3);
        writableByteChannel.write((ByteBuffer) allocate3.rewind());
        writableByteChannel.write((ByteBuffer) this.b.position(0));
    }

    @Override // defpackage.deb
    public final void f(axkv axkvVar, ByteBuffer byteBuffer, long j, ddx ddxVar) {
        long b = axkvVar.b();
        this.m = b;
        this.n = b - byteBuffer.remaining();
        this.o = j;
        this.p = axkvVar;
        axkvVar.f(axkvVar.b() + j);
        this.l = false;
        this.k = false;
        q();
    }

    @Override // defpackage.deb
    public final void g(deg degVar) {
        this.j = degVar;
    }

    protected abstract long h();

    protected abstract void i(ByteBuffer byteBuffer);

    protected abstract void j(ByteBuffer byteBuffer);

    public final synchronized void q() {
        l();
        axna axnaVar = a;
        String str = this.h;
        axnaVar.a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
            this.k = true;
            byteBuffer.rewind();
            i(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.c = byteBuffer.slice();
            }
            this.b = null;
        }
    }
}
