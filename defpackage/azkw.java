package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azkw extends azfc {
    final TimeUnit b;
    final ayqi c;

    public azkw(ayqb ayqbVar, TimeUnit timeUnit, ayqi ayqiVar) {
        super(ayqbVar);
        this.b = timeUnit;
        this.c = ayqiVar;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        this.a.aE(new azkv(new azqs(ayqdVar), this.b, this.c.a()));
    }
}
