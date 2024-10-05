package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azbn extends aypn {
    final ayqi b;
    final long c;
    final TimeUnit d;

    public azbn(long j, TimeUnit timeUnit, ayqi ayqiVar) {
        this.c = j;
        this.d = timeUnit;
        this.b = ayqiVar;
    }

    @Override // defpackage.aypn
    public final void ac(banw banwVar) {
        azbm azbmVar = new azbm(banwVar);
        banwVar.f(azbmVar);
        ayrz.j(azbmVar, this.b.c(azbmVar, this.c, this.d));
    }
}
