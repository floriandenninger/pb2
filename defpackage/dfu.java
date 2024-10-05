package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfu extends axks {
    public long a;
    public long b;
    public long c;
    public dft d;
    private long e;

    public dfu() {
        super("trex");
    }

    @Override // defpackage.axkq
    protected final long h() {
        return 24L;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        this.a = did.ak(byteBuffer);
        this.e = did.ak(byteBuffer);
        this.b = did.ak(byteBuffer);
        this.c = did.ak(byteBuffer);
        this.d = new dft(byteBuffer);
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        did.aa(byteBuffer, this.a);
        did.aa(byteBuffer, this.e);
        did.aa(byteBuffer, this.b);
        did.aa(byteBuffer, this.c);
        this.d.a(byteBuffer);
    }
}
