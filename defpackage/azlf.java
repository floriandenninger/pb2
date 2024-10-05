package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azlf extends aypy {
    final ayqi a;
    final long b;
    final TimeUnit c;

    public azlf(long j, TimeUnit timeUnit, ayqi ayqiVar) {
        this.b = j;
        this.c = timeUnit;
        this.a = ayqiVar;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        azle azleVar = new azle(ayqdVar);
        ayqdVar.se(azleVar);
        ayrz.j(azleVar, this.a.c(azleVar, this.b, this.c));
    }
}
