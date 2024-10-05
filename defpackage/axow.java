package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axow extends aoam {
    public static axow aJ(ByteBuffer byteBuffer) {
        axow axowVar = new axow();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axowVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return axowVar;
    }

    public final int aI() {
        int b = b(10);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final aoam aK() {
        aoam aoamVar = new aoam();
        int b = b(16);
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
        int b = b(6);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(b + this.a), this.b);
        return aoamVar;
    }

    public final aoam aN() {
        aoam aoamVar = new aoam();
        int b = b(8);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(b + this.a), this.b);
        return aoamVar;
    }

    public final aoam aO() {
        aoam aoamVar = new aoam();
        int b = b(4);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(b + this.a), this.b);
        return aoamVar;
    }
}
