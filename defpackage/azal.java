package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azal extends ayvs {
    final ayro c;
    final Callable d;

    public azal(aypn aypnVar, Callable callable, ayro ayroVar) {
        super(aypnVar);
        this.c = ayroVar;
        this.d = callable;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        try {
            Object obj = ((aysq) this.d).a;
            aysw.b(obj, "The seed supplied is null");
            this.b.aa(new azak(banwVar, this.c, obj, aypn.a));
        } catch (Throwable th) {
            aynu.c(th);
            azpy.f(th, banwVar);
        }
    }
}
