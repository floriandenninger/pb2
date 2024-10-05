package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azhx extends aypy implements Callable {
    final Callable a;

    public azhx(Callable callable) {
        this.a = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object call = this.a.call();
        aysw.b(call, "The callable returned a null value");
        return call;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        ayto aytoVar = new ayto(ayqdVar);
        ayqdVar.se(aytoVar);
        if (aytoVar.e()) {
            return;
        }
        try {
            Object call = this.a.call();
            aysw.b(call, "Callable returned null");
            aytoVar.f(call);
        } catch (Throwable th) {
            aynu.c(th);
            if (!aytoVar.e()) {
                ayqdVar.b(th);
            } else {
                aynu.j(th);
            }
        }
    }
}
