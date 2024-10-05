package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azlj extends ayqj implements aysz {
    final ayqb a;

    public azlj(ayqb ayqbVar) {
        this.a = ayqbVar;
    }

    @Override // defpackage.aysz
    public final aypy a() {
        azlh azlhVar = new azlh(this.a);
        ayrv ayrvVar = aynu.l;
        return azlhVar;
    }

    @Override // defpackage.ayqj
    public final void aa(ayqk ayqkVar) {
        try {
            this.a.aE(new azli(ayqkVar, azac.a()));
        } catch (Throwable th) {
            aynu.c(th);
            aysa.i(th, ayqkVar);
        }
    }
}
