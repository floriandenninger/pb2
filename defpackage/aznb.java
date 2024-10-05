package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aznb extends ayph {
    final ayqm a;
    final ayrv b;

    public aznb(ayqm ayqmVar, ayrv ayrvVar) {
        this.a = ayqmVar;
        this.b = ayrvVar;
    }

    @Override // defpackage.ayph
    protected final void V(aypi aypiVar) {
        azna aznaVar = new azna(aypiVar, this.b);
        aypiVar.se(aznaVar);
        this.a.Z(aznaVar);
    }
}
