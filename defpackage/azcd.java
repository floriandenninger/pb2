package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azcd extends ayps {
    final aypu a;

    public azcd(aypu aypuVar) {
        this.a = aypuVar;
    }

    @Override // defpackage.ayps
    protected final void Z(aypt ayptVar) {
        azcc azccVar = new azcc(ayptVar);
        ayptVar.se(azccVar);
        try {
            this.a.a(azccVar);
        } catch (Throwable th) {
            aynu.c(th);
            azccVar.a(th);
        }
    }
}
