package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azfr extends ayqj implements aysz {
    final ayqb a;
    final Callable b;
    final ayrn c;

    public azfr(ayqb ayqbVar, Callable callable, ayrn ayrnVar) {
        this.a = ayqbVar;
        this.b = callable;
        this.c = ayrnVar;
    }

    @Override // defpackage.aysz
    public final aypy a() {
        azfp azfpVar = new azfp(this.a, this.b, this.c);
        ayrv ayrvVar = aynu.l;
        return azfpVar;
    }

    @Override // defpackage.ayqj
    protected final void aa(ayqk ayqkVar) {
        try {
            Object call = this.b.call();
            aysw.b(call, "The initialSupplier returned a null value");
            this.a.aE(new azfq(ayqkVar, call, this.c));
        } catch (Throwable th) {
            aysa.i(th, ayqkVar);
        }
    }
}
