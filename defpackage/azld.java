package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azld extends azfc {
    final long b;
    final TimeUnit c;
    final ayqi d;

    public azld(aypy aypyVar, long j, TimeUnit timeUnit, ayqi ayqiVar) {
        super(aypyVar);
        this.b = j;
        this.c = timeUnit;
        this.d = ayqiVar;
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        azlb azlbVar = new azlb(ayqdVar, this.b, this.c, this.d.a());
        ayqdVar.se(azlbVar);
        azlbVar.f(0L);
        this.a.aE(azlbVar);
    }
}
