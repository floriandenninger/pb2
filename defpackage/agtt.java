package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agtt implements aguh {
    private final aghu a;
    private final azrw b;
    private final azrw c;

    public agtt(azrw azrwVar, azrw azrwVar2, agzr agzrVar) {
        this.b = azrwVar;
        this.c = azrwVar2;
        this.a = (aghu) agzrVar.b.get();
    }

    @Override // defpackage.aguh
    public final ammv a(String str) {
        if (this.a.a()) {
            return ((agts) this.c.get()).a(str);
        }
        return ((agtz) this.b.get()).a(str);
    }

    @Override // defpackage.aguh
    public final List b(afsx afsxVar) {
        if (this.a.a()) {
            return ((agts) this.c.get()).b(afsxVar);
        }
        return ((agtz) this.b.get()).b(afsxVar);
    }

    @Override // defpackage.aguh
    public final void c(agtu agtuVar) {
        if (this.a.b()) {
            ((agtz) this.b.get()).c(agtuVar);
        }
    }

    @Override // defpackage.aguh
    public final void d() {
        if (this.a != aghu.MIGRATED) {
            ((agtz) this.b.get()).d();
        }
        if (this.a != aghu.DISABLED) {
        }
    }

    @Override // defpackage.aguh
    public final void e(agtu agtuVar) {
        ((agtz) this.b.get()).e(agtuVar);
    }

    @Override // defpackage.aguh
    public final void f(String str) {
        ((agtz) this.b.get()).f(str);
    }

    @Override // defpackage.aguh
    public final void g(agtu agtuVar) {
        if (this.a.b()) {
            ((agtz) this.b.get()).g(agtuVar);
        }
        aghu aghuVar = this.a;
        if (aghuVar == aghu.MIGRATED || aghuVar == aghu.DUAL_WRITE_READ_FROM_OLD_DB || aghuVar == aghu.DUAL_WRITE_READ_FROM_ENTITY_STORE) {
            ((agts) this.c.get()).g(agtuVar);
        }
    }
}
