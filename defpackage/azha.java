package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azha extends ayqj implements aysz {
    final ayqb a;
    final Object b;

    public azha(ayqb ayqbVar, Object obj) {
        this.a = ayqbVar;
        this.b = obj;
    }

    @Override // defpackage.aysz
    public final aypy a() {
        azgw azgwVar = new azgw(this.a, this.b, true);
        ayrv ayrvVar = aynu.l;
        return azgwVar;
    }

    @Override // defpackage.ayqj
    public final void aa(ayqk ayqkVar) {
        this.a.aE(new azgz(ayqkVar, this.b));
    }
}
