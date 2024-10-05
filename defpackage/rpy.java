package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rpy implements Runnable {
    final /* synthetic */ rpx a;
    final /* synthetic */ Callable b;

    public rpy(rpx rpxVar, Callable callable) {
        this.a = rpxVar;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.t(this.b.call());
        } catch (Exception e) {
            this.a.s(e);
        } catch (Throwable th) {
            this.a.s(new RuntimeException(th));
        }
    }
}
