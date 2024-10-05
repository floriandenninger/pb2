package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azky extends azfc {
    final TimeUnit b;
    final ayqi c;

    public azky(aypy aypyVar, TimeUnit timeUnit, ayqi ayqiVar) {
        super(aypyVar);
        this.b = timeUnit;
        this.c = ayqiVar;
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        this.a.aE(new azkx(ayqdVar, this.b, this.c.a()));
    }
}
