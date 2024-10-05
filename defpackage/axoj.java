package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axoj extends aoam {
    public static axoj aJ(ByteBuffer byteBuffer) {
        axoj axojVar = new axoj();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axojVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return axojVar;
    }

    public final float aI() {
        int b = b(8);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final aoam aK() {
        aoam aoamVar = new aoam();
        int b = b(12);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(b + this.a), this.b);
        return aoamVar;
    }

    public final aoam aL() {
        aoam aoamVar = new aoam();
        int b = b(14);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(b + this.a), this.b);
        return aoamVar;
    }

    public final aoam aM() {
        aoam aoamVar = new aoam();
        int b = b(16);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(b + this.a), this.b);
        return aoamVar;
    }
}
