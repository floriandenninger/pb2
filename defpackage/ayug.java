package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayug extends ayph {
    final Callable a;

    public ayug(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.ayph
    protected final void V(aypi aypiVar) {
        try {
            aypk aypkVar = (aypk) this.a.call();
            aysw.b(aypkVar, "The completableSupplier returned a null CompletableSource");
            aypkVar.U(aypiVar);
        } catch (Throwable th) {
            aynu.c(th);
            aysa.g(th, aypiVar);
        }
    }
}
