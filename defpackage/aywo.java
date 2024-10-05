package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aywo extends ayvs {
    final long c;
    final TimeUnit d;
    final ayqi e;

    public aywo(aypn aypnVar, long j, TimeUnit timeUnit, ayqi ayqiVar) {
        super(aypnVar);
        this.c = j;
        this.d = timeUnit;
        this.e = ayqiVar;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        this.b.aa(new aywn(new azrv(banwVar), this.c, this.d, this.e.a()));
    }
}
