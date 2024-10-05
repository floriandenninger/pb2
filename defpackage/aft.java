package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aft {
    public final afl b;
    public final ArrayList a = new ArrayList();
    private final afs c = new afs();

    public aft(afl aflVar) {
        this.b = aflVar;
    }

    public final void a(afl aflVar) {
        this.a.clear();
        int size = aflVar.aH.size();
        for (int i = 0; i < size; i++) {
            afk afkVar = (afk) aflVar.aH.get(i);
            if (afkVar.N() == 3 || afkVar.O() == 3) {
                this.a.add(afkVar);
            }
        }
        aflVar.c();
    }

    public final boolean b(agm agmVar, afk afkVar, int i) {
        this.c.i = afkVar.N();
        this.c.j = afkVar.O();
        this.c.a = afkVar.j();
        this.c.b = afkVar.h();
        afs afsVar = this.c;
        afsVar.g = false;
        afsVar.h = i;
        int i2 = afsVar.i;
        int i3 = afsVar.j;
        boolean z = i2 == 3 && afkVar.W > 0.0f;
        boolean z2 = i3 == 3 && afkVar.W > 0.0f;
        if (z && afkVar.u[0] == 4) {
            afsVar.i = 1;
        }
        if (z2 && afkVar.u[1] == 4) {
            afsVar.j = 1;
        }
        agmVar.a(afkVar, afsVar);
        afkVar.D(this.c.c);
        afkVar.y(this.c.d);
        afs afsVar2 = this.c;
        afkVar.F = afsVar2.f;
        afkVar.v(afsVar2.e);
        afs afsVar3 = this.c;
        afsVar3.h = 0;
        return afsVar3.g;
    }

    public final void c(afl aflVar, int i, int i2, int i3) {
        int i4 = aflVar.ab;
        int i5 = aflVar.ac;
        aflVar.C(0);
        aflVar.B(0);
        aflVar.D(i2);
        aflVar.y(i3);
        aflVar.C(i4);
        aflVar.B(i5);
        afl aflVar2 = this.b;
        aflVar2.c = i;
        aflVar2.T();
    }
}
