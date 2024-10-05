package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azcq extends ayph {
    final aypv a;
    final ayrv b;

    public azcq(aypv aypvVar, ayrv ayrvVar) {
        this.a = aypvVar;
        this.b = ayrvVar;
    }

    @Override // defpackage.ayph
    protected final void V(aypi aypiVar) {
        azcp azcpVar = new azcp(aypiVar, this.b);
        aypiVar.se(azcpVar);
        this.a.Y(azcpVar);
    }
}
