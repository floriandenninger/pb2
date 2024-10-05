package defpackage;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yvz extends ByteArrayInputStream implements ywa {
    public yvz(byte[] bArr, int i) {
        super(bArr, 0, i);
    }

    @Override // defpackage.ywa
    public final int a(ByteBuffer byteBuffer, int i) {
        if (this.pos >= this.count) {
            return -1;
        }
        int min = Math.min(this.count - this.pos, i);
        if (min == 0) {
            return 0;
        }
        byteBuffer.put(this.buf, this.pos, min);
        this.pos += min;
        return min;
    }
}
