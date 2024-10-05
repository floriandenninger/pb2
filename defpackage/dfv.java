package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfv extends axks {
    public long a;

    public dfv() {
        super("tfdt");
    }

    @Override // defpackage.axkq
    protected final long h() {
        return s() == 0 ? 8L : 12L;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if (s() == 1) {
            this.a = did.al(byteBuffer);
        } else {
            this.a = did.ak(byteBuffer);
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (s() == 1) {
            byteBuffer.putLong(this.a);
        } else {
            did.aa(byteBuffer, this.a);
        }
    }

    public final String toString() {
        long j = this.a;
        StringBuilder sb = new StringBuilder(77);
        sb.append("TrackFragmentBaseMediaDecodeTimeBox{baseMediaDecodeTime=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
