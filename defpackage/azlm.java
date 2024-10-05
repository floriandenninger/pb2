package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azlm extends azfc {
    final ayqb b;
    final int c;

    public azlm(ayqb ayqbVar, ayqb ayqbVar2, int i) {
        super(ayqbVar);
        this.b = ayqbVar2;
        this.c = i;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        azll azllVar = new azll(ayqdVar, this.c);
        ayqdVar.se(azllVar);
        this.b.aE(azllVar.d);
        this.a.aE(azllVar);
    }
}
