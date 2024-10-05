package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayyn extends ayvs {
    final ayrv c;
    final int d;

    public ayyn(aypn aypnVar, ayrv ayrvVar, int i) {
        super(aypnVar);
        this.c = ayrvVar;
        this.d = i;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        try {
            this.b.aa(new ayyl(banwVar, this.c, this.d, new ConcurrentHashMap()));
        } catch (Exception e) {
            aynu.c(e);
            banwVar.f(azqg.a);
            banwVar.b(e);
        }
    }
}
