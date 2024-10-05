package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class age extends agg {
    public final afx a;
    afy b;

    public age(afk afkVar) {
        super(afkVar);
        afx afxVar = new afx(this);
        this.a = afxVar;
        this.b = null;
        this.i.l = 6;
        this.j.l = 7;
        afxVar.l = 8;
        this.g = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0411  */
    @Override // defpackage.agg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.age.b():void");
    }

    @Override // defpackage.agg
    public final void c() {
        afx afxVar = this.i;
        if (afxVar.i) {
            this.d.Z = afxVar.f;
        }
    }

    @Override // defpackage.agg
    public final void d() {
        this.e = null;
        this.i.b();
        this.j.b();
        this.a.b();
        this.f.b();
        this.h = false;
    }

    @Override // defpackage.agg
    public final boolean e() {
        return this.k != 3 || this.d.t == 0;
    }

    public final void g() {
        this.h = false;
        this.i.b();
        this.i.i = false;
        this.j.b();
        this.j.i = false;
        this.a.b();
        this.a.i = false;
        this.f.i = false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d.ah);
        return valueOf.length() != 0 ? "VerticalRun ".concat(valueOf) : new String("VerticalRun ");
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
            m(afkVar.K, afkVar.M, 1);
            return;
        }
        afy afyVar = this.f;
        if (afyVar.c && !afyVar.i && this.k == 3) {
            afk afkVar2 = this.d;
            int i3 = afkVar2.t;
            if (i3 == 2) {
                afk afkVar3 = afkVar2.T;
                if (afkVar3 != null) {
                    if (afkVar3.i.f.i) {
                        afyVar.c((int) ((r5.f * afkVar2.A) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                afy afyVar2 = afkVar2.h.f;
                if (afyVar2.i) {
                    int i4 = afkVar2.X;
                    if (i4 == -1) {
                        f = afyVar2.f;
                        f2 = afkVar2.W;
                    } else if (i4 != 0) {
                        f = afyVar2.f;
                        f2 = afkVar2.W;
                    } else {
                        f3 = afyVar2.f * afkVar2.W;
                        afyVar.c((int) (f3 + 0.5f));
                    }
                    f3 = f / f2;
                    afyVar.c((int) (f3 + 0.5f));
                }
            }
        }
        afx afxVar = this.i;
        if (afxVar.c) {
            afx afxVar2 = this.j;
            if (afxVar2.c) {
                if (afxVar.i && afxVar2.i && this.f.i) {
                    return;
                }
                if (!this.f.i && this.k == 3) {
                    afk afkVar4 = this.d;
                    if (afkVar4.s == 0 && !afkVar4.J()) {
                        afx afxVar3 = (afx) this.i.k.get(0);
                        afx afxVar4 = (afx) this.j.k.get(0);
                        int i5 = afxVar3.f;
                        afx afxVar5 = this.i;
                        int i6 = i5 + afxVar5.e;
                        int i7 = afxVar4.f + this.j.e;
                        afxVar5.c(i6);
                        this.j.c(i7);
                        this.f.c(i7 - i6);
                        return;
                    }
                }
                if (!this.f.i && this.k == 3 && this.c == 1 && this.i.k.size() > 0 && this.j.k.size() > 0) {
                    int i8 = (((afx) this.j.k.get(0)).f + this.j.e) - (((afx) this.i.k.get(0)).f + this.i.e);
                    afy afyVar3 = this.f;
                    int i9 = afyVar3.m;
                    if (i8 < i9) {
                        afyVar3.c(i8);
                    } else {
                        afyVar3.c(i9);
                    }
                }
                if (this.f.i && this.i.k.size() > 0 && this.j.k.size() > 0) {
                    afx afxVar6 = (afx) this.i.k.get(0);
                    afx afxVar7 = (afx) this.j.k.get(0);
                    int i10 = afxVar6.f;
                    afx afxVar8 = this.i;
                    int i11 = afxVar8.e + i10;
                    int i12 = afxVar7.f;
                    int i13 = this.j.e + i12;
                    float f4 = this.d.ae;
                    if (afxVar6 == afxVar7) {
                        f4 = 0.5f;
                    }
                    if (afxVar6 != afxVar7) {
                        i12 = i13;
                    }
                    if (afxVar6 != afxVar7) {
                        i10 = i11;
                    }
                    afxVar8.c((int) (i10 + 0.5f + (((i12 - i10) - this.f.f) * f4)));
                    this.j.c(this.i.f + this.f.f);
                }
            }
        }
    }
}
