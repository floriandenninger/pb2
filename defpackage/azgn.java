package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azgn extends azfc {
    final ayrv b;
    final Callable c;

    public azgn(ayqb ayqbVar, ayrv ayrvVar, Callable callable) {
        super(ayqbVar);
        this.b = ayrvVar;
        this.c = callable;
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        try {
            this.a.aE(new azgm(ayqdVar, this.b, ((ayso) this.c).call()));
        } catch (Throwable th) {
            aynu.c(th);
            aysa.h(th, ayqdVar);
        }
    }
}
