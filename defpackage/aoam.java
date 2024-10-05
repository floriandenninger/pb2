package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aoam {
    public int a;
    public ByteBuffer b;
    aoan c = aoan.d();
    private int d;
    private int e;

    static {
        new aoal();
    }

    public static int L(aoaj aoajVar, int i, int i2, int i3, int i4) {
        aoajVar.p(4);
        aoajVar.u(3, i4);
        aoajVar.u(2, i3);
        aoajVar.u(1, i2);
        aoajVar.u(0, i);
        return aoajVar.c();
    }

    public static int R(aoaj aoajVar, int i, int i2, int i3) {
        aoajVar.p(3);
        aoajVar.t(2, i3);
        aoajVar.u(1, i2);
        aoajVar.t(0, i);
        return aoajVar.c();
    }

    public static aoam aB(ByteBuffer byteBuffer) {
        aoam aoamVar = new aoam();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        aoamVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return aoamVar;
    }

    public static void aH(ByteBuffer byteBuffer, aoam aoamVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        aoamVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static aoam au(ByteBuffer byteBuffer) {
        aoam aoamVar = new aoam();
        aH(byteBuffer, aoamVar);
        return aoamVar;
    }

    public static aoam ay(ByteBuffer byteBuffer) {
        aoam aoamVar = new aoam();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        aoamVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return aoamVar;
    }

    public static int o(aoaj aoajVar, long j, long j2, int i, int i2) {
        aoajVar.p(4);
        aoajVar.t(3, i2);
        aoajVar.u(2, i);
        aoajVar.t(1, (int) j2);
        aoajVar.t(0, (int) j);
        return aoajVar.c();
    }

    public final aoak A() {
        return B(new aoak());
    }

    public final aoak B(aoak aoakVar) {
        int b = b(6);
        if (b == 0) {
            return null;
        }
        aoakVar.a(b + this.a, this.b);
        return aoakVar;
    }

    public final aoak C() {
        return D(new aoak());
    }

    public final aoak D(aoak aoakVar) {
        int b = b(10);
        if (b == 0) {
            return null;
        }
        aoakVar.a(b + this.a, this.b);
        return aoakVar;
    }

    public final aoak E() {
        return F(new aoak());
    }

    public final aoak F(aoak aoakVar) {
        int b = b(12);
        if (b == 0) {
            return null;
        }
        aoakVar.a(b + this.a, this.b);
        return aoakVar;
    }

    public final aoak G() {
        return H(new aoak());
    }

    public final aoak H(aoak aoakVar) {
        int b = b(4);
        if (b == 0) {
            return null;
        }
        aoakVar.a(b + this.a, this.b);
        return aoakVar;
    }

    public final aoak I() {
        return J(new aoak());
    }

    public final aoak J(aoak aoakVar) {
        int b = b(18);
        if (b == 0) {
            return null;
        }
        aoakVar.a(b + this.a, this.b);
        return aoakVar;
    }

    public final int K() {
        int b = b(8);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final String M() {
        int b = b(10);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public final String N() {
        int b = b(6);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public final String O() {
        int b = b(4);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public final int P() {
        int b = b(4);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public int Q() {
        int b = b(6);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int S() {
        int b = b(6);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final int T() {
        int b = b(4);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int U() {
        int b = b(8);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final ByteBuffer V() {
        return i(6);
    }

    public final int W() {
        int b = b(4);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public String X() {
        int b = b(4);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public final int Y() {
        int b = b(6);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int Z() {
        int b = b(12);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int a(int i) {
        return i + this.b.getInt(i);
    }

    public final aoam aA(aoam aoamVar, int i) {
        int b = b(4);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(c(b) + (i * 4)), this.b);
        return aoamVar;
    }

    public final aoam aC() {
        aoam aoamVar = new aoam();
        int b = b(8);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(b + this.a), this.b);
        return aoamVar;
    }

    public final aoak aD() {
        aoak aoakVar = new aoak();
        int b = b(6);
        if (b == 0) {
            return null;
        }
        aoakVar.a(b + this.a, this.b);
        return aoakVar;
    }

    public final aoak aE() {
        aoak aoakVar = new aoak();
        int b = b(4);
        if (b == 0) {
            return null;
        }
        aoakVar.a(b + this.a, this.b);
        return aoakVar;
    }

    public final aoak aF() {
        aoak aoakVar = new aoak();
        int b = b(6);
        if (b == 0) {
            return null;
        }
        aoakVar.a(b + this.a, this.b);
        return aoakVar;
    }

    public final aoak aG() {
        aoak aoakVar = new aoak();
        int b = b(8);
        if (b == 0) {
            return null;
        }
        aoakVar.a(b + this.a, this.b);
        return aoakVar;
    }

    public final int aa() {
        int b = b(4);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final axov ab(int i) {
        return ac(new axov(), i);
    }

    public final axov ac(axov axovVar, int i) {
        int b = b(4);
        if (b == 0) {
            return null;
        }
        axovVar.f(a(c(b) + (i * 4)), this.b);
        return axovVar;
    }

    public final boolean ad() {
        int b = b(10);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final int ae() {
        int b = b(4);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final int af() {
        int b = b(6);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final boolean ag() {
        int b = b(18);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final boolean ah() {
        int b = b(8);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final boolean ai() {
        int b = b(10);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final boolean aj() {
        int b = b(16);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final boolean ak() {
        int b = b(14);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final boolean al() {
        int b = b(4);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final boolean am() {
        int b = b(6);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final boolean an() {
        int b = b(12);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final float ao() {
        int b = b(4);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final float ap(int i) {
        int b = b(8);
        if (b != 0) {
            return this.b.getFloat(c(b) + (i * 4));
        }
        return 0.0f;
    }

    public final int aq() {
        int b = b(8);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final aoam ar() {
        aoam aoamVar = new aoam();
        int b = b(8);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(b + this.a), this.b);
        return aoamVar;
    }

    public final aoam as() {
        aoam aoamVar = new aoam();
        int b = b(4);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(b + this.a), this.b);
        return aoamVar;
    }

    public final aoam at(int i) {
        aoam aoamVar = new aoam();
        int b = b(8);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(c(b) + (i * 4)), this.b);
        return aoamVar;
    }

    public final aoam av() {
        return aw(new aoam());
    }

    public final aoam aw(aoam aoamVar) {
        int b = b(4);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(b + this.a), this.b);
        return aoamVar;
    }

    public final aoam ax() {
        aoam aoamVar = new aoam();
        int b = b(6);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(b + this.a), this.b);
        return aoamVar;
    }

    public final aoam az(int i) {
        return aA(new aoam(), i);
    }

    public final int b(int i) {
        if (i < this.e) {
            return this.b.getShort(this.d + i);
        }
        return 0;
    }

    public final int c(int i) {
        int i2 = i + this.a;
        return i2 + this.b.getInt(i2) + 4;
    }

    public final int d(int i) {
        int i2 = i + this.a;
        return this.b.getInt(i2 + this.b.getInt(i2));
    }

    public final String e(int i) {
        ByteBuffer byteBuffer = this.b;
        aoan aoanVar = this.c;
        int i2 = i + byteBuffer.getInt(i);
        return aoanVar.b(byteBuffer, i2 + 4, byteBuffer.getInt(i2));
    }

    public final void f(int i, ByteBuffer byteBuffer) {
        short s;
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.d = i2;
            s = this.b.getShort(i2);
        } else {
            s = 0;
            this.a = 0;
            this.d = 0;
        }
        this.e = s;
    }

    public final int g() {
        int b = b(6);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int h() {
        int b = b(4);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final ByteBuffer i(int i) {
        int b = b(i);
        if (b == 0) {
            return null;
        }
        ByteBuffer order = this.b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int c = c(b);
        return order;
    }

    public final float j() {
        int b = b(6);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final float k() {
        int b = b(4);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final String l() {
        int b = b(4);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public String m() {
        int b = b(6);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public int n() {
        int b = b(10);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public long p() {
        if (b(6) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    public long q() {
        if (b(4) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final long r() {
        if (b(8) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final aoak s() {
        return t(new aoak());
    }

    public final aoak t(aoak aoakVar) {
        int b = b(20);
        if (b == 0) {
            return null;
        }
        aoakVar.a(b + this.a, this.b);
        return aoakVar;
    }

    public final aoak u() {
        return v(new aoak());
    }

    public final aoak v(aoak aoakVar) {
        int b = b(8);
        if (b == 0) {
            return null;
        }
        aoakVar.a(b + this.a, this.b);
        return aoakVar;
    }

    public final aoak w() {
        return x(new aoak());
    }

    public final aoak x(aoak aoakVar) {
        int b = b(14);
        if (b == 0) {
            return null;
        }
        aoakVar.a(b + this.a, this.b);
        return aoakVar;
    }

    public final aoak y() {
        return z(new aoak());
    }

    public final aoak z(aoak aoakVar) {
        int b = b(16);
        if (b == 0) {
            return null;
        }
        aoakVar.a(b + this.a, this.b);
        return aoakVar;
    }
}
