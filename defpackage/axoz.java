package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axoz extends aoam {
    public static axoz aJ(ByteBuffer byteBuffer) {
        axoz axozVar = new axoz();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axozVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return axozVar;
    }

    @Override // defpackage.aoam
    public final int Q() {
        int b = b(6);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int aI() {
        int b = b(4);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final void aK(axpa axpaVar, int i) {
        int b = b(4);
        if (b != 0) {
            axpaVar.f(a(c(b) + (i * 4)), this.b);
        }
    }
}
