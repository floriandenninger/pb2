package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afn extends afk {
    private boolean ar;
    public float a = -1.0f;
    public int b = -1;
    public int c = -1;
    public afj d = this.K;
    public int aq = 0;

    public afn() {
        this.S.clear();
        this.S.add(this.d);
        int length = this.R.length;
        for (int i = 0; i < 6; i++) {
            this.R[i] = this.d;
        }
    }

    @Override // defpackage.afk
    public final afj L(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                }
            }
            if (this.aq == 0) {
                return this.d;
            }
            return null;
        }
        if (this.aq == 1) {
            return this.d;
        }
        return null;
    }

    @Override // defpackage.afk
    public final void S(boolean z) {
        if (this.T == null) {
            return;
        }
        int o = afb.o(this.d);
        if (this.aq != 1) {
            this.Y = 0;
            this.Z = o;
            D(this.T.j());
            y(0);
            return;
        }
        this.Y = o;
        this.Z = 0;
        y(this.T.h());
        D(0);
    }

    public final void a(int i) {
        this.d.e(i);
        this.ar = true;
    }

    @Override // defpackage.afk
    public final void b(afb afbVar, boolean z) {
        afk afkVar = this.T;
        if (afkVar == null) {
            return;
        }
        Object L = afkVar.L(2);
        Object L2 = afkVar.L(4);
        afk afkVar2 = this.T;
        boolean z2 = afkVar2 != null && afkVar2.ap[0] == 2;
        if (this.aq == 0) {
            L = afkVar.L(3);
            L2 = afkVar.L(5);
            afk afkVar3 = this.T;
            z2 = afkVar3 != null && afkVar3.ap[1] == 2;
        }
        if (this.ar) {
            afj afjVar = this.d;
            if (afjVar.c) {
                aff b = afbVar.b(afjVar);
                afbVar.f(b, this.d.a());
                if (this.b != -1) {
                    if (z2) {
                        afbVar.g(afbVar.b(L2), b, 0, 5);
                    }
                } else if (this.c != -1 && z2) {
                    aff b2 = afbVar.b(L2);
                    afbVar.g(b, afbVar.b(L), 0, 5);
                    afbVar.g(b2, b, 0, 5);
                }
                this.ar = false;
                return;
            }
        }
        if (this.b != -1) {
            aff b3 = afbVar.b(this.d);
            afbVar.m(b3, afbVar.b(L), this.b, 8);
            if (z2) {
                afbVar.g(afbVar.b(L2), b3, 0, 5);
                return;
            }
            return;
        }
        if (this.c != -1) {
            aff b4 = afbVar.b(this.d);
            aff b5 = afbVar.b(L2);
            afbVar.m(b4, b5, -this.c, 8);
            if (z2) {
                afbVar.g(b4, afbVar.b(L), 0, 5);
                afbVar.g(b5, b4, 0, 5);
                return;
            }
            return;
        }
        if (this.a != -1.0f) {
            aff b6 = afbVar.b(this.d);
            aff b7 = afbVar.b(L2);
            float f = this.a;
            aez a = afbVar.a();
            a.e.g(b6, -1.0f);
            a.e.g(b7, f);
            afbVar.e(a);
        }
    }

    public final void c(int i) {
        if (this.aq == i) {
            return;
        }
        this.aq = i;
        this.S.clear();
        if (this.aq == 1) {
            this.d = this.f45J;
        } else {
            this.d = this.K;
        }
        this.S.add(this.d);
        int length = this.R.length;
        for (int i2 = 0; i2 < 6; i2++) {
            this.R[i2] = this.d;
        }
    }

    @Override // defpackage.afk
    public final boolean d() {
        return true;
    }

    @Override // defpackage.afk
    public final boolean e() {
        return this.ar;
    }

    @Override // defpackage.afk
    public final boolean f() {
        return this.ar;
    }
}
