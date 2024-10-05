package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfj extends axks {
    public long[] a;

    public dfj() {
        super("stss");
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

    public final String toString() {
        int length = this.a.length;
        StringBuilder sb = new StringBuilder(37);
        sb.append("SyncSampleBox[entryCount=");
        sb.append(length);
        sb.append("]");
        return sb.toString();
    }
}
