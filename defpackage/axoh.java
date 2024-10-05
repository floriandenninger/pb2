package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axoh extends aoam {
    public static int aL(aoaj aoajVar, int[] iArr) {
        int length = iArr.length;
        aoajVar.q(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return aoajVar.d();
            }
            aoajVar.i(iArr[length]);
        }
    }

    public static int aM(aoaj aoajVar, int i, float f, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, int i8) {
        aoajVar.p(12);
        aoajVar.u(11, i8);
        aoajVar.t(10, i7);
        aoajVar.u(8, i6);
        aoajVar.u(5, i5);
        aoajVar.u(4, i4);
        aoajVar.t(3, i3);
        aoajVar.t(2, i2);
        aoajVar.s(1, f);
        aoajVar.u(0, i);
        aoajVar.g(9, z, true);
        return aoajVar.c();
    }

    public static int aN(aoaj aoajVar, int[] iArr) {
        int length = iArr.length;
        aoajVar.q(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return aoajVar.d();
            }
            aoajVar.i(iArr[length]);
        }
    }

    public static int aO(aoaj aoajVar, int[] iArr) {
        int length = iArr.length;
        aoajVar.q(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return aoajVar.d();
            }
            aoajVar.i(iArr[length]);
        }
    }

    public final float aI() {
        int b = b(6);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final int aJ() {
        int b = b(20);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final int aK() {
        int b = b(12);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final int aP() {
        int b = b(26);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final int aQ() {
        int b = b(10);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int aR() {
        int b = b(14);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final int aS() {
        int b = b(24);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final axoo aT(int i) {
        axoo axooVar = new axoo();
        int b = b(12);
        if (b == 0) {
            return null;
        }
        axooVar.f(a(c(b) + (i * 4)), this.b);
        return axooVar;
    }

    public final axpd aU(int i) {
        return aV(new axpd(), i);
    }

    public final axpd aV(axpd axpdVar, int i) {
        int b = b(14);
        if (b == 0) {
            return null;
        }
        axpdVar.f(a(c(b) + (i * 4)), this.b);
        return axpdVar;
    }

    public final String aW() {
        int b = b(4);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public final boolean aX() {
        int b = b(22);
        return b == 0 || this.b.get(b + this.a) != 0;
    }

    public final aoam aY(int i) {
        aoam aoamVar = new aoam();
        int b = b(20);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(c(b) + (i * 4)), this.b);
        return aoamVar;
    }

    public final aoam aZ(int i) {
        aoam aoamVar = new aoam();
        int b = b(26);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(c(b) + (i * 4)), this.b);
        return aoamVar;
    }

    @Override // defpackage.aoam
    public final int n() {
        int b = b(8);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
}
