package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fpb implements gmf {
    private final axpg a;
    private final sxs b;
    private final awnw c;
    private final awnw d;

    public fpb(axpg axpgVar, sxs sxsVar, awnw awnwVar, awnw awnwVar2) {
        this.a = axpgVar;
        this.b = sxsVar;
        this.c = awnwVar;
        this.d = awnwVar2;
    }

    @Override // defpackage.gmf
    public final boolean oA(gmf gmfVar) {
        if (gmfVar instanceof fpb) {
            fpb fpbVar = (fpb) gmfVar;
            if (Objects.equals(this.d, fpbVar.d) && Objects.equals(this.c, fpbVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gmf
    public final ayph oz(int i) {
        sws a = swu.a();
        a.f = this.b;
        swu a2 = a.a();
        if (i != 2 || this.d == null) {
            if (i != 0 || this.c == null) {
                if (i != 1 || this.d == null) {
                    return ayph.f();
                }
                return ((sww) this.a.get()).b(this.d, a2);
            }
            return ((sww) this.a.get()).b(this.c, a2);
        }
        return ((sww) this.a.get()).b(this.d, a2);
    }
}
