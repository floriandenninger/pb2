package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azge implements ayqd, ayqx {
    final ayqd a;
    final long b;
    final TimeUnit c;
    final ayqh d;
    ayqx e;
    ayqx f;
    volatile long g;
    boolean h;

    public azge(ayqd ayqdVar, long j, TimeUnit timeUnit, ayqh ayqhVar) {
        this.a = ayqdVar;
        this.b = j;
        this.c = timeUnit;
        this.d = ayqhVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.h) {
            aynu.j(th);
            return;
        }
        Object obj = this.f;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
        this.h = true;
        this.a.b(th);
        this.d.qc();
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.h) {
            return;
        }
        long j = this.g + 1;
        this.g = j;
        Object obj2 = this.f;
        if (obj2 != null) {
            ayrz.c((AtomicReference) obj2);
        }
        azgd azgdVar = new azgd(obj, j, this);
        this.f = azgdVar;
        ayrz.i(azgdVar, this.d.c(azgdVar, this.b, this.c));
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

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.e, ayqxVar)) {
            this.e = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.h) {
            return;
        }
        this.h = true;
        Object obj = this.f;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
        if (obj != null) {
            ((azgd) obj).run();
        }
        this.a.sh();
        this.d.qc();
    }
}
