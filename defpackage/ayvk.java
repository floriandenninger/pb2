package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayvk extends ayph {
    final aypk a;
    final long b;
    final TimeUnit c;
    final ayqi d;

    public ayvk(aypk aypkVar, long j, TimeUnit timeUnit, ayqi ayqiVar) {
        this.a = aypkVar;
        this.b = j;
        this.c = timeUnit;
        this.d = ayqiVar;
    }

    @Override // defpackage.ayph
    public final void V(aypi aypiVar) {
        ayqw ayqwVar = new ayqw();
        aypiVar.se(ayqwVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        ayqwVar.d(this.d.c(new ayvi(this, atomicBoolean, ayqwVar, aypiVar), this.b, this.c));
        this.a.U(new ayvj(ayqwVar, atomicBoolean, aypiVar));
    }
}
