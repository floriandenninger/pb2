package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azbp extends ayvs {
    final Callable c;

    public azbp(aypn aypnVar, Callable callable) {
        super(aypnVar);
        this.c = callable;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        try {
            this.b.aa(new azbo(banwVar, ((azqe) this.c).call()));
        } catch (Throwable th) {
            aynu.c(th);
            azpy.f(th, banwVar);
        }
    }
}
