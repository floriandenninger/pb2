package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aywt extends ayvs {
    final long c;
    final TimeUnit d;
    final ayqi e;

    public aywt(aypn aypnVar, long j, TimeUnit timeUnit, ayqi ayqiVar) {
        super(aypnVar);
        this.c = j;
        this.d = timeUnit;
        this.e = ayqiVar;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        this.b.aa(new ayws(new azrv(banwVar), this.c, this.d, this.e.a()));
    }
}
