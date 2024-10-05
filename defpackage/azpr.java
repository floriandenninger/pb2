package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azpr extends CountDownLatch implements aypq {
    public Object a;
    public Throwable b;
    public banx c;
    volatile boolean d;

    public azpr() {
        super(1);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.a == null) {
            this.a = obj;
            this.c.sd();
            countDown();
        }
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.c, banxVar)) {
            this.c = banxVar;
            banxVar.sj(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.banw
    public final void sh() {
        countDown();
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.a == null) {
            this.b = th;
        } else {
            aynu.j(th);
        }
        countDown();
    }
}
