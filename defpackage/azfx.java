package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azfx extends azfc {
    final ayrv b;
    final int c;

    public azfx(ayqb ayqbVar, ayrv ayrvVar, int i) {
        super(ayqbVar);
        this.b = ayrvVar;
        this.c = Math.max(8, i);
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        if (ayeq.q(this.a, ayqdVar, this.b)) {
            return;
        }
        this.a.aE(new azfw(ayqdVar, this.c));
    }
}
