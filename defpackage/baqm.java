package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baqm implements Runnable {
    final /* synthetic */ baql a;
    final /* synthetic */ Callable b;
    final /* synthetic */ baqk c;
    final /* synthetic */ CountDownLatch d;

    public baqm(baql baqlVar, Callable callable, baqk baqkVar, CountDownLatch countDownLatch) {
        this.a = baqlVar;
        this.b = callable;
        this.c = baqkVar;
        this.d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a = this.b.call();
        } catch (Exception e) {
            this.c.a = e;
        }
        this.d.countDown();
    }
}
