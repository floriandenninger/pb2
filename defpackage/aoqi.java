package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aoqi extends aoqj {
    public aoqi(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.aoqj
    public final byte a(long j) {
        return Memory.peekByte(j);
    }

    @Override // defpackage.aoqj
    public final double b(Object obj, long j) {
        return Double.longBitsToDouble(l(obj, j));
    }

    @Override // defpackage.aoqj
    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(k(obj, j));
    }

    @Override // defpackage.aoqj
    public final void d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    @Override // defpackage.aoqj
    public final void e(Object obj, long j, boolean z) {
        if (!aoqk.d) {
            aoqk.q(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            aoqk.p(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.aoqj
    public final void f(Object obj, long j, byte b) {
        if (!aoqk.d) {
            aoqk.q(obj, j, b);
        } else {
            aoqk.p(obj, j, b);
        }
    }

    @Override // defpackage.aoqj
    public final void g(Object obj, long j, double d) {
        p(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.aoqj
    public final void h(Object obj, long j, float f) {
        o(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.aoqj
    public final boolean i(Object obj, long j) {
        if (!aoqk.d) {
            return aoqk.z(obj, j);
        }
        return aoqk.y(obj, j);
    }
}
