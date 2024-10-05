package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azbr extends ayqj implements aysy {
    final aypn a;
    final Callable b;

    public azbr(aypn aypnVar) {
        azqe azqeVar = azqe.a;
        this.a = aypnVar;
        this.b = azqeVar;
    }

    @Override // defpackage.aysy
    public final aypn a() {
        azbp azbpVar = new azbp(this.a, this.b);
        ayrv ayrvVar = aynu.j;
        return azbpVar;
    }

    @Override // defpackage.ayqj
    protected final void aa(ayqk ayqkVar) {
        try {
            this.a.aa(new azbq(ayqkVar, ((azqe) this.b).call()));
        } catch (Throwable th) {
            aynu.c(th);
            aysa.i(th, ayqkVar);
        }
    }
}
