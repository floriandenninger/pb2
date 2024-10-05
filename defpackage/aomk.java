package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aomk {
    public static final /* synthetic */ int e = 0;
    private static volatile int f = 100;
    public int a;
    final int b = f;
    public int c = Integer.MAX_VALUE;
    aoml d;

    public static int J(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static int K(int i, InputStream inputStream) {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw aoob.j();
            }
            i2 |= (read & 127) << i3;
            if ((read & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw aoob.j();
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw aoob.e();
    }

    public static long L(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static aomk M(InputStream inputStream) {
        if (inputStream == null) {
            return O(aonz.b);
        }
        return new aomi(inputStream);
    }

    public static aomk N(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return Q(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        if (!byteBuffer.isDirect() || !aoqk.a) {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            return Q(bArr, 0, remaining);
        }
        return new aomj(byteBuffer);
    }

    public static aomk O(byte[] bArr) {
        return Q(bArr, 0, bArr.length);
    }

    public static aomk Q(byte[] bArr, int i, int i2) {
        aomg aomgVar = new aomg(bArr, i, i2);
        try {
            aomgVar.f(i2);
            return aomgVar;
        } catch (aoob e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract String A();

    public abstract void B(int i);

    public abstract void C(int i);

    public abstract boolean E();

    public abstract boolean F();

    public abstract boolean G(int i);

    public abstract byte[] H();

    public final void P() {
        if (this.a >= this.b) {
            throw aoob.h();
        }
    }

    public abstract double b();

    public abstract float c();

    public abstract int e();

    public abstract int f(int i);

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract long q();

    public abstract long u();

    public abstract long v();

    public abstract long w();

    public abstract aomf x();

    public abstract aooy y(aopf aopfVar, aomw aomwVar);

    public abstract String z();
}
