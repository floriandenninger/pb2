package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class an {
    private static int h = 1000;
    public ak[] c;
    public final al g;
    int a = 0;
    public final am b = new am();
    private int i = 32;
    private int j = 32;
    public boolean[] d = new boolean[32];
    public int e = 1;
    public int f = 0;
    private int k = 32;
    private ap[] l = new ap[h];
    private int m = 0;
    private ak[] n = new ak[32];

    public an() {
        this.c = null;
        this.c = new ak[32];
        r();
        this.g = new al();
    }

    public static ak b(an anVar, ap apVar, ap apVar2, int i, float f, ap apVar3, ap apVar4, int i2, boolean z) {
        ak a = anVar.a();
        a.d(apVar, apVar2, i, f, apVar3, apVar4, i2);
        if (z) {
            ap d = anVar.d();
            ap d2 = anVar.d();
            d.c = 4;
            d2.c = 4;
            a.c(d, d2);
        }
        return a;
    }

    public static ak c(an anVar, ap apVar, ap apVar2, int i, boolean z) {
        ak a = anVar.a();
        a.h(apVar, apVar2, i);
        if (z) {
            anVar.k(a, 1);
        }
        return a;
    }

    public static final int p(Object obj) {
        ap apVar = ((aq) obj).f;
        if (apVar != null) {
            return (int) (apVar.d + 0.5f);
        }
        return 0;
    }

    private final void q() {
        int i = this.i;
        int i2 = i + i;
        this.i = i2;
        this.c = (ak[]) Arrays.copyOf(this.c, i2);
        al alVar = this.g;
        alVar.a = (ap[]) Arrays.copyOf(alVar.a, this.i);
        int i3 = this.i;
        this.d = new boolean[i3];
        this.j = i3;
        this.k = i3;
        this.b.a.clear();
    }

    private final void r() {
        int i = 0;
        while (true) {
            ak[] akVarArr = this.c;
            if (i >= akVarArr.length) {
                return;
            }
            ak akVar = akVarArr[i];
            if (akVar != null) {
                this.g.b.b(akVar);
            }
            this.c[i] = null;
            i++;
        }
    }

    private final ap s(int i) {
        ap apVar = (ap) this.g.c.a();
        if (apVar == null) {
            apVar = new ap(i);
        } else {
            apVar.b();
            apVar.h = i;
        }
        int i2 = this.m;
        int i3 = h;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            h = i4;
            this.l = (ap[]) Arrays.copyOf(this.l, i4);
        }
        ap[] apVarArr = this.l;
        int i5 = this.m;
        this.m = i5 + 1;
        apVarArr[i5] = apVar;
        return apVar;
    }

    public final ak a() {
        ak akVar = (ak) this.g.b.a();
        if (akVar == null) {
            return new ak(this.g);
        }
        akVar.a = null;
        aj ajVar = akVar.d;
        ajVar.f = -1;
        ajVar.g = -1;
        ajVar.h = false;
        ajVar.a = 0;
        akVar.b = 0.0f;
        akVar.e = false;
        return akVar;
    }

    public final ap d() {
        if (this.e + 1 >= this.j) {
            q();
        }
        ap s = s(4);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        s.a = i;
        this.g.a[i] = s;
        return s;
    }

    public final ap e(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.e + 1 >= this.j) {
            q();
        }
        aq aqVar = (aq) obj;
        ap apVar = aqVar.f;
        if (apVar == null) {
            aqVar.e();
            apVar = aqVar.f;
        }
        int i = apVar.a;
        if (i != -1) {
            if (i > this.a || this.g.a[i] == null) {
                if (i != -1) {
                    apVar.b();
                }
            }
            return apVar;
        }
        int i2 = this.a + 1;
        this.a = i2;
        this.e++;
        apVar.a = i2;
        apVar.h = 1;
        this.g.a[i2] = apVar;
        return apVar;
    }

    public final ap f() {
        if (this.e + 1 >= this.j) {
            q();
        }
        ap s = s(3);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        s.a = i;
        this.g.a[i] = s;
        return s;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.ak r13) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an.g(ak):void");
    }

    public final void h(ap apVar, int i) {
        int i2 = apVar.b;
        if (i2 != -1) {
            ak akVar = this.c[i2];
            if (akVar.e) {
                akVar.b = i;
                return;
            }
            ak a = a();
            a.g(apVar, i);
            g(a);
            return;
        }
        ak a2 = a();
        a2.a = apVar;
        float f = i;
        apVar.d = f;
        a2.b = f;
        a2.e = true;
        g(a2);
    }

    public final void i(ap apVar, ap apVar2, int i, int i2) {
        ak a = a();
        ap f = f();
        f.c = i2;
        a.i(apVar, apVar2, f, i);
        g(a);
    }

    public final void j(ap apVar, ap apVar2, int i, int i2) {
        ak a = a();
        ap f = f();
        f.c = i2;
        a.j(apVar, apVar2, f, i);
        g(a);
    }

    public final void k(ak akVar, int i) {
        akVar.d.f(d(), i);
    }

    public final void l() {
        al alVar;
        int i = 0;
        while (true) {
            alVar = this.g;
            ap[] apVarArr = alVar.a;
            if (i >= apVarArr.length) {
                break;
            }
            ap apVar = apVarArr[i];
            if (apVar != null) {
                apVar.b();
            }
            i++;
        }
        ao aoVar = alVar.c;
        ap[] apVarArr2 = this.l;
        int i2 = this.m;
        int length = apVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ap apVar2 = apVarArr2[i3];
            int i4 = aoVar.b;
            if (i4 < 256) {
                aoVar.a[i4] = apVar2;
                aoVar.b = i4 + 1;
            }
        }
        this.m = 0;
        Arrays.fill(this.g.a, (Object) null);
        this.a = 0;
        this.b.a.clear();
        this.e = 1;
        for (int i5 = 0; i5 < this.f; i5++) {
            this.c[i5].c = false;
        }
        r();
        this.f = 0;
    }

    public final void m(ap apVar, ap apVar2, int i, float f, ap apVar3, ap apVar4, int i2) {
        ak a = a();
        a.d(apVar, apVar2, i, f, apVar3, apVar4, i2);
        ap d = d();
        ap d2 = d();
        d.c = 4;
        d2.c = 4;
        a.c(d, d2);
        g(a);
    }

    public final void n(ap apVar, ap apVar2, int i, int i2) {
        ak a = a();
        a.h(apVar, apVar2, i);
        ap d = d();
        ap d2 = d();
        d.c = i2;
        d2.c = i2;
        a.c(d, d2);
        g(a);
    }

    public final void o(am amVar) {
        int i = 0;
        while (true) {
            if (i >= this.f) {
                break;
            }
            ak akVar = this.c[i];
            if (akVar.a.h != 1 && akVar.b < 0.0f) {
                while (true) {
                    int i2 = -1;
                    int i3 = -1;
                    int i4 = 0;
                    float f = Float.MAX_VALUE;
                    for (int i5 = 0; i5 < this.f; i5++) {
                        ak akVar2 = this.c[i5];
                        if (akVar2.a.h != 1 && akVar2.b < 0.0f) {
                            for (int i6 = 1; i6 < this.e; i6++) {
                                ap apVar = this.g.a[i6];
                                float a = akVar2.d.a(apVar);
                                if (a > 0.0f) {
                                    for (int i7 = 0; i7 < 6; i7++) {
                                        float f2 = apVar.e[i7] / a;
                                        if ((f2 < f && i7 == i4) || i7 > i4) {
                                            f = f2;
                                            i2 = i5;
                                            i3 = i6;
                                            i4 = i7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i2 == -1) {
                        break;
                    }
                    ak akVar3 = this.c[i2];
                    akVar3.a.b = -1;
                    akVar3.a(this.g.a[i3]);
                    akVar3.a.b = i2;
                    for (int i8 = 0; i8 < this.f; i8++) {
                        this.c[i8].k(akVar3);
                    }
                    amVar.a(this);
                }
            } else {
                i++;
            }
        }
        for (int i9 = 0; i9 < this.f; i9++) {
            ak akVar4 = this.c[i9];
            if (akVar4.a.h != 1 && akVar4.b < 0.0f) {
                return;
            }
        }
    }
}
