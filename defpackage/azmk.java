package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azmk extends ayqj {
    final Callable a;

    public azmk(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.ayqj
    protected final void aa(ayqk ayqkVar) {
        try {
            ayqm ayqmVar = (ayqm) this.a.call();
            aysw.b(ayqmVar, "The singleSupplier returned a null SingleSource");
            ayqmVar.Z(ayqkVar);
        } catch (Throwable th) {
            aynu.c(th);
            aysa.i(th, ayqkVar);
        }
    }
}
