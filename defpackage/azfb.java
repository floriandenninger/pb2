package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azfb extends aypy {
    final ayqm a;
    final ayrv b;

    public azfb(ayqm ayqmVar, ayrv ayrvVar) {
        this.a = ayqmVar;
        this.b = ayrvVar;
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        azfa azfaVar = new azfa(ayqdVar, this.b);
        ayqdVar.se(azfaVar);
        this.a.Z(azfaVar);
    }
}
