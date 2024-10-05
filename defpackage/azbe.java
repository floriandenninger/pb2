package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azbe extends AtomicInteger implements aypq, banx {
    private static final long serialVersionUID = -4945480365982832967L;
    final banw a;
    final AtomicLong b = new AtomicLong();
    final AtomicReference c = new AtomicReference();
    final azbd e = new azbd(this);
    final azqf d = new azqf();

    public azbe(banw banwVar) {
        this.a = banwVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        azqb.f(this.e);
        ayeq.g(this.a, th, this, this.d);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        ayeq.h(this.a, obj, this, this.d);
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        azqb.j(this.c, this.b, banxVar);
    }

    @Override // defpackage.banx
    public final void sd() {
        azqb.f(this.c);
        azqb.f(this.e);
    }

    @Override // defpackage.banw
    public final void sh() {
        azqb.f(this.e);
        ayeq.e(this.a, this, this.d);
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        azqb.a(this.c, this.b, j);
    }
}
