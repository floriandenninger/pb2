package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azkz implements ayqd, ayqx {
    final ayqd a;
    final TimeUnit b;
    long c;
    ayqx d;

    public azkz(ayqd ayqdVar, TimeUnit timeUnit) {
        this.a = ayqdVar;
        this.b = timeUnit;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        long e = ayqi.e(this.b);
        long j = this.c;
        this.c = e;
        this.a.c(new azrf(obj, e - j, this.b));
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.d.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.d.qc();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.d, ayqxVar)) {
            this.d = ayqxVar;
            this.c = ayqi.e(this.b);
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.a.sh();
    }
}
