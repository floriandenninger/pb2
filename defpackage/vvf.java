package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vvf implements vuo {
    public final vuq a;
    public CountDownLatch b;
    public volatile boolean c = false;

    public vvf(vuq vuqVar) {
        this.a = vuqVar;
    }

    @Override // defpackage.vuo
    public final void a() {
        this.c = false;
        CountDownLatch countDownLatch = this.b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override // defpackage.vuo
    public final void b() {
        this.c = true;
    }

    public final void c() {
        this.a.a(this);
    }
}
