package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azjj extends azfc {
    final ayrv b;

    public azjj(ayqb ayqbVar, ayrv ayrvVar) {
        super(ayqbVar);
        this.b = ayrvVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ayqb, java.lang.Object] */
    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        azrl e = azrl.e();
        try {
            ?? a = this.b.a(e);
            azji azjiVar = new azji(ayqdVar);
            a.aE(azjiVar);
            this.a.aE(new azjh(e, azjiVar));
        } catch (Throwable th) {
            aynu.c(th);
            aysa.h(th, ayqdVar);
        }
    }
}
