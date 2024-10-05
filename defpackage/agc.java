package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agc extends agg {
    private static final int[] a = new int[2];

    public agc(afk afkVar) {
        super(afkVar);
        this.i.l = 4;
        this.j.l = 5;
        this.g = 0;
    }

    private static final void n(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 != 0) {
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            } else {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    @Override // defpackage.agg
    public final void b() {
        afk afkVar;
        afk afkVar2;
        afk afkVar3;
        afk afkVar4 = this.d;
        if (afkVar4.e) {
            this.f.c(afkVar4.j());
        }
        if (!this.f.i) {
            int N = this.d.N();
            this.k = N;
            if (N != 3) {
                if (this.k != 4 || (afkVar3 = this.d.T) == null || (afkVar3.N() != 1 && afkVar3.N() != 4)) {
                    if (this.k == 1) {
                        this.f.c(this.d.j());
                    }
                } else {
                    int j = afkVar3.j();
                    int b = this.d.f45J.b();
                    int b2 = this.d.L.b();
                    j(this.i, afkVar3.h.i, this.d.f45J.b());
                    j(this.j, afkVar3.h.j, -this.d.L.b());
                    this.f.c((j - b) - b2);
                    return;
                }
            }
        } else if (this.k == 4 && (afkVar = this.d.T) != null && (afkVar.N() == 1 || afkVar.N() == 4)) {
            j(this.i, afkVar.h.i, this.d.f45J.b());
            j(this.j, afkVar.h.j, -this.d.L.b());
            return;
        }
        afy afyVar = this.f;
        if (afyVar.i) {
            afk afkVar5 = this.d;
            if (afkVar5.e) {
                afj[] afjVarArr = afkVar5.R;
                afj afjVar = afjVarArr[0];
                afj afjVar2 = afjVar.e;
                if (afjVar2 != null && afjVarArr[1].e != null) {
                    if (afkVar5.I()) {
                        this.i.e = this.d.R[0].b();
                        this.j.e = -this.d.R[1].b();
                        return;
                    }
                    afx k = k(this.d.R[0]);
                    if (k != null) {
                        j(this.i, k, this.d.R[0].b());
                    }
                    afx k2 = k(this.d.R[1]);
                    if (k2 != null) {
                        j(this.j, k2, -this.d.R[1].b());
                    }
                    this.i.b = true;
                    this.j.b = true;
                    return;
                }
                if (afjVar2 != null) {
                    afx k3 = k(afjVar);
                    if (k3 != null) {
                        j(this.i, k3, this.d.R[0].b());
                        j(this.j, this.i, this.f.f);
                        return;
                    }
                    return;
                }
                afj afjVar3 = afjVarArr[1];
                if (afjVar3.e != null) {
                    afx k4 = k(afjVar3);
                    if (k4 != null) {
                        j(this.j, k4, -this.d.R[1].b());
                        j(this.i, this.j, -this.f.f);
                        return;
                    }
                    return;
                }
                if ((afkVar5 instanceof afo) || afkVar5.T == null || afkVar5.L(7).e != null) {
                    return;
                }
                afk afkVar6 = this.d;
                j(this.i, afkVar6.T.h.i, afkVar6.k());
                j(this.j, this.i, this.f.f);
                return;
            }
        }
        if (this.k == 3) {
            afk afkVar7 = this.d;
            int i = afkVar7.s;
            if (i == 2) {
                afk afkVar8 = afkVar7.T;
                if (afkVar8 != null) {
                    afy afyVar2 = afkVar8.i.f;
                    afyVar.k.add(afyVar2);
                    afyVar2.j.add(this.f);
                    afy afyVar3 = this.f;
                    afyVar3.b = true;
                    afyVar3.j.add(this.i);
                    this.f.j.add(this.j);
                }
            } else if (i == 3) {
                if (afkVar7.t == 3) {
                    this.i.a = this;
                    this.j.a = this;
                    age ageVar = afkVar7.i;
                    ageVar.i.a = this;
                    ageVar.j.a = this;
                    afyVar.a = this;
                    if (afkVar7.J()) {
                        this.f.k.add(this.d.i.f);
                        this.d.i.f.j.add(this.f);
                        age ageVar2 = this.d.i;
                        ageVar2.f.a = this;
                        this.f.k.add(ageVar2.i);
                        this.f.k.add(this.d.i.j);
                        this.d.i.i.j.add(this.f);
                        this.d.i.j.j.add(this.f);
                    } else if (this.d.I()) {
                        this.d.i.f.k.add(this.f);
                        this.f.j.add(this.d.i.f);
                    } else {
                        this.d.i.f.k.add(this.f);
                    }
                } else {
                    afy afyVar4 = afkVar7.i.f;
                    afyVar.k.add(afyVar4);
                    afyVar4.j.add(this.f);
                    this.d.i.i.j.add(this.f);
                    this.d.i.j.j.add(this.f);
                    afy afyVar5 = this.f;
                    afyVar5.b = true;
                    afyVar5.j.add(this.i);
                    this.f.j.add(this.j);
                    this.i.k.add(this.f);
                    this.j.k.add(this.f);
                }
            }
        }
        afk afkVar9 = this.d;
        afj[] afjVarArr2 = afkVar9.R;
        afj afjVar4 = afjVarArr2[0];
        afj afjVar5 = afjVar4.e;
        if (afjVar5 != null && afjVarArr2[1].e != null) {
            if (afkVar9.I()) {
                this.i.e = this.d.R[0].b();
                this.j.e = -this.d.R[1].b();
                return;
            }
            afx k5 = k(this.d.R[0]);
            afx k6 = k(this.d.R[1]);
            if (k5 != null) {
                k5.a(this);
            }
            if (k6 != null) {
                k6.a(this);
            }
            this.l = 4;
            return;
        }
        if (afjVar5 != null) {
            afx k7 = k(afjVar4);
            if (k7 != null) {
                j(this.i, k7, this.d.R[0].b());
                i(this.j, this.i, 1, this.f);
                return;
            }
            return;
        }
        afj afjVar6 = afjVarArr2[1];
        if (afjVar6.e != null) {
            afx k8 = k(afjVar6);
            if (k8 != null) {
                j(this.j, k8, -this.d.R[1].b());
                i(this.i, this.j, -1, this.f);
                return;
            }
            return;
        }
        if ((afkVar9 instanceof afo) || (afkVar2 = afkVar9.T) == null) {
            return;
        }
        j(this.i, afkVar2.h.i, afkVar9.k());
        i(this.j, this.i, 1, this.f);
    }

    @Override // defpackage.agg
    public final void c() {
        afx afxVar = this.i;
        if (afxVar.i) {
            this.d.Y = afxVar.f;
        }
    }

    @Override // defpackage.agg
    public final void d() {
        this.e = null;
        this.i.b();
        this.j.b();
        this.f.b();
        this.h = false;
    }

    @Override // defpackage.agg
    public final boolean e() {
        return this.k != 3 || this.d.s == 0;
    }

    public final void g() {
        this.h = false;
        this.i.b();
        this.i.i = false;
        this.j.b();
        this.j.i = false;
        this.f.i = false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d.ah);
        return valueOf.length() != 0 ? "HorizontalRun ".concat(valueOf) : new String("HorizontalRun ");
    }

    @Override // defpackage.agg, defpackage.afv
    public final void f() {
        float f;
        float f2;
        float f3;
        int i = this.l;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 3) {
            afk afkVar = this.d;
            m(afkVar.f45J, afkVar.L, 0);
            return;
        }
        afy afyVar = this.f;
        if (!afyVar.i && this.k == 3) {
            afk afkVar2 = this.d;
            int i3 = afkVar2.s;
            if (i3 == 2) {
                afk afkVar3 = afkVar2.T;
                if (afkVar3 != null) {
                    if (afkVar3.h.f.i) {
                        afyVar.c((int) ((r1.f * afkVar2.x) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = afkVar2.t;
                if (i4 == 0 || i4 == 3) {
                    age ageVar = afkVar2.i;
                    afx afxVar = ageVar.i;
                    afx afxVar2 = ageVar.j;
                    afj afjVar = afkVar2.f45J.e;
                    afj afjVar2 = afkVar2.K.e;
                    afj afjVar3 = afkVar2.L.e;
                    afj afjVar4 = afkVar2.M.e;
                    int i5 = afkVar2.X;
                    if (afjVar != null && afjVar2 != null && afjVar3 != null && afjVar4 != null) {
                        float f4 = afkVar2.W;
                        if (!afxVar.i || !afxVar2.i) {
                            afx afxVar3 = this.i;
                            if (afxVar3.i) {
                                afx afxVar4 = this.j;
                                if (afxVar4.i) {
                                    if (!afxVar.c || !afxVar2.c) {
                                        return;
                                    }
                                    int i6 = afxVar3.f;
                                    int i7 = afxVar3.e;
                                    int i8 = afxVar4.f;
                                    int i9 = afxVar4.e;
                                    int i10 = ((afx) afxVar.k.get(0)).f;
                                    int i11 = afxVar.e;
                                    int i12 = ((afx) afxVar2.k.get(0)).f;
                                    int i13 = afxVar2.e;
                                    int[] iArr = a;
                                    n(iArr, i7 + i6, i8 - i9, i10 + i11, i12 - i13, f4, i5);
                                    this.f.c(iArr[0]);
                                    this.d.i.f.c(iArr[1]);
                                }
                            }
                            afx afxVar5 = this.i;
                            if (!afxVar5.c || !this.j.c || !afxVar.c || !afxVar2.c) {
                                return;
                            }
                            int i14 = ((afx) afxVar5.k.get(0)).f;
                            int i15 = this.i.e;
                            int i16 = ((afx) this.j.k.get(0)).f;
                            int i17 = this.j.e;
                            int i18 = ((afx) afxVar.k.get(0)).f;
                            int i19 = afxVar.e;
                            int i20 = ((afx) afxVar2.k.get(0)).f;
                            int i21 = afxVar2.e;
                            int[] iArr2 = a;
                            n(iArr2, i14 + i15, i16 - i17, i18 + i19, i20 - i21, f4, i5);
                            this.f.c(iArr2[0]);
                            this.d.i.f.c(iArr2[1]);
                        } else {
                            afx afxVar6 = this.i;
                            if (afxVar6.c && this.j.c) {
                                int i22 = ((afx) afxVar6.k.get(0)).f;
                                int i23 = this.i.e;
                                int i24 = ((afx) this.j.k.get(0)).f;
                                int i25 = this.j.e;
                                int i26 = afxVar.f;
                                int i27 = afxVar.e;
                                int i28 = afxVar2.f;
                                int i29 = afxVar2.e;
                                int[] iArr3 = a;
                                n(iArr3, i22 + i23, i24 - i25, i26 + i27, i28 - i29, f4, i5);
                                this.f.c(iArr3[0]);
                                this.d.i.f.c(iArr3[1]);
                                return;
                            }
                            return;
                        }
                    } else if (afjVar != null && afjVar3 != null) {
                        afx afxVar7 = this.i;
                        if (!afxVar7.c || !this.j.c) {
                            return;
                        }
                        float f5 = afkVar2.W;
                        int i30 = ((afx) afxVar7.k.get(0)).f + this.i.e;
                        int i31 = ((afx) this.j.k.get(0)).f - this.j.e;
                        if (i5 != -1 && i5 != 0) {
                            int h = h(i31 - i30, 0);
                            int i32 = (int) ((h / f5) + 0.5f);
                            int h2 = h(i32, 1);
                            if (i32 != h2) {
                                h = (int) ((h2 * f5) + 0.5f);
                            }
                            this.f.c(h);
                            this.d.i.f.c(h2);
                        } else {
                            int h3 = h(i31 - i30, 0);
                            int i33 = (int) ((h3 * f5) + 0.5f);
                            int h4 = h(i33, 1);
                            if (i33 != h4) {
                                h3 = (int) ((h4 / f5) + 0.5f);
                            }
                            this.f.c(h3);
                            this.d.i.f.c(h4);
                        }
                    } else if (afjVar2 != null && afjVar4 != null) {
                        if (!afxVar.c || !afxVar2.c) {
                            return;
                        }
                        float f6 = afkVar2.W;
                        int i34 = ((afx) afxVar.k.get(0)).f + afxVar.e;
                        int i35 = ((afx) afxVar2.k.get(0)).f - afxVar2.e;
                        if (i5 == 0) {
                            int h5 = h(i35 - i34, 1);
                            int i36 = (int) ((h5 * f6) + 0.5f);
                            int h6 = h(i36, 0);
                            if (i36 != h6) {
                                h5 = (int) ((h6 / f6) + 0.5f);
                            }
                            this.f.c(h6);
                            this.d.i.f.c(h5);
                        } else {
                            int h7 = h(i35 - i34, 1);
                            int i37 = (int) ((h7 / f6) + 0.5f);
                            int h8 = h(i37, 0);
                            if (i37 != h8) {
                                h7 = (int) ((h8 * f6) + 0.5f);
                            }
                            this.f.c(h8);
                            this.d.i.f.c(h7);
                        }
                    }
                } else {
                    int i38 = afkVar2.X;
                    if (i38 == -1) {
                        f = afkVar2.i.f.f;
                        f2 = afkVar2.W;
                    } else if (i38 != 0) {
                        f = afkVar2.i.f.f;
                        f2 = afkVar2.W;
                    } else {
                        f3 = afkVar2.i.f.f / afkVar2.W;
                        afyVar.c((int) (f3 + 0.5f));
                    }
                    f3 = f * f2;
                    afyVar.c((int) (f3 + 0.5f));
                }
            }
        }
        afx afxVar8 = this.i;
        if (afxVar8.c) {
            afx afxVar9 = this.j;
            if (afxVar9.c) {
                if (afxVar8.i && afxVar9.i && this.f.i) {
                    return;
                }
                if (!this.f.i && this.k == 3) {
                    afk afkVar4 = this.d;
                    if (afkVar4.s == 0 && !afkVar4.I()) {
                        afx afxVar10 = (afx) this.i.k.get(0);
                        afx afxVar11 = (afx) this.j.k.get(0);
                        int i39 = afxVar10.f;
                        afx afxVar12 = this.i;
                        int i40 = i39 + afxVar12.e;
                        int i41 = afxVar11.f + this.j.e;
                        afxVar12.c(i40);
                        this.j.c(i41);
                        this.f.c(i41 - i40);
                        return;
                    }
                }
                if (!this.f.i && this.k == 3 && this.c == 1 && this.i.k.size() > 0 && this.j.k.size() > 0) {
                    afx afxVar13 = (afx) this.i.k.get(0);
                    int min = Math.min((((afx) this.j.k.get(0)).f + this.j.e) - (afxVar13.f + this.i.e), this.f.m);
                    afk afkVar5 = this.d;
                    int i42 = afkVar5.w;
                    int max = Math.max(afkVar5.v, min);
                    if (i42 > 0) {
                        max = Math.min(i42, max);
                    }
                    this.f.c(max);
                }
                if (this.f.i) {
                    afx afxVar14 = (afx) this.i.k.get(0);
                    afx afxVar15 = (afx) this.j.k.get(0);
                    int i43 = afxVar14.f;
                    afx afxVar16 = this.i;
                    int i44 = afxVar16.e + i43;
                    int i45 = afxVar15.f;
                    int i46 = this.j.e + i45;
                    float f7 = this.d.ad;
                    if (afxVar14 == afxVar15) {
                        f7 = 0.5f;
                    }
                    if (afxVar14 != afxVar15) {
                        i45 = i46;
                    }
                    if (afxVar14 != afxVar15) {
                        i43 = i44;
                    }
                    afxVar16.c((int) (i43 + 0.5f + (((i45 - i43) - this.f.f) * f7)));
                    this.j.c(this.i.f + this.f.f);
                }
            }
        }
    }
}
