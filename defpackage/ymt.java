package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ymt implements ynf {
    private final Executor a;

    public ymt(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.ynf
    public final /* synthetic */ Runnable a(Runnable runnable) {
        return runnable;
    }

    @Override // defpackage.ynf
    public final /* synthetic */ Callable b(Callable callable) {
        return callable;
    }

    @Override // defpackage.ynf
    public final void c(final Throwable th) {
        zga.d("Crashing on uncaught exception", th);
        this.a.execute(new Runnable() { // from class: yms
            @Override // java.lang.Runnable
            public final void run() {
                throw new RuntimeException("Crashing on uncaught exception", th);
            }
        });
    }

    @Override // defpackage.ynf
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.ynf
    public final /* synthetic */ void e(Throwable th) {
        yjk.i(this, th);
    }
}
