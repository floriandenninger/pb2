package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azlp extends azfc {
    final ayro b;
    final ayqb c;

    public azlp(ayqb ayqbVar, ayro ayroVar, ayqb ayqbVar2) {
        super(ayqbVar);
        this.b = ayroVar;
        this.c = ayqbVar2;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        azqs azqsVar = new azqs(ayqdVar);
        azln azlnVar = new azln(azqsVar, this.b);
        azqsVar.se(azlnVar);
        this.c.aE(new azlo(azlnVar));
        this.a.aE(azlnVar);
    }
}
