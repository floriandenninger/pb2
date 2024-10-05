package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azgg extends aypy {
    final Callable a;

    public azgg(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        try {
            ayqb ayqbVar = (ayqb) this.a.call();
            aysw.b(ayqbVar, "null ObservableSource supplied");
            ayqbVar.aE(ayqdVar);
        } catch (Throwable th) {
            aynu.c(th);
            aysa.h(th, ayqdVar);
        }
    }
}
