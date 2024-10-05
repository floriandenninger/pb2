package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azcx extends ayps implements Callable {
    final Callable a;

    public azcx(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.ayps
    protected final void Z(aypt ayptVar) {
        ayqx d = aynu.d();
        ayptVar.se(d);
        if (d.e()) {
            return;
        }
        try {
            Object call = this.a.call();
            if (d.e()) {
                return;
            }
            if (call == null) {
                ayptVar.sh();
            } else {
                ayptVar.sc(call);
            }
        } catch (Throwable th) {
            aynu.c(th);
            if (!d.e()) {
                ayptVar.b(th);
            } else {
                aynu.j(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.call();
    }
}
