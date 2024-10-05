package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayws implements aypq, banx {
    final banw a;
    final long b;
    final TimeUnit c;
    final ayqh d;
    banx e;

    public ayws(banw banwVar, long j, TimeUnit timeUnit, ayqh ayqhVar) {
        this.a = banwVar;
        this.b = j;
        this.c = timeUnit;
        this.d = ayqhVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        this.d.c(new aywq(this, th), 0L, this.c);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        this.d.c(new aywr(this, obj), this.b, this.c);
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.e, banxVar)) {
            this.e = banxVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        this.e.sd();
        this.d.qc();
    }

    @Override // defpackage.banw
    public final void sh() {
        this.d.c(new aywp(this), this.b, this.c);
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        this.e.sj(j);
    }
}
