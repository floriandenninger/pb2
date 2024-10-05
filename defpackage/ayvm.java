package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayvm extends ayph {
    final long a;
    final TimeUnit b;
    final ayqi c;

    public ayvm(long j, TimeUnit timeUnit, ayqi ayqiVar) {
        this.a = j;
        this.b = timeUnit;
        this.c = ayqiVar;
    }

    @Override // defpackage.ayph
    protected final void V(aypi aypiVar) {
        ayvl ayvlVar = new ayvl(aypiVar);
        aypiVar.se(ayvlVar);
        ayrz.i(ayvlVar, this.c.c(ayvlVar, this.a, this.b));
    }
}
