package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class agb extends agg {
    public agb(afk afkVar) {
        super(afkVar);
    }

    private final void g(afx afxVar) {
        this.i.j.add(afxVar);
        afxVar.k.add(this.i);
    }

    @Override // defpackage.agg
    public final void b() {
        afk afkVar = this.d;
        if (afkVar instanceof afh) {
            afx afxVar = this.i;
            afxVar.b = true;
            afh afhVar = (afh) afkVar;
            int i = afhVar.a;
            boolean z = afhVar.b;
            int i2 = 0;
            if (i == 0) {
                afxVar.l = 4;
                while (i2 < afhVar.ar) {
                    afk afkVar2 = afhVar.aq[i2];
                    if (z || afkVar2.ag != 8) {
                        afx afxVar2 = afkVar2.h.i;
                        afxVar2.j.add(this.i);
                        this.i.k.add(afxVar2);
                    }
                    i2++;
                }
                g(this.d.h.i);
                g(this.d.h.j);
                return;
            }
            if (i == 1) {
                afxVar.l = 5;
                while (i2 < afhVar.ar) {
                    afk afkVar3 = afhVar.aq[i2];
                    if (z || afkVar3.ag != 8) {
                        afx afxVar3 = afkVar3.h.j;
                        afxVar3.j.add(this.i);
                        this.i.k.add(afxVar3);
                    }
                    i2++;
                }
                g(this.d.h.i);
                g(this.d.h.j);
                return;
            }
            if (i == 2) {
                afxVar.l = 6;
                while (i2 < afhVar.ar) {
                    afk afkVar4 = afhVar.aq[i2];
                    if (z || afkVar4.ag != 8) {
                        afx afxVar4 = afkVar4.i.i;
                        afxVar4.j.add(this.i);
                        this.i.k.add(afxVar4);
                    }
                    i2++;
                }
                g(this.d.i.i);
                g(this.d.i.j);
                return;
            }
            if (i != 3) {
                return;
            }
            afxVar.l = 7;
            while (i2 < afhVar.ar) {
                afk afkVar5 = afhVar.aq[i2];
                if (z || afkVar5.ag != 8) {
                    afx afxVar5 = afkVar5.i.j;
                    afxVar5.j.add(this.i);
                    this.i.k.add(afxVar5);
                }
                i2++;
            }
            g(this.d.i.i);
            g(this.d.i.j);
        }
    }

    @Override // defpackage.agg
    public final void c() {
        afk afkVar = this.d;
        if (afkVar instanceof afh) {
            int i = ((afh) afkVar).a;
            if (i == 0 || i == 1) {
                afkVar.Y = this.i.f;
            } else {
                afkVar.Z = this.i.f;
            }
        }
    }

    @Override // defpackage.agg
    public final void d() {
        this.e = null;
        this.i.b();
    }

    @Override // defpackage.agg
    public final boolean e() {
        return false;
    }

    @Override // defpackage.agg, defpackage.afv
    public final void f() {
        afh afhVar = (afh) this.d;
        int i = afhVar.a;
        Iterator it = this.i.k.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((afx) it.next()).f;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.i.c(i3 + afhVar.c);
        } else {
            this.i.c(i2 + afhVar.c);
        }
    }
}
