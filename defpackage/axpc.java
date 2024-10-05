package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axpc extends aoam {
    public static axpc aJ(ByteBuffer byteBuffer) {
        axpc axpcVar = new axpc();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axpcVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return axpcVar;
    }

    public final float aI() {
        int b = b(12);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final boolean aK() {
        int b = b(16);
        return b == 0 || this.b.get(b + this.a) != 0;
    }

    public final aoam aL() {
        aoam aoamVar = new aoam();
        int b = b(20);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(b + this.a), this.b);
        return aoamVar;
    }
}
