package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rpz implements rpo, rpl, rpf {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // defpackage.rpf
    public final void b() {
        this.a.countDown();
    }

    @Override // defpackage.rpl
    public final void c(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.rpo
    public final void d(Object obj) {
        this.a.countDown();
    }
}
