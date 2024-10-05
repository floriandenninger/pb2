package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aywl extends aypn {
    final aypp b;
    final aypg c;

    public aywl(aypp ayppVar, aypg aypgVar) {
        this.b = ayppVar;
        this.c = aypgVar;
    }

    @Override // defpackage.aypn
    public final void ac(banw banwVar) {
        aywe aywjVar;
        aypg aypgVar = aypg.MISSING;
        int ordinal = this.c.ordinal();
        if (ordinal == 0) {
            aywjVar = new aywj(banwVar);
        } else if (ordinal == 1) {
            aywjVar = new aywh(banwVar);
        } else if (ordinal == 3) {
            aywjVar = new aywg(banwVar);
        } else if (ordinal == 4) {
            aywjVar = new aywi(banwVar);
        } else {
            aywjVar = new aywf(banwVar, aypn.a);
        }
        banwVar.f(aywjVar);
        try {
            this.b.a(aywjVar);
        } catch (Throwable th) {
            aynu.c(th);
            aywjVar.c(th);
        }
    }
}
