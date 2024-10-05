package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azjz extends aypy {
    final Object a;
    final ayrv b;

    public azjz(Object obj, ayrv ayrvVar) {
        this.a = obj;
        this.b = ayrvVar;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        try {
            ayqb ayqbVar = (ayqb) this.b.a(this.a);
            aysw.b(ayqbVar, "The mapper returned a null ObservableSource");
            if (ayqbVar instanceof Callable) {
                try {
                    Object call = ((Callable) ayqbVar).call();
                    if (call == null) {
                        aysa.f(ayqdVar);
                        return;
                    }
                    azjy azjyVar = new azjy(ayqdVar, call);
                    ayqdVar.se(azjyVar);
                    azjyVar.run();
                    return;
                } catch (Throwable th) {
                    aynu.c(th);
                    aysa.h(th, ayqdVar);
                    return;
                }
            }
            ayqbVar.aE(ayqdVar);
        } catch (Throwable th2) {
            aysa.h(th2, ayqdVar);
        }
    }
}
