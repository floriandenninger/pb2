package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azew extends aypy {
    final aypy a;
    final ayrv b;

    public azew(aypy aypyVar, ayrv ayrvVar) {
        this.a = aypyVar;
        this.b = ayrvVar;
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        aypv aypvVar;
        ayqb ayqbVar = this.a;
        ayrv ayrvVar = this.b;
        if (ayqbVar instanceof Callable) {
            try {
                Object call = ((Callable) ayqbVar).call();
                if (call != null) {
                    aypvVar = (aypv) ayrvVar.a(call);
                    aysw.b(aypvVar, "The mapper returned a null MaybeSource");
                } else {
                    aypvVar = null;
                }
                if (aypvVar == null) {
                    aysa.f(ayqdVar);
                    return;
                } else {
                    aypvVar.Y(azeh.a(ayqdVar));
                    return;
                }
            } catch (Throwable th) {
                aynu.c(th);
                aysa.h(th, ayqdVar);
                return;
            }
        }
        ayqbVar.aE(new azev(ayqdVar, ayrvVar));
    }
}
