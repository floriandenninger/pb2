package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azoj extends ayqh {
    volatile boolean a;
    private final aysb b;
    private final ayqw c;
    private final aysb d;
    private final azoz e;

    public azoj(azoz azozVar) {
        this.e = azozVar;
        aysb aysbVar = new aysb();
        this.b = aysbVar;
        ayqw ayqwVar = new ayqw();
        this.c = ayqwVar;
        aysb aysbVar2 = new aysb();
        this.d = aysbVar2;
        aysbVar2.d(aysbVar);
        aysbVar2.d(ayqwVar);
    }

    @Override // defpackage.ayqh
    public final ayqx a(Runnable runnable) {
        return this.a ? aysa.INSTANCE : this.e.i(runnable, 0L, TimeUnit.MILLISECONDS, this.b);
    }

    @Override // defpackage.ayqh
    public final ayqx c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.a ? aysa.INSTANCE : this.e.i(runnable, j, timeUnit, this.c);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.a;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.d.qc();
    }
}
