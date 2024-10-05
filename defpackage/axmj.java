package defpackage;

import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axmj extends axlx {
    private ByteBuffer a;

    static {
        Logger.getLogger(axmj.class.getName());
    }

    @Override // defpackage.axlx
    public final void a(ByteBuffer byteBuffer) {
        this.a = (ByteBuffer) byteBuffer.slice().limit(this.U);
    }

    @Override // defpackage.axlx
    public final String toString() {
        return "UnknownDescriptor{tag=" + this.T + ", sizeOfInstance=" + this.U + ", data=" + this.a + '}';
    }
}
