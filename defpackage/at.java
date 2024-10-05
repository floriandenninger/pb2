package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class at extends ar {
    public float af = -1.0f;
    public int ag = -1;
    public int ah = -1;
    private aq aj = this.j;
    public int ai = 0;

    public at() {
        this.q.clear();
        this.q.add(this.aj);
    }

    public final void A(int i) {
        if (this.ai == i) {
            return;
        }
        this.ai = i;
        this.q.clear();
        if (this.ai == 1) {
            this.aj = this.i;
        } else {
            this.aj = this.j;
        }
        this.q.add(this.aj);
    }

    @Override // defpackage.ar
    public final aq u(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                }
            }
            if (this.ai == 0) {
                return this.aj;
            }
            return null;
        }
        if (this.ai == 1) {
            return this.aj;
        }
        return null;
    }

    @Override // defpackage.ar
    public final void y(an anVar) {
        ar arVar = this.r;
        if (arVar == null) {
            return;
        }
        aq u = arVar.u(2);
        aq u2 = arVar.u(4);
        if (this.ai == 0) {
            u = arVar.u(3);
            u2 = arVar.u(5);
        }
        if (this.ag != -1) {
            anVar.g(an.c(anVar, anVar.e(this.aj), anVar.e(u), this.ag, false));
            return;
        }
        if (this.ah != -1) {
            anVar.g(an.c(anVar, anVar.e(this.aj), anVar.e(u2), -this.ah, false));
            return;
        }
        if (this.af != -1.0f) {
            ap e = anVar.e(this.aj);
            ap e2 = anVar.e(u);
            ap e3 = anVar.e(u2);
            float f = this.af;
            ak a = anVar.a();
            a.d.f(e, -1.0f);
            a.d.f(e2, 1.0f - f);
            a.d.f(e3, f);
            anVar.g(a);
        }
    }

    @Override // defpackage.ar
    public final void z() {
        if (this.r == null) {
            return;
        }
        int p = an.p(this.aj);
        if (this.ai != 1) {
            this.w = 0;
            this.x = p;
            q(this.r.h());
            k(0);
            return;
        }
        this.w = p;
        this.x = 0;
        k(this.r.d());
        q(0);
    }
}
