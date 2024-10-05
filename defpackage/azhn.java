package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azhn extends ayph implements aysz {
    final ayqb a;
    final ayrv b;

    public azhn(ayqb ayqbVar, ayrv ayrvVar) {
        this.a = ayqbVar;
        this.b = ayrvVar;
    }

    @Override // defpackage.ayph
    protected final void V(aypi aypiVar) {
        this.a.aE(new azhm(aypiVar, this.b));
    }

    @Override // defpackage.aysz
    public final aypy a() {
        azhk azhkVar = new azhk(this.a, this.b);
        ayrv ayrvVar = aynu.l;
        return azhkVar;
    }
}
