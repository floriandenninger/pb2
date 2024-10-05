package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azla extends azfc {
    final TimeUnit b;

    public azla(ayqb ayqbVar, TimeUnit timeUnit) {
        super(ayqbVar);
        this.b = timeUnit;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        this.a.aE(new azkz(ayqdVar, this.b));
    }
}
