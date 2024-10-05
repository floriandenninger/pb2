package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cmt implements cmu {
    private final ByteBuffer a;

    public cmt(ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }

    @Override // defpackage.cmu
    public final long a() {
        return this.a.capacity();
    }

    @Override // defpackage.cmu
    public final void b(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer slice;
        synchronized (this.a) {
            int i2 = (int) j;
            slice = this.a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            messageDigest.update(slice);
        }
    }
}
