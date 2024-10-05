package defpackage;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adef implements Runnable {
    final List a;
    final CountDownLatch b;
    final adch c;

    public adef(List list, CountDownLatch countDownLatch, adch adchVar) {
        this.a = list;
        this.b = countDownLatch;
        this.c = adchVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.addAll(this.c.a());
        this.b.countDown();
    }
}
