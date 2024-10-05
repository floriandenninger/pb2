package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfe extends ded {
    public long[] a;

    public dfe() {
        super("stco");
        this.a = new long[0];
    }

    @Override // defpackage.axkq
    protected final long h() {
        return (this.a.length * 4) + 8;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        int g = awxt.g(did.ak(byteBuffer));
        this.a = new long[g];
        for (int i = 0; i < g; i++) {
            this.a[i] = did.ak(byteBuffer);
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        did.aa(byteBuffer, this.a.length);
        for (long j : this.a) {
            did.aa(byteBuffer, j);
        }
    }

    @Override // defpackage.ded
    public final long[] k() {
        return this.a;
    }
}
