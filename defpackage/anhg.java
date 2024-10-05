package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class anhg extends anhc implements anib {
    protected abstract anib f();

    @Override // defpackage.anhc
    protected /* bridge */ /* synthetic */ ExecutorService h() {
        throw null;
    }

    @Override // defpackage.anhc, java.util.concurrent.ExecutorService
    /* renamed from: pZ */
    public final anhy submit(Runnable runnable) {
        return f().submit(runnable);
    }

    @Override // defpackage.anhc, java.util.concurrent.ExecutorService
    /* renamed from: qa */
    public final anhy submit(Callable callable) {
        return f().submit(callable);
    }

    @Override // defpackage.anhc, java.util.concurrent.ExecutorService
    /* renamed from: qb */
    public final anhy submit(Runnable runnable, Object obj) {
        return f().submit(runnable, obj);
    }
}
