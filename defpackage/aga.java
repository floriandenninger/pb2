package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aga extends agg {
    public aga(afk afkVar) {
        super(afkVar);
        afkVar.h.d();
        afkVar.i.d();
        this.g = ((afn) afkVar).aq;
    }

    private final void g(afx afxVar) {
        this.i.j.add(afxVar);
        afxVar.k.add(this.i);
    }

    @Override // defpackage.agg
    public final void b() {
        afk afkVar = this.d;
        afn afnVar = (afn) afkVar;
        int i = afnVar.b;
        int i2 = afnVar.c;
        float f = afnVar.a;
        if (afnVar.aq == 1) {
            if (i != -1) {
                this.i.k.add(afkVar.T.h.i);
                this.d.T.h.i.j.add(this.i);
                this.i.e = i;
            } else if (i2 != -1) {
                this.i.k.add(afkVar.T.h.j);
                this.d.T.h.j.j.add(this.i);
                this.i.e = -i2;
            } else {
                afx afxVar = this.i;
                afxVar.b = true;
                afxVar.k.add(afkVar.T.h.j);
                this.d.T.h.j.j.add(this.i);
            }
            g(this.d.h.i);
            g(this.d.h.j);
            return;
        }
        if (i != -1) {
            this.i.k.add(afkVar.T.i.i);
            this.d.T.i.i.j.add(this.i);
            this.i.e = i;
        } else if (i2 != -1) {
            this.i.k.add(afkVar.T.i.j);
            this.d.T.i.j.j.add(this.i);
            this.i.e = -i2;
        } else {
            afx afxVar2 = this.i;
            afxVar2.b = true;
            afxVar2.k.add(afkVar.T.i.j);
            this.d.T.i.j.j.add(this.i);
        }
        g(this.d.i.i);
        g(this.d.i.j);
    }

    @Override // defpackage.agg
    public final void c() {
        afk afkVar = this.d;
        if (((afn) afkVar).aq == 1) {
            afkVar.Y = this.i.f;
        } else {
            afkVar.Z = this.i.f;
        }
    }

    @Override // defpackage.agg
    public final void d() {
        this.i.b();
    }

    @Override // defpackage.agg
    public final boolean e() {
        return false;
    }

    @Override // defpackage.agg, defpackage.afv
    public final void f() {
        afx afxVar = this.i;
        if (afxVar.c && !afxVar.i) {
            afx afxVar2 = (afx) afxVar.k.get(0);
            afn afnVar = (afn) this.d;
            this.i.c((int) ((afxVar2.f * afnVar.a) + 0.5f));
        }
    }
}
