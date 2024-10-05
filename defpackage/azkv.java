package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azkv extends AtomicReference implements Runnable, ayqd, ayqx {
    private static final long serialVersionUID = 786994795061867455L;
    final ayqd a;
    final long b = 300;
    final TimeUnit c;
    final ayqh d;
    ayqx e;
    volatile boolean f;
    boolean g;

    public azkv(ayqd ayqdVar, TimeUnit timeUnit, ayqh ayqhVar) {
        this.a = ayqdVar;
        this.c = timeUnit;
        this.d = ayqhVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.g) {
            aynu.j(th);
            return;
        }
        this.g = true;
        this.a.b(th);
        this.d.qc();
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.f || this.g) {
            return;
        }
        this.f = true;
        this.a.c(obj);
        ayqx ayqxVar = (ayqx) get();
        if (ayqxVar != null) {
            ayqxVar.qc();
        }
        ayrz.i(this, this.d.c(this, this.b, this.c));
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.d.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.e.qc();
        this.d.qc();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f = false;
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.e, ayqxVar)) {
            this.e = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.a.sh();
        this.d.qc();
    }
}
