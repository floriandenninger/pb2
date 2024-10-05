package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aigy extends afww {
    public boolean a;
    private boolean b = true;
    private final anhy c;

    private aigy(anhy anhyVar) {
        this.c = anhyVar;
    }

    public static aigy g(anhy anhyVar) {
        return new aigy(anhyVar);
    }

    @Override // defpackage.anfm, defpackage.anhy
    public final void d(Runnable runnable, Executor executor) {
        if (this.a) {
            return;
        }
        this.c.d(runnable, executor);
    }

    @Override // defpackage.anfm, java.util.concurrent.Future
    public final Object get() {
        Object obj = this.c.get();
        this.b = false;
        return obj;
    }

    public final boolean h(boolean z) {
        if (this.b || z) {
            this.a = true;
            return true;
        }
        this.a = false;
        return false;
    }

    @Override // defpackage.anfm, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c.isCancelled();
    }

    @Override // defpackage.anfm, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Object obj = this.c.get(j, timeUnit);
        this.b = false;
        return obj;
    }
}
