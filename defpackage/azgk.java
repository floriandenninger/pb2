package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azgk implements ayqd, ayqx {
    final ayqd a;
    final long b;
    final TimeUnit c;
    final ayqh d;
    ayqx e;

    public azgk(ayqd ayqdVar, long j, TimeUnit timeUnit, ayqh ayqhVar) {
        this.a = ayqdVar;
        this.b = j;
        this.c = timeUnit;
        this.d = ayqhVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.d.c(new azgi(this, th), 0L, this.c);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        this.d.c(new azgj(this, obj), this.b, this.c);
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
        this.d.c(new azgh(this), this.b, this.c);
    }
}
