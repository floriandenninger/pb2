package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axoy extends aoam {
    public static axoy aL(ByteBuffer byteBuffer) {
        axoy axoyVar = new axoy();
        aQ(byteBuffer, axoyVar);
        return axoyVar;
    }

    public static void aQ(ByteBuffer byteBuffer, axoy axoyVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axoyVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public final int aI() {
        int b = b(26);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int aJ() {
        int b = b(28);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int aK() {
        int b = b(22);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final aoak aM() {
        aoak aoakVar = new aoak();
        int b = b(34);
        if (b == 0) {
            return null;
        }
        aoakVar.a(b + this.a, this.b);
        return aoakVar;
    }

    public final aoak aN(aoak aoakVar) {
        int b = b(6);
        if (b == 0) {
            return null;
        }
        aoakVar.a(b + this.a, this.b);
        return aoakVar;
    }

    public final aoak aO(aoak aoakVar) {
        int b = b(8);
        if (b == 0) {
            return null;
        }
        aoakVar.a(b + this.a, this.b);
        return aoakVar;
    }

    public final aoam aP(aoam aoamVar) {
        int b = b(18);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(b + this.a), this.b);
        return aoamVar;
    }
}
