package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azah extends aypn {
    final Object b;
    final ayrv c;

    public azah(Object obj, ayrv ayrvVar) {
        this.b = obj;
        this.c = ayrvVar;
    }

    @Override // defpackage.aypn
    public final void ac(banw banwVar) {
        try {
            banv banvVar = (banv) this.c.a(this.b);
            aysw.b(banvVar, "The mapper returned a null Publisher");
            if (banvVar instanceof Callable) {
                try {
                    Object call = ((Callable) banvVar).call();
                    if (call == null) {
                        azpy.b(banwVar);
                        return;
                    } else {
                        banwVar.f(new azpz(banwVar, call));
                        return;
                    }
                } catch (Throwable th) {
                    aynu.c(th);
                    azpy.f(th, banwVar);
                    return;
                }
            }
            banvVar.ab(banwVar);
        } catch (Throwable th2) {
            azpy.f(th2, banwVar);
        }
    }
}
