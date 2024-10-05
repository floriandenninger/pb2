package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axof extends aoam {
    public static void aJ(ByteBuffer byteBuffer, axof axofVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axofVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    @Override // defpackage.aoam
    public final String X() {
        int b = b(10);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public final boolean aI() {
        int b = b(14);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }
}
