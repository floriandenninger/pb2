package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ak {
    public final aj d;
    public ap a = null;
    public float b = 0.0f;
    boolean c = false;
    boolean e = false;

    public ak(al alVar) {
        this.d = new aj(this, alVar);
    }

    public final void a(ap apVar) {
        ap apVar2 = this.a;
        if (apVar2 != null) {
            this.d.f(apVar2, -1.0f);
            this.a = null;
        }
        float f = -this.d.c(apVar);
        this.a = apVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        aj ajVar = this.d;
        int i = ajVar.f;
        for (int i2 = 0; i != -1 && i2 < ajVar.a; i2++) {
            float[] fArr = ajVar.e;
            fArr[i] = fArr[i] / f;
            i = ajVar.d[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        aj ajVar = this.d;
        int i = ajVar.f;
        for (int i2 = 0; i != -1 && i2 < ajVar.a; i2++) {
            ap apVar = ajVar.b.a[ajVar.c[i]];
            int i3 = 0;
            while (true) {
                int i4 = apVar.g;
                if (i3 < i4) {
                    if (apVar.f[i3] == this) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    ak[] akVarArr = apVar.f;
                    int length = akVarArr.length;
                    if (i4 >= length) {
                        apVar.f = (ak[]) Arrays.copyOf(akVarArr, length + length);
                    }
                    ak[] akVarArr2 = apVar.f;
                    int i5 = apVar.g;
                    akVarArr2[i5] = this;
                    apVar.g = i5 + 1;
                }
            }
            i = ajVar.d[i];
        }
    }

    public final void c(ap apVar, ap apVar2) {
        this.d.f(apVar, 1.0f);
        this.d.f(apVar2, -1.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(ap apVar, ap apVar2, int i, float f, ap apVar3, ap apVar4, int i2) {
        if (apVar2 == apVar3) {
            this.d.f(apVar, 1.0f);
            this.d.f(apVar4, 1.0f);
            this.d.f(apVar2, -2.0f);
            return;
        }
        if (f == 0.5f) {
            this.d.f(apVar, 1.0f);
            this.d.f(apVar2, -1.0f);
            this.d.f(apVar3, -1.0f);
            this.d.f(apVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
                return;
            }
            return;
        }
        if (f <= 0.0f) {
            this.d.f(apVar, -1.0f);
            this.d.f(apVar2, 1.0f);
            this.b = i;
        } else {
            if (f >= 1.0f) {
                this.d.f(apVar3, -1.0f);
                this.d.f(apVar4, 1.0f);
                this.b = i2;
                return;
            }
            float f2 = 1.0f - f;
            this.d.f(apVar, f2);
            this.d.f(apVar2, -f2);
            this.d.f(apVar3, -f);
            this.d.f(apVar4, f);
            if (i > 0 || i2 > 0) {
                this.b = ((-i) * f2) + (i2 * f);
            }
        }
    }

    public final void e(ap apVar, ap apVar2, ap apVar3, ap apVar4, float f) {
        this.d.f(apVar, -1.0f);
        this.d.f(apVar2, 1.0f);
        this.d.f(apVar3, f);
        this.d.f(apVar4, -f);
    }

    public final void g(ap apVar, int i) {
        if (i < 0) {
            this.b = -i;
            this.d.f(apVar, 1.0f);
        } else {
            this.b = i;
            this.d.f(apVar, -1.0f);
        }
    }

    public final void h(ap apVar, ap apVar2, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.d.f(apVar, 1.0f);
                this.d.f(apVar2, -1.0f);
                return;
            }
        }
        this.d.f(apVar, -1.0f);
        this.d.f(apVar2, 1.0f);
    }

    public final void i(ap apVar, ap apVar2, ap apVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.d.f(apVar, 1.0f);
                this.d.f(apVar2, -1.0f);
                this.d.f(apVar3, -1.0f);
                return;
            }
        }
        this.d.f(apVar, -1.0f);
        this.d.f(apVar2, 1.0f);
        this.d.f(apVar3, 1.0f);
    }

    public final void j(ap apVar, ap apVar2, ap apVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.d.f(apVar, 1.0f);
                this.d.f(apVar2, -1.0f);
                this.d.f(apVar3, 1.0f);
                return;
            }
        }
        this.d.f(apVar, -1.0f);
        this.d.f(apVar2, 1.0f);
        this.d.f(apVar3, -1.0f);
    }

    public final void k(ak akVar) {
        this.d.g(this, akVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r7 = this;
            ap r0 = r7.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L1a
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            ap r1 = r7.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L1a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r7.b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L47
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r7.b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L48
        L47:
            r1 = 0
        L48:
            aj r5 = r7.d
            int r5 = r5.a
        L4c:
            if (r2 >= r5) goto Lcf
            aj r6 = r7.d
            ap r6 = r6.d(r2)
            if (r6 != 0) goto L58
            goto Lcb
        L58:
            aj r6 = r7.d
            float r6 = r6.b(r2)
            if (r1 != 0) goto L76
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 >= 0) goto L9e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L9d
        L76:
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L8c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L9e
        L8c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L9d:
            float r6 = -r6
        L9e:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "null"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto Lca
        Lb6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " null"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Lca:
            r1 = 1
        Lcb:
            int r2 = r2 + 1
            goto L4c
        Lcf:
            if (r1 != 0) goto Le2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Le2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak.toString():java.lang.String");
    }

    public final void f(float f, float f2, float f3, ap apVar, int i, ap apVar2, int i2, ap apVar3, int i3, ap apVar4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.b = ((-i) - i2) + i3 + i4;
            this.d.f(apVar, 1.0f);
            this.d.f(apVar2, -1.0f);
            this.d.f(apVar4, 1.0f);
            this.d.f(apVar3, -1.0f);
            return;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.b = ((-i) - i2) + (i3 * f4) + (i4 * f4);
        this.d.f(apVar, 1.0f);
        this.d.f(apVar2, -1.0f);
        this.d.f(apVar4, f4);
        this.d.f(apVar3, -f4);
    }
}
