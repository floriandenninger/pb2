package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afb {
    public static boolean a = false;
    public static long b = 0;
    private static int k = 1000;
    aez[] e;
    public final afa j;
    private final aez r;
    private aez s;
    public boolean c = false;
    int d = 0;
    private int l = 32;
    private int m = 32;
    public boolean f = false;
    public boolean g = false;
    private boolean[] n = new boolean[32];
    int h = 1;
    int i = 0;
    private int o = 32;
    private aff[] p = new aff[k];
    private int q = 0;

    public afb() {
        this.e = null;
        this.e = new aez[32];
        t();
        afa afaVar = new afa();
        this.j = afaVar;
        this.r = new afe(afaVar);
        this.s = new aez(afaVar);
    }

    public static final int o(Object obj) {
        aff affVar = ((afj) obj).h;
        if (affVar != null) {
            return (int) (affVar.f + 0.5f);
        }
        return 0;
    }

    private final void r() {
        for (int i = 0; i < this.i; i++) {
            aez aezVar = this.e[i];
            aezVar.a.f = aezVar.b;
        }
    }

    private final void s() {
        int i = this.l;
        int i2 = i + i;
        this.l = i2;
        this.e = (aez[]) Arrays.copyOf(this.e, i2);
        afa afaVar = this.j;
        afaVar.a = (aff[]) Arrays.copyOf(afaVar.a, this.l);
        int i3 = this.l;
        this.n = new boolean[i3];
        this.m = i3;
        this.o = i3;
    }

    private final void t() {
        for (int i = 0; i < this.i; i++) {
            aez aezVar = this.e[i];
            if (aezVar != null) {
                this.j.b.b(aezVar);
            }
            this.e[i] = null;
        }
    }

    private final void u(aez aezVar) {
        aey aeyVar;
        int i;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.n[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            i3++;
            int i4 = this.h;
            if (i3 >= i4 + i4) {
                return;
            }
            aff affVar = aezVar.a;
            if (affVar != null) {
                this.n[affVar.c] = true;
            }
            aff k2 = aezVar.k(this.n);
            if (k2 != null) {
                boolean[] zArr = this.n;
                int i5 = k2.c;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (k2 != null) {
                float f = Float.MAX_VALUE;
                int i6 = -1;
                for (int i7 = 0; i7 < this.i; i7++) {
                    aez aezVar2 = this.e[i7];
                    if (aezVar2.a.n != 1 && !aezVar2.d && (i = (aeyVar = aezVar2.e).f) != -1) {
                        int i8 = 0;
                        while (true) {
                            if (i != -1 && i8 < aeyVar.a) {
                                if (aeyVar.c[i] != k2.c) {
                                    i = aeyVar.d[i];
                                    i8++;
                                } else {
                                    float a2 = aezVar2.e.a(k2);
                                    if (a2 < 0.0f) {
                                        float f2 = (-aezVar2.b) / a2;
                                        if (f2 < f) {
                                            i6 = i7;
                                            f = f2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i6 >= 0) {
                    aez aezVar3 = this.e[i6];
                    aezVar3.a.d = -1;
                    aezVar3.b(k2);
                    aff affVar2 = aezVar3.a;
                    affVar2.d = i6;
                    affVar2.e(this, aezVar3);
                }
            } else {
                z = true;
            }
        }
    }

    private final aff v(int i) {
        aff affVar = (aff) this.j.c.a();
        if (affVar == null) {
            affVar = new aff(i);
            affVar.n = i;
        } else {
            affVar.c();
            affVar.n = i;
        }
        int i2 = this.q;
        int i3 = k;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            k = i4;
            this.p = (aff[]) Arrays.copyOf(this.p, i4);
        }
        aff[] affVarArr = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        affVarArr[i5] = affVar;
        return affVar;
    }

    public final aez a() {
        aez aezVar = (aez) this.j.b.a();
        if (aezVar == null) {
            aezVar = new aez(this.j);
            b++;
        } else {
            aezVar.a = null;
            aezVar.e.f();
            aezVar.b = 0.0f;
            aezVar.d = false;
        }
        aff.a++;
        return aezVar;
    }

    public final aff b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.m) {
            s();
        }
        afj afjVar = (afj) obj;
        aff affVar = afjVar.h;
        if (affVar == null) {
            afjVar.i();
            affVar = afjVar.h;
        }
        int i = affVar.c;
        if (i != -1) {
            if (i > this.d || this.j.a[i] == null) {
                if (i != -1) {
                    affVar.c();
                }
            }
            return affVar;
        }
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        affVar.c = i2;
        affVar.n = 1;
        this.j.a[i2] = affVar;
        return affVar;
    }

    public final aff c() {
        if (this.h + 1 >= this.m) {
            s();
        }
        aff v = v(3);
        int i = this.d + 1;
        this.d = i;
        this.h++;
        v.c = i;
        this.j.a[i] = v;
        return v;
    }

    public final void d(aff affVar, aff affVar2, int i, float f, aff affVar3, aff affVar4, int i2, int i3) {
        aez a2 = a();
        if (affVar2 == affVar3) {
            a2.e.g(affVar, 1.0f);
            a2.e.g(affVar4, 1.0f);
            a2.e.g(affVar2, -2.0f);
        } else if (f == 0.5f) {
            a2.e.g(affVar, 1.0f);
            a2.e.g(affVar2, -1.0f);
            a2.e.g(affVar3, -1.0f);
            a2.e.g(affVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                a2.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            a2.e.g(affVar, -1.0f);
            a2.e.g(affVar2, 1.0f);
            a2.b = i;
        } else if (f >= 1.0f) {
            a2.e.g(affVar4, -1.0f);
            a2.e.g(affVar3, 1.0f);
            a2.b = -i2;
        } else {
            float f2 = 1.0f - f;
            a2.e.g(affVar, f2);
            a2.e.g(affVar2, -f2);
            a2.e.g(affVar3, -f);
            a2.e.g(affVar4, f);
            if (i > 0 || i2 > 0) {
                a2.b = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            a2.f(this, i3);
        }
        e(a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.aez r17) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afb.e(aez):void");
    }

    public final void f(aff affVar, int i) {
        int i2 = affVar.d;
        if (i2 == -1) {
            affVar.d(this, i);
            for (int i3 = 0; i3 < this.d + 1; i3++) {
                aff affVar2 = this.j.a[i3];
            }
            return;
        }
        if (i2 != -1) {
            aez aezVar = this.e[i2];
            if (aezVar.d) {
                aezVar.b = i;
                return;
            }
            if (aezVar.e.a == 0) {
                aezVar.d = true;
                aezVar.b = i;
                return;
            }
            aez a2 = a();
            if (i < 0) {
                a2.b = -i;
                a2.e.g(affVar, 1.0f);
            } else {
                a2.b = i;
                a2.e.g(affVar, -1.0f);
            }
            e(a2);
            return;
        }
        aez a3 = a();
        a3.a = affVar;
        float f = i;
        affVar.f = f;
        a3.b = f;
        a3.d = true;
        e(a3);
    }

    public final void g(aff affVar, aff affVar2, int i, int i2) {
        aez a2 = a();
        aff c = c();
        c.e = 0;
        a2.h(affVar, affVar2, c, i);
        if (i2 != 8) {
            i(a2, (int) (-a2.e.a(c)), i2);
        }
        e(a2);
    }

    public final void h(aff affVar, aff affVar2, int i, int i2) {
        aez a2 = a();
        aff c = c();
        c.e = 0;
        a2.i(affVar, affVar2, c, i);
        if (i2 != 8) {
            i(a2, (int) (-a2.e.a(c)), i2);
        }
        e(a2);
    }

    final void i(aez aezVar, int i, int i2) {
        aezVar.e.g(p(i2), i);
    }

    public final void j() {
        if (this.r.e()) {
            r();
            return;
        }
        if (this.g) {
            for (int i = 0; i < this.i; i++) {
                if (!this.e[i].d) {
                    l(this.r);
                    return;
                }
            }
            r();
            return;
        }
        l(this.r);
    }

    public final void k() {
        afa afaVar;
        int i = 0;
        while (true) {
            afaVar = this.j;
            aff[] affVarArr = afaVar.a;
            if (i >= affVarArr.length) {
                break;
            }
            aff affVar = affVarArr[i];
            if (affVar != null) {
                affVar.c();
            }
            i++;
        }
        afc afcVar = afaVar.c;
        aff[] affVarArr2 = this.p;
        int i2 = this.q;
        int length = affVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            aff affVar2 = affVarArr2[i3];
            int i4 = afcVar.b;
            if (i4 < 256) {
                afcVar.a[i4] = affVar2;
                afcVar.b = i4 + 1;
            }
        }
        this.q = 0;
        Arrays.fill(this.j.a, (Object) null);
        this.d = 0;
        afe afeVar = (afe) this.r;
        afeVar.f = 0;
        afeVar.b = 0.0f;
        this.h = 1;
        for (int i5 = 0; i5 < this.i; i5++) {
            aez aezVar = this.e[i5];
        }
        t();
        this.i = 0;
        this.s = new aez(this.j);
    }

    final void l(aez aezVar) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.i) {
                break;
            }
            aez aezVar2 = this.e[i];
            if (aezVar2.a.n != 1) {
                float f = 0.0f;
                if (aezVar2.b < 0.0f) {
                    boolean z2 = false;
                    int i2 = 0;
                    while (!z2) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.i) {
                            aez aezVar3 = this.e[i3];
                            if (aezVar3.a.n != 1 && !aezVar3.d && aezVar3.b < f) {
                                int i7 = aezVar3.e.a;
                                int i8 = 0;
                                while (i8 < i7) {
                                    aff d = aezVar3.e.d(i8);
                                    float a2 = aezVar3.e.a(d);
                                    if (a2 > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = d.h[i9] / a2;
                                            if ((f3 < f2 && i9 == i6) || i9 > i6) {
                                                i5 = d.c;
                                                i6 = i9;
                                                f2 = f3;
                                                i4 = i3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i3++;
                            f = 0.0f;
                        }
                        if (i4 != -1) {
                            aez aezVar4 = this.e[i4];
                            aezVar4.a.d = -1;
                            aezVar4.b(this.j.a[i5]);
                            aff affVar = aezVar4.a;
                            affVar.d = i4;
                            affVar.e(this, aezVar4);
                            z = false;
                        } else {
                            z = true;
                        }
                        z2 = (!(i2 <= this.h / 2)) | z;
                        f = 0.0f;
                    }
                }
            }
            i++;
        }
        u(aezVar);
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.aff r6, defpackage.aff r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 8
            if (r9 != r0) goto L18
            boolean r9 = r7.g
            if (r9 == 0) goto L16
            int r9 = r6.d
            r1 = -1
            if (r9 == r1) goto Le
            goto L16
        Le:
            float r7 = r7.f
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.d(r5, r7)
            return
        L16:
            r9 = 8
        L18:
            aez r1 = r5.a()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L39
            if (r8 >= 0) goto L27
            int r8 = -r8
            r4 = 1
            goto L28
        L27:
            r4 = 0
        L28:
            float r8 = (float) r8
            r1.b = r8
            if (r4 != 0) goto L2e
            goto L39
        L2e:
            aey r8 = r1.e
            r8.g(r6, r2)
            aey r6 = r1.e
            r6.g(r7, r3)
            goto L43
        L39:
            aey r8 = r1.e
            r8.g(r6, r3)
            aey r6 = r1.e
            r6.g(r7, r2)
        L43:
            if (r9 == r0) goto L48
            r1.f(r5, r9)
        L48:
            r5.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afb.m(aff, aff, int, int):void");
    }

    public final void n(aff affVar, aff affVar2, aff affVar3, aff affVar4, float f) {
        aez a2 = a();
        a2.g(affVar, affVar2, affVar3, affVar4, f);
        e(a2);
    }

    public final aff p(int i) {
        if (this.h + 1 >= this.m) {
            s();
        }
        aff v = v(4);
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        v.c = i2;
        v.e = i;
        this.j.a[i2] = v;
        afe afeVar = (afe) this.r;
        afd afdVar = afeVar.g;
        afdVar.a = v;
        Arrays.fill(afdVar.a.i, 0.0f);
        v.i[v.e] = 1.0f;
        afeVar.m(v);
        return v;
    }

    private final void q(aez aezVar) {
        int i;
        if (aezVar.d) {
            aezVar.a.d(this, aezVar.b);
        } else {
            aez[] aezVarArr = this.e;
            int i2 = this.i;
            aezVarArr[i2] = aezVar;
            aff affVar = aezVar.a;
            affVar.d = i2;
            this.i = i2 + 1;
            affVar.e(this, aezVar);
        }
        if (this.c) {
            int i3 = 0;
            while (i3 < this.i) {
                if (this.e[i3] == null) {
                    System.out.println("WTF");
                }
                aez aezVar2 = this.e[i3];
                if (aezVar2 != null && aezVar2.d) {
                    aezVar2.a.d(this, aezVar2.b);
                    this.j.b.b(aezVar2);
                    this.e[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.i;
                        if (i4 >= i) {
                            break;
                        }
                        aez[] aezVarArr2 = this.e;
                        int i6 = i4 - 1;
                        aez aezVar3 = aezVarArr2[i4];
                        aezVarArr2[i6] = aezVar3;
                        aff affVar2 = aezVar3.a;
                        if (affVar2.d == i4) {
                            affVar2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.e[i5] = null;
                    }
                    this.i = i - 1;
                    i3--;
                }
                i3++;
            }
            this.c = false;
        }
    }
}
