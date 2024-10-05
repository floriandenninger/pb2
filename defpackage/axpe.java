package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axpe extends aoam {
    public static int aI(aoaj aoajVar, int i, long j, int i2, int i3) {
        aoajVar.p(4);
        aoajVar.u(3, i3);
        aoajVar.u(2, i2);
        aoajVar.t(1, (int) j);
        aoajVar.u(0, i);
        return aoajVar.c();
    }

    public static axpe aM(ByteBuffer byteBuffer) {
        axpe axpeVar = new axpe();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axpeVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return axpeVar;
    }

    public final long aJ() {
        if (b(6) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final axoh aK() {
        axoh axohVar = new axoh();
        int b = b(4);
        if (b == 0) {
            return null;
        }
        axohVar.f(a(b + this.a), this.b);
        return axohVar;
    }

    public final axoh aL() {
        axoh axohVar = new axoh();
        int b = b(8);
        if (b == 0) {
            return null;
        }
        axohVar.f(a(b + this.a), this.b);
        return axohVar;
    }
}
