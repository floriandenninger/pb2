package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azhh extends azfc {
    final ayrv b;
    final int c;
    final int d;

    public azhh(ayqb ayqbVar, ayrv ayrvVar, int i, int i2) {
        super(ayqbVar);
        this.b = ayrvVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        if (ayeq.q(this.a, ayqdVar, this.b)) {
            return;
        }
        this.a.aE(new azhg(ayqdVar, this.b, this.c, this.d));
    }
}
