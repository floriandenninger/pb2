package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azkn extends azfc {
    final ayrv b;
    final int c;

    public azkn(ayqb ayqbVar, ayrv ayrvVar, int i) {
        super(ayqbVar);
        this.b = ayrvVar;
        this.c = i;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        if (ayeq.q(this.a, ayqdVar, this.b)) {
            return;
        }
        this.a.aE(new azkm(ayqdVar, this.b, this.c));
    }
}
