package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azio extends aypy {
    final ayqi a;
    final long b;
    final long c;
    final TimeUnit d;

    public azio(long j, long j2, TimeUnit timeUnit, ayqi ayqiVar) {
        this.b = j;
        this.c = j2;
        this.d = timeUnit;
        this.a = ayqiVar;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        azin azinVar = new azin(ayqdVar);
        ayqdVar.se(azinVar);
        ayqi ayqiVar = this.a;
        if (ayqiVar instanceof azpo) {
            ayqh a = ayqiVar.a();
            ayrz.g(azinVar, a);
            a.d(azinVar, this.b, this.c, this.d);
            return;
        }
        ayrz.g(azinVar, ayqiVar.d(azinVar, this.b, this.c, this.d));
    }
}
