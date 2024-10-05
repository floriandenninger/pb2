package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azfp extends azfc {
    final Callable b;
    final ayrn c;

    public azfp(ayqb ayqbVar, Callable callable, ayrn ayrnVar) {
        super(ayqbVar);
        this.b = callable;
        this.c = ayrnVar;
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        try {
            Object call = this.b.call();
            aysw.b(call, "The initialSupplier returned a null value");
            this.a.aE(new azfo(ayqdVar, call, this.c));
        } catch (Throwable th) {
            aysa.h(th, ayqdVar);
        }
    }
}
